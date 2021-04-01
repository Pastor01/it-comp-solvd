package com.solvd.itcomp.interfaces;

import com.solvd.itcomp.itCompany.Department;
import com.solvd.itcomp.itCompany.Office;
import com.solvd.itcomp.personal.Personal;

@FunctionalInterface
public interface IMakeMeeting {
	
	public void makeMeeting(Office o,String description, Personal organizer, Department department);
}
