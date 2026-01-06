package com.kh.chap02_abstract.part02.model.vo;

public class Baby extends Person implements Basic{
	
	
	public Baby() {
		
	}
	

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}


	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}


	@Override
	public void eat() {
		setWeight(getWeight()+3);
		setHealth(getHealth()+1);
	}
	

	@Override
	public void sleep() {
		setHealth(getHealth()+3);
	}
}
