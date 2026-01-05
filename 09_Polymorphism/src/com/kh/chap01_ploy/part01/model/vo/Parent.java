package com.kh.chap01_ploy.part01.model.vo;

public class Parent {
	private int x;
	private int y;
	
	public Parent() {
		
	}

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("부모클래스의 매서드");
	}
	public void print() {
		System.out.println("부모클래스의 매서드");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
