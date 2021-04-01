package com.solvd.itcomp.personal;




import java.util.Date;

import com.solvd.itcomp.interfaces.IMakeMeeting;
import com.solvd.itcomp.interfaces.IReserve;
import com.solvd.itcomp.itCompany.Department;
import com.solvd.itcomp.itCompany.Office;
import com.solvd.itcomp.project.Project;


public class CEO  extends Personal implements IReserve{

	

	@Override
	public void work(Project project) {
		//check the logs about the project
		
		project.setFinished(true);
	}

	public CEO() {
	
	}

	public CEO(String name, int id,Date birthday, Seniority seniority, float cost) {
		super(name, id, birthday, seniority, cost);

	}

	public void makeMeeting(Office o, String description,Department department, IMakeMeeting i) {
		i.makeMeeting(o, description, this,department);
		
	}

	public void report(String name, Object destiny, Personal emitter) {
		
		
	}

	public void reserve(CEO ceo, Office o) {
		//Can reserve a office for a conference
		
	}

	
}
