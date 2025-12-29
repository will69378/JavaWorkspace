package com.kh.chap04.field.model.vo;

public class FieldTest3 {
	/*
	 
	 static 키워드는 특정 변수나 매서드를 static 메모리 영역에 "고정"시킨다
	 따라서 자주 사용하는 변수, 매서드를 static으로 관리하여 메모리 영역에 고정시켜두고
	 사용하면 효율이 좋고 가끔 사용되는 변수나 매서드를 static 영역에 보관하면 효율이 안좋다.
	 
	 즉, static은 프로그램 시작과 끝까지 있기에 자주 사용하는 변수나 매서드를 static에 넣으면 효율이 좋고
	 가끔 쓰는 변수나 매서드는 static에 안넣는게 낫다.
	 
	 final은 상수 즉, 변하지 않는 값을 쓸때 사용
	 대부분의 static 변수는 final과 함께 사용
	 
	 */
	
	public static String sta = "static 변수";
	
	public static final double PI = 3.14;
	
	public static void test() {
		System.out.println("테스트");
	}
}
