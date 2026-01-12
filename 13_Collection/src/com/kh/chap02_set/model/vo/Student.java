package com.kh.chap02_set.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;

	public Student() {

	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof ClassCastException) {
			
		}
		boolean result = false;
		
		Student s = (Student) o;
		
		if(this.name.equals(s.name) 
				&& this.age == s.age 
				&& this.score == s.score) {
			result = true;
		}
		return result;
	}
	
	
	
	
	@Override
	public int hashCode() {
		return (name + age + score).hashCode();
	}
}
