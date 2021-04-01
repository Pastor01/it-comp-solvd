package com.solvd.itcomp.customExeptions;

public class NoTimeToSleepException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoTimeToSleepException() {
		super("Your time to rest its to long");
	}
	
	public NoTimeToSleepException(String message) {
		super(message);
	}
}
