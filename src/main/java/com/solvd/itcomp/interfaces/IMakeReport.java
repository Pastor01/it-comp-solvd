package com.solvd.itcomp.interfaces;

import com.solvd.itcomp.project.Project;

public interface IMakeReport<D>{


	public void report(String message, D destiny, Project project);
	
}
