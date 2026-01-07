package com.kh.chap02_string.controller;

public class D_StringMethod {
	
	public void method1() {
		String str1 = "Hello World";
		String str2 = "Hello World";
		
		/*
		 문자열에서 특정 문자를 뽑는 방법
		 
		 	- 문자열.charAt(문자열 위치)
		 	
		 
		 문자열과 문자열을 이어 주는 메서드
		 
		  	- 문자열.concat(문자열)
		  	
		  	String str2 = str1.concat(str2);
		  	
		  	
		  	
		 문자열의 1번부터 끝까지의 문자열을 추출하여 리턴
		 
		 	str1.substring(1번);
		 
		 문자열의 1번부터 2번까지의 문자열만 추출하여 리턴
		 
		 	str1.substring(1번,2번);
		 	
		 	
		 
		 문자열에서 1번을 2번으로 교체하여 반환 ( 1번과 2번의 자료형은 char )
		 
		 	str1.replace('1번', '2번');
		 	
		 
		 문자열의 앞과 뒤 공백을 제거한 문자열 리턴
		 	
		 	String str4 = "      J A V A     ";
		 	str4.trim();  === J A V A
		 	
		 
		 문자열을 대문자로 변경 : 문자열.toUpperCase();
		 	   소문자로 변경 : 문자열.toLowerCase();
		 	   
		 
		 문자열.toCharArray()
		 String으로 받은 문자열을 char 문자로 쪼갠 뒤 char[]배열에 순서대로 값을 넣어 반환
		 
		 char[] arr = str1.toCharArray();
		 
		 
		 static valueOf(String으로 바꾸고 싶은 자료형)
		 
		 int i = 1;
		 String.valueOf(i);  === "1"
		 
		 */
		
		String str4 = "      J A V A     ";
		int i = 0;
		char[] arr = str1.toCharArray();
		System.out.println(String.valueOf(i));
		System.out.println(str1.substring(0,5));
	}
}
