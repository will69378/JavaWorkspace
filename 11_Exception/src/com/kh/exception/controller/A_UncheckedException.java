package com.kh.exception.controller;

import java.util.Scanner;

public class A_UncheckedException {
	Scanner sc = new Scanner(System.in);
	/*
	 
	 UncheckedException 
	 	- RuntimeException처럼 프로그램 실행 시 발생하는 예외들이 대표적인 
	 	UncheckedException 계열의 예외들
	 	
	 	RuntimeException와 관련된 예외는 충분히 예측 가능한 상황이다.
	 	예외 처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결 가능
	 	굳이 예외처리 (예외 처리 코드)를 할 필요 없다
	 
	 
	 try - catch문
	 	- 예외가 발생했을 때 실행할 내용을 정의해 두는 문법
	 	
	 	try{
	 		예외가 발생할 수 있는 코드
	 	}
	 	catch(예외발생할 때 뜨는 예외 클래스    변수) {
	 		예외 발생시 실행 코드
	 	}
	 */
	
	public void method1() {
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		//조건문으로 예외 처리
		/*
		 * if(num2 == 0) { System.out.println("0으로 나눌 수 없음"); } else {
		 * System.out.println("나눗셈 연산 결과 : " + (num1 / num2)); }
		 */
		
		try {
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
}



















