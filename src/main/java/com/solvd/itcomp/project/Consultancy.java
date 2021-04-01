package com.solvd.itcomp.project;

import java.util.List;
import com.solvd.itcomp.personal.CEO;
import com.solvd.itcomp.personal.Developer;
import com.solvd.itcomp.personal.Tester;

public class Consultancy extends Project{
	
	public Consultancy() {

	}


	public Consultancy(boolean finished, List<Developer> devs, List<Tester> testers,CEO ceo) {
		super(finished, devs, testers, ceo);
	}


	@Override
	public double getCost() {
		return this.getCeo().getCost();
	}


	@Override
	public void setFinished(boolean finished) {
		this.setFinished(finished);
		
	}


	@Override
	public void work() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
