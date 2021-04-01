package com.solvd.itcomp.personal;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.itcomp.customExeptions.NoTimeToSleepException;
import com.solvd.itcomp.interfaces.IMakeMeeting;
import com.solvd.itcomp.interfaces.ItakeABreak;
import com.solvd.itcomp.itCompany.Department;
import com.solvd.itcomp.itCompany.Office;
import com.solvd.itcomp.message.Message;
import com.solvd.itcomp.project.Project;


public class Developer extends Personal implements ItakeABreak{

	private Logger log = LogManager.getFormatterLogger(Developer.class);
	private List<Message> messages;
	
	
	public Developer() {
	}

	public Developer(String name, int id, Date birthday,Seniority seniority,float cost) {
		super(name, id, birthday,seniority,cost);
	}
	
	public void takeABreak(int time) {
		
		try {
			if(time> 1000) {
				throw new NoTimeToSleepException();
			}else {
			 // The developer its taking a break
			}			
		} catch (NoTimeToSleepException e) {	
			log.info("The personal " + this.getName() + " its taking very long nap");
			log.warn(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void work(Project project) {
		try {
			Thread.sleep(100);
			project.setFinished(true);
		} catch (InterruptedException e) {
			log.error("Error during the develop of the project");
		}
		
	}

	public void makeMeeting(Office o, String description,Department department, IMakeMeeting i) {
		i.makeMeeting(o, description, this,department);
		
	}
	
	public void addMsj(Tester emitter, String message) {
		messages.add(new Message<Tester, Developer>(emitter,this,message));
	}
	
	public void showMessages() {
		messages.forEach(m -> log.info(m.getMessage()));
	}
	
}
