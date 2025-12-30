package com.kh.example.practice3.model.vo;

public class Circle {
	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius += 1;
		
	}
	
	public void getAreaOfCircle() {
		System.out.println((radius*2) * PI);
	}
	
	public void getSizeOfCircle() {
		System.out.println((radius * radius)* PI);
	}
}
