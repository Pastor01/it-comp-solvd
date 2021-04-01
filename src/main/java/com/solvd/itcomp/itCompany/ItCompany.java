package com.solvd.itcomp.itCompany;

import java.util.ArrayList;
import java.util.List;

import com.solvd.itcomp.customExeptions.ProjectNotFoundException;
import com.solvd.itcomp.personal.Personal;
import com.solvd.itcomp.project.*;

public class ItCompany {

	private List<Office> offices;
	private List<Project> project;
	private List<Personal> personal;
	
	public double getCost(int index) {
		return project.get(index).getCost();
	}
	
	public List<Office> getOffices() {
		return offices;
	}
	public void setOffices(List<Office> offices) {
		this.offices = offices;
	}
	public Project getProject(int index) {
		return project.get(index);
	}
	public void setProject(Project project) {
		this.project.add(project);
	}
	
	public ItCompany() {
		offices= new ArrayList<Office>();
		project = new ArrayList<Project>();
	}
	
	
	public void work(int index) {
		try {
			if(index< 0 || index > project.size()) {
				throw new ProjectNotFoundException();
			}else {
				project.get(index).work();
			}
			
		}catch(ProjectNotFoundException p) {
			
		}
		
	}

	public List<Personal> getPersonal() {
		return personal;
	}

	public void setPersonal(List<Personal> personal) {
		this.personal = personal;
	}
}
