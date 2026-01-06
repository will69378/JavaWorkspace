package com.kh.chap02_abstract.part02.model.vo;

public class Mother extends Person implements Basic{

	private String babyBirth;
	
	public Mother() {
		
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	
	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()="
				+ super.toString() + "]";
	}

	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	

	@Override
	public void eat() {
		setWeight(getWeight()+10);
		setHealth(getHealth()-10);
	}

	@Override
	public void sleep() {
		setHealth(getHealth()+10);
	}
	
	
	
}
