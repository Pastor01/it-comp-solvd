package com.solvd.itcomp.personal;


import java.util.Date;

import com.solvd.itcomp.customExeptions.ConnectionException;
import com.solvd.itcomp.project.Project;

public class NetWorkService extends Personal{

	@Override
	public void work(Project project) {
		
		try {
			if(!project.isFinished()) {
				throw new ConnectionException();
			}else {
			 // upload the new content to the page
			}			
		} catch (ConnectionException e) {	
			
			e.printStackTrace();
		}
		
	}

	public NetWorkService() {
		super();
	}

	public NetWorkService(String name, int id, Date birthday, Seniority seniority, float cost) {
		super(name, id, birthday, seniority, cost);
		
	}

}
