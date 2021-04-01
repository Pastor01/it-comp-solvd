package com.solvd.itcomp.personal;


import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.itcomp.customExeptions.SalaryZeroException;
import com.solvd.itcomp.enumerate.Days;
import com.solvd.itcomp.project.Project;

public abstract class Personal {

	private String name;
	private int id;
	private Date birthday;
	private Seniority seniority;
	private float cost;
	private List<Days> bussinesDays;
	
	private Logger log = LogManager.getLogger(Personal.class);
	
	public Personal() {
		
	}
	
	public Personal(String name, int id,Date birthday, Seniority seniority,float cost) {
		this.name= name;
		this.id= id;
		this.setBirthday(birthday);	
		this.seniority=seniority;
		try {
			this.setCost(cost);
		}catch(SalaryZeroException e) {
			log.error("The salary cant be less than 0");
		}
		
		
	}
	
	public void addBussinesDays(Days d) {
		this.bussinesDays.add(d);
		
	}
	
	public Seniority getSeniority() {
		return seniority;
	}

	public void setSeniority(Seniority seniority) {
		this.seniority = seniority;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public abstract void work(Project project);

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) throws SalaryZeroException{
		if(cost <= 0) {
			throw new SalaryZeroException();
			
		}
		this.cost = cost;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
