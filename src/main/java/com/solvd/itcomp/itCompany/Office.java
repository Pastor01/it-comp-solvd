package com.solvd.itcomp.itCompany;

import java.util.List;
import java.util.Objects;


import com.solvd.itcomp.enumerate.OfficeCapacities;


public class Office{

	private Direction direction;
	private List<Department> departments;
	private OfficeCapacities capacity;
	
	
	
	public Office(Direction direction,List<Department> departments,OfficeCapacities capacity ) {
		this.direction=direction;
		this.departments=departments;
		this.capacity=capacity;
	}
	
	@Override
	public String toString() {
		return "Office [Direction=" + direction + ", capacity=" + capacity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(direction,capacity);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null) return false;
		
		if(!(obj instanceof Office)) return false;
		
		Office r = (Office)obj;
		
		if(r.hashCode() != this.hashCode()) return false;
		
		if(r.getDirection()==direction && r.getCapacity()==capacity) return true;
		
		return false;

	}
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public List<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
		
	public OfficeCapacities getCapacity() {
		return this.capacity;
	}
	
}
