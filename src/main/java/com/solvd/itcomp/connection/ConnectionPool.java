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
	public static final Integer MAX_POOL= 5;
	
	public ConnectionPool() {
		connections = new LinkedBlockingQueue<Connection>(MAX_POOL);
		connectionCount = 0;
	}
	
	public void initConnection() {
		connections.add(new Connection(connectionCount));
		connectionCount++;
	}
	
	public synchronized Connection getConnection() throws InterruptedException {
		if(connections.size()==0 && connectionCount < MAX_POOL) {
			initConnection();
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
