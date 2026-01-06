package com.kh.chap02_string.controller;

public class B_StringBuilderAndBuffer {
	/*
	 
	 StringBuilder와 StringBuffer
	 
	 문자열 기반 가변 클래스
	 
	  - 문자열의 메모리 부족을 해결 위한 클래스
	  - 두 클래스의 사용 방법은 동일
	  - 차이점은 동기화의 여부
	  - StringBuilder는 동기화X 그래서 멀티스레드 환경에서 낮은 안전성과 좋은 성능
	  - StringBuffer는 동기화를 지원하고 멀티스레드 환경에서 높은 안전성 낮은 성능
	 
	 */
	
	public void method1() {
		String str = "Hello";
		
		str += "World";
		
		StringBuilder sb1 = new StringBuilder("문자열");
		sb1.append("문자열열"); // 같은 저장공간에 이어 써짐
		sb1.append("문자열열열");
		
		StringBuffer sb2 = new StringBuffer("문자열");
		sb2.append("문자열열");
		sb2.append("문자열열열");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println("문자열의 길이는 ? "+sb1.length());
		System.out.println("문자열의 열의 마지막 위치는 ? "+sb1.lastIndexOf("열"));
		
		System.out.println("모든 글자 삭제 : "+sb1.delete(3, sb1.length()));
		
		System.out.println("마지막 위치의 문자 삭제하기 : " + sb1.deleteCharAt(sb1.length()-1));
	}
}
