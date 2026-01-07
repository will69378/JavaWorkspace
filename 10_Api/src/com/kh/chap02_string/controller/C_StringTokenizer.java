package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C_StringTokenizer {
	public void method1() {
		String str = "Java,Oracle,JDBC,HTML,Spring";
		
		/*
		 문자열에 구분자를 넣고 기준으로 분리 시키는 방법
		 
		 1. 문자열.spilt(구분자) : String[]
		 	- 분리된 문자열을 String[]에 담아줌
		 	
		 	String[] arr = str.split(",");
			
		
		2. 분리된 각각의 문자열들을 토큰으로 만들어 관리하는 법
			StringTokenizer stn = new StringTokenizer(문자열, 구분자);
			stn.countTokens()  == 토큰의 갯수
			stn.nextToken()   == 토큰을 한개 소비해 앞에서부터 하나씩 꺼낼 수 있음
			stn.hasMoreTokens()  ==  토큰을 한개씩 끝까지 소비하게 하는 메서드
		 */
		StringTokenizer stn = new StringTokenizer(str, ",");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
}
