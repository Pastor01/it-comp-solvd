package com.solvd.itcomp.interfaces;



import com.solvd.itcomp.personal.Developer;
import com.solvd.itcomp.project.*;

public class CheckDevs implements IFilter {

	private Developer dev;
	
	public CheckDevs() {
		
	}
	public CheckDevs(Developer dev) {
		this.dev= dev;
	}
	
	public Developer getSkill() {
		return this.dev;
	}
	
	
	public boolean check(Project p) {
		for(Developer d: p.getDevs()) {
			if(d.getId() == this.dev.getId()) {
				return true;
			}
		}
		return false;
	}

	
}
