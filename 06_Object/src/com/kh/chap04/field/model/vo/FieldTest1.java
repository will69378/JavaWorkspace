package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	
	/*
	 
	 	변수 구분
	 
	 - 전역 변수 : 클래스 영역 바로 아래에 선언하는 변수를 의미
	 			클래스 내부라면 어디서든 사용 가능
	 
	 - 지역 변수 : 클래스 영역 내에서 특정영역{{}}에 선언한 변수를 의미
	 			선언한 영역에서만 사용이 가능(if, 매서드, for...)
	 			
	 1. 전역 변수
	 
	 	- 필드 == 인스턴스 변수 == 전역 변수 	 
	 		생성 시점 : 객체가 메모리에 할당되면서 생성   (heap에 생성)
	 	  	소멸 시점 : 객체가 소멸할때 함께 소멸
	 	
	 	- 클래스 변수 == static 변수
	 		생성시점 : 프로그램 시작과 동시에 static 영역에 메모리 할당  (static에 생성)
	 		소멸시점 : 프로그램 종료
	 		
	 
	 2. 지역 변수
	 
	 	생성 시점 : 특정 영역이 실행될 때 저장 공간이 할당   (stack에 생성)
	 	소멸 시점 : 특정 영역이 끝날 때
	 
	 */
	
	private int global;
	
	public void test(int num) {
		
		int local = 0;
		
		if(true) {
			int a = 0;
		}
	
	FieldTest2 ft2 = new FieldTest2();
	System.out.println(ft2.pub);
	System.out.println(ft2.pro);
	System.out.println(ft2.def);
	//System.out.println(ft2.pri);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}