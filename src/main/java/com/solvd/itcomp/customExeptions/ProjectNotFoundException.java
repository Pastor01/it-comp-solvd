package com.solvd.itcomp.customExeptions;

public class ProjectNotFoundException extends Exception {

	public ProjectNotFoundException() {
		super("Project not found with index: ");
		
	}

	public ProjectNotFoundException(String message) {
		super(message);
		
	}

	
}
