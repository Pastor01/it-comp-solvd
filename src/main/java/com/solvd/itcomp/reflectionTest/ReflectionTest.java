package com.solvd.itcomp.reflectionTest;

import java.util.List;

public class ReflectionTest {

	private int age;
	private String name;
	private double cost;
	private List<String> words;
	
	
	public ReflectionTest(int age, String name, double cost, List<String> words) {
		super();
		this.age = age;
		this.name = name;
		this.cost = cost;
		this.words = words;
	}
	
	public ReflectionTest() {
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<String> getWords() {
		return words;
	}
	public void setWords(List<String> words) {
		this.words = words;
	}
}
