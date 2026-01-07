package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		
		/*
		 여러 방법 존재
		 	
		 	1. replace
		 	str.replace(" ", "");
		 	
		 	2. spilt
		 	spilt으로 " "을 없애고 String배열에 들어간 값들을 합치기
		 */
		
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String result ="";
		while(stn.hasMoreTokens()) {
			result = result+stn.nextToken();
		}
		return result;
	}
	
	public String firstCap(String input) {
		String first = "";
		char ch = input.charAt(0);
		
		first = String.valueOf(ch).toUpperCase();
		first += input.substring(1);
		
		return first;
	}
	
	public int findChar(String str, char one) {
		int i = 0 ;
		char[] ch = str.toCharArray();
	
		for (int j = 0; j < ch.length; j++) {
			if(ch[j] == one) {
				i++;
			}
		}
		return i; 
	}
	
	
}
