package com.solvd.itcomp.personal;



import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.itcomp.customExeptions.TestingException;
import com.solvd.itcomp.project.Project;

public class Tester extends Personal{

	private Logger log = LogManager.getFormatterLogger(Tester.class);
	public Tester() {
		
	}

	public Tester(String name, int id, Date birthday,Seniority seniority,float cost) {
		super(name, id, birthday, seniority,cost);
		
	}

	@Override
	public void work(Project project) {
		try {
			if(Math.random()> 0.3) {
				project.setFinished(true);
				log.info("The test pass without a problem");
			}else {
				project.setFinished(false);
				throw new TestingException();//these its because i need it during execution
			}
		}catch(TestingException e) {
			log.warn("Some test dont pass");
			
		}	
	}
	
	
	
	
}
