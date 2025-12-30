package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	
	public void method1() {
		System.out.println("매개 변수 X, 반환 값 X");
		
	}
	
	public int method2() {
		System.out.println("매개 변수 X, 반환 값 O");
		int rd = (int)(Math.random()*100+1);
		return rd;
	}
	
	public void method3(int x, int y) {
		
		System.out.println("매개 변수 O, 반환 값 X");
		
		int min = 0;
		int max = 0;
		
		if(x>y) {
			min = y;
			max = x;
		}else {
			min = x;
			max = y;
		}
		System.out.println("최소 값 : "+min+", 최대 값 : "+max);
	}
	
	public int method4(int x, int y) {
		return x * y;
	}
	
	
}
