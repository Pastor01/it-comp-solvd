package com.solvd.itcomp.personal;

public class Seniority {

	private float percentage;
	private String seniority;
	private int yearsExperiense;
	//could extend it with the previous seniority of some person
	
	
	public Seniority(String senority, int yearsExperiense,float percentage) {
		this.seniority = senority;
		this.yearsExperiense = yearsExperiense;
		this.percentage= percentage;
	}
	public Seniority() {
		
	}
	
	
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getSeniority() {
		return seniority;
	}
	
	public void setSeniority(String senority) {
		this.seniority = senority;
	}
	public int getYearsExperiense() {
		return yearsExperiense;
	}
	public void setYearsExperiense(int yearsExperiense) {
		this.yearsExperiense = yearsExperiense;
	}
	
}
