package com.solvd.itcomp.connection;

import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectionPool {

	private Logger log = LogManager.getLogger(ConnectionPool.class);
	private int connectionCount;
	private BlockingQueue<Connection> connections;
	private static ConnectionPool instance;
	public static final Integer MAX_POOL= 5;
	
	private ConnectionPool() {
		connections = new LinkedBlockingQueue<Connection>(MAX_POOL);
		connectionCount = 0;
	}
	
	public static ConnectionPool getInstance() {
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
	
	public void initConnection() {
		connections.add(new Connection(connectionCount));
		connectionCount++;
	}
	
	public Connection getConnection() throws InterruptedException {
		synchronized(ConnectionPool.class) {
			if(connections.size()==0 && connectionCount < MAX_POOL) {
				initConnection();
			}	
		}
		return connections.take();
	}
	
	public void addConnection(Connection conection) {
		connections.offer(conection);
	}
	
	public void closeAll() {
		connections.forEach(connect -> {
			
			try {
				connect.closeConnection();
			} catch (SQLException e) {
				log.warn("Problem closing one connection", e);
			}
		});
		connections = new LinkedBlockingQueue<Connection>(MAX_POOL);
		connectionCount = 0;
	}
}
