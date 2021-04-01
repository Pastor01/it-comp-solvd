package com.solvd.itcomp.project;

import java.util.List;

import com.solvd.itcomp.personal.CEO;
import com.solvd.itcomp.personal.Developer;
import com.solvd.itcomp.personal.Tester;

public class Complex extends Project{

	private List<Project> projects;
	
	public Complex() {
	
	}

	public Complex(boolean finished, List<Developer> devs, List<Tester> testers, CEO ceo, List<Project> projects) {
		super(finished, devs, testers,ceo);
		this.projects=projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public double getCost() {
		
		double sum = this.getProjects().stream()
						.mapToDouble(proj -> proj.getCost())
						.sum();
		return sum;
	}

	@Override
	public void setFinished(boolean finished) {
		
		projects.stream()
			.forEach(proj -> proj.setFinished(finished));
	}

	@Override
	public void work() {
		projects.stream()
			.forEach(proj -> proj.work());
	}

}
