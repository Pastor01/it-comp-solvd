package com.solvd.itcomp.itCompany;

import java.util.List;
import java.util.Vector;

import com.solvd.itcomp.personal.Personal;

public class Department {
	private String name;
	private Personal headOfDepartment;
	private List<Personal> members;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Personal getHeadOfDepartment() {
		return headOfDepartment;
	}
	public void setHeadOfDepartment(Personal headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	public List<Personal> getMembers() {
		return members;
	}
	public void setMembers(Vector<Personal> members) {
		this.members = members;
	}
	
}
