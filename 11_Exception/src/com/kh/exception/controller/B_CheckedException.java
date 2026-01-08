package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 
	 CheckedException은 반드시 예외처리를 해줘야 하는 예외들
	 주로 외부매체 ( 키보드 ) 와의 입력시 발생
	 
	 Scanner와 비슷하지만 더 좋은 키보드로 값을 입력받을 수 있는 객체
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 
	 예외처리 방법
	 
	 1. try - catch문
	 	에러 발생 에측 지점에 씀
	 
	 2. throws 에러클래스
	 	객체 옆에 써서 사용자에게 에러를 떠넘김
	 */
	
	public void method1() {
		method2();
	}
	
	public void method2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("아무 문자열을 입력해 보세요 : ");
			String str = br.readLine();
			System.out.println("문자열의 길이 : "+str.length());
		}catch(IOException e) {
			System.out.println("예외");
		}
		
		
	}
}
