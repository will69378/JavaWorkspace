package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 	switch 문과 if 문의 차이점
	 	if(조건식) => 조건식을 복잡하게 기술 할 수 있음
	 	switch는 조건식이 없으며, 확실한 값의 변수만 기술함
	 
	 	[표현법]
	 	switch(동등비교 수행 대상) {
	 	case 값1 : 코드;
	 			break;
	 			
	 	case 값2 : 코드;
	 			break;
	 			
	 	default : 코드;


		switch문의 장점 
		
		case를 통해 내가 실행하길 원하는 코드로 바로 가기 떄문에 if~else보다 훨씬 빠르다
		
		switch문
		
		 - 자주 사용하지는 않지만, 정밀한 연산결과가 동일한 속도로 수행되어야 하는 경우에 사용함
		 - ex) 키보드, 마우스 입력할때 자주 사용됨
			
	 	}
	 
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("빨간불");
		}
		else if (num == 2) {
			System.out.println("파란불");
		}
		else if (num == 3) {
			System.out.println("초록불");
		}
		else {
			System.out.println("잘못 입력함");
		}
		
		switch (num) {
		case 1:
			System.out.println("빨간불");
			break;
		case 2:
			System.out.println("파란불");
			break;
		case 3:
			System.out.println("초록불");
			break;
			
		default:
			System.out.println("잘못 입력함");
			break;
		}
		
	}

	public void method2() {
		
		System.out.print("과일 : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch (fruit) {
		
		case "사과":
			price = 1000;
			break;
			
		case "포도":
			price = 2000;
			break;
			
		case "바나나":
			price = 3000;
			break;

		default:
			System.out.println("없습니다.");
			break;
		}
		System.out.println(fruit+"의 가격은 "+ price + "입니다");
	}
	


}
