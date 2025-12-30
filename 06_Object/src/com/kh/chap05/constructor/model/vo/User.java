package com.kh.chap05.constructor.model.vo;

public class User {
	private String userid;
	private char gender;
	private int age;
	
	public User() {
		System.out.println("기본 생성자 호출");
	}
	
	public User(String userid) {
		this.userid = userid;
	}
	
	public User(String userid, int age, char gender) {
		this.userid = userid;
		this.age = age;
		this.gender = gender;
	}
	

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
