package com.solvd.itcomp.message;

import com.solvd.itcomp.personal.Personal;

public class Message<T extends Personal, R extends Personal> {

	T transmitter;
	R receiver;
	String message;
	
	public Message(T transmitter, R receiver, String message) {
		super();
		this.transmitter = transmitter;
		this.receiver = receiver;
		this.message = message;
	}

	public T getTransmitter() {
		return transmitter;
	}

	public void setTransmitter(T transmitter) {
		this.transmitter = transmitter;
	}

	public R getReceiver() {
		return receiver;
	}

	public void setReceiver(R receiver) {
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
