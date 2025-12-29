package com.kh.chap03_class.model.vo;

public class Person {
	private String id, pwd, name, phone, email;
	private int age;
	private char gender;
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(this.name);
	}
	
}
