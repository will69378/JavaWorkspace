package com.kh.chap01_ploy.part01.model.vo;

public class Child1 extends Parent{
	private int z;
	
	public Child1() {
		
	}
	
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	
	public void printChild1() {
		System.out.println("Child1 매서드");
	}
	
	public void print() {
		System.out.println("오머라이딩한 자식 매서드");
	}
	
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
