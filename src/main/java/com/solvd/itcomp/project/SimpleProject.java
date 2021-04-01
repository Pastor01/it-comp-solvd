package com.solvd.itcomp.project;

import java.util.List;

import com.solvd.itcomp.personal.CEO;
import com.solvd.itcomp.personal.Developer;
import com.solvd.itcomp.personal.Tester;

public class SimpleProject extends Project {


	private int sprints;
	
	public SimpleProject() {
	}

	public SimpleProject(boolean finished, List<Developer> devs, List<Tester> testers,CEO ceo,int sprints) {
		super(finished, devs, testers,ceo);
		this.sprints=sprints;
	}

	public int getSprints() {
		return sprints;
	}

	public void setSprints(int sprints) {
		this.sprints = sprints;
	}

	@Override
	public double getCost() {
		
		double total=this.getDevs().stream()
					.mapToDouble(dev -> {
						return dev.getCost();
					}).sum();
		
		total+= this.getTesters().stream()
			.mapToDouble(tes -> {
				return tes.getCost();
			}).sum();
		

		return total * sprints;
	}


	@Override
	public void setFinished(boolean finished) {
		this.setFinished(finished);
		
	}


	public void work() {
		this.getDevs().forEach(d -> d.work(this));
		this.getTesters().forEach(t -> t.work(this));
		
	}

}
