package com.kh.example.practice4.model.vo;

public class Student {
	
	private static int grade; 		
	private int classroom;	
	private String name;	
	private char gender;	
	private double height;	
	
	static {
		grade = 2;
	}
	
	{
	classroom = 5;
	name = "김지원";
	gender = '남';
	height = 173.0;
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.print(grade+"학년 " + classroom+"반 "+name+" "
				+gender+"자 "+height+"cm ");
	}
}
