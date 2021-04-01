package com.solvd.itcomp.project;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.solvd.itcomp.interfaces.IMakeReport;
import com.solvd.itcomp.personal.CEO;
import com.solvd.itcomp.personal.Developer;
import com.solvd.itcomp.personal.Tester;

public abstract class Project {

	private boolean finished;
	private List<Developer> devs;
	private List<Tester> testers;
	private CEO ceo;
	private Date inicDate;
	
	public Project() {
		
	}
	
	public Project(boolean finished, List<Developer> devs, List<Tester> testers, CEO ceo) {
		super();
		this.finished = finished;
		this.devs = devs;
		this.testers = testers;
		this.ceo=ceo;
		this.setInicDate(Calendar.getInstance().getTime());
	}

	public abstract void work();
	
	public CEO getCeo() {
		return ceo;
	}

	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}

	public abstract double getCost();
	
	public abstract void setFinished(boolean finished);


	public List<Developer> getDevs() {
		return devs;
	}

	public void setDevs(List<Developer> devs) {
		this.devs = devs;
	}

	public List<Tester> getTesters() {
		return testers;
	}

	public void setTesters(List<Tester> testers) {
		this.testers = testers;
	}

	public boolean isFinished() {
		return finished;
	}

	public void report(String message, IMakeReport<CEO> c) {
		c.report(message,this.getCeo() , this);
	}

	public Date getInicDate() {
		return inicDate;
	}

	public void setInicDate(Date inicDate) {
		this.inicDate = inicDate;
	}

	
	
}
