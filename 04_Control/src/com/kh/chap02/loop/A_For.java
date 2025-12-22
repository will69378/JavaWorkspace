package com.kh.chap02.loop;

import java.util.Random;

public class A_For {
	/*
	  <반복문>
	  
	  실행할 코드를 반복적으로 수행시킬 수 있도록 도와주는 제어문
	  크게 for문과 while문으로 나뉨
	  
	  [표현법]
	 for(초기식; 조건식; 증감식) {
	 	반복적으로 수행할 코드
	 }
	 
	 - 초기식 : 반복문이 시작될 때 초기에 한번만 실행되는 구문
	 	(반복문에서 사용할 변수를 선언 및 초기화)
	 
	 ex) int i = 0;
	 
	 - 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 	조건식이 true일 경우 반복문이 수행됨
	 	조긴식이 false인 경우 반복문 종료
	 	(보통 초기식에서 제시된 변수를 사용하여 조건식을 작성)
	 
	 ex) i < 10;
	 
	 - 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 	(보통 초기식에서 제시된 변수를 증감함)
	 
	 ex) i++, i--, i+=2 etc)
	 
	 
	 for문 실행 흐름
	 
	 1. 초기식 실행
	 2. 조건식 실행
	 3-1. 조건식 결과가 참이라면 for문 내부 코드 실행
	 3-2. 조건식 결과가 거짓이라면 for문 종료
	 4. for문 내부 코드 실행 후 증감식 실행 
	 5. 조건식 다시 실행 후 증감식 실행의 반복
	 
	 */

	public void method1() {
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕");
		}
		
		for (int i = 0; i< 10; i += 2) {
			System.out.println("안녕");
		}
	}
	
	public void method2() {
		for(int i = 1; i<6; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void method3() {
		for (int i = 1; i <= 10; i +=2) {
			System.out.print(i+" ");
		}
	}
	
	public void method4() {
		int sum = 0;
		
		for(int i = 0; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
	}
	
	public void method5() {
		
		/*
		
		자바 기본 기능 중 Math 클래스의 random()을 호출하면 
		매번 다른 실수형의 랜덤 값을 얻음
		
		0.0 <= 랜덤값 <=1.0
		
		1 ~ 10의 랜덤값을 얻고 싶으면
		
		1. 10을 곱하기
		0.0 <= 랜덤값 < 10.0
		
		2. 1 더하기
		1.0 <= 랜덤값 < 11.0
		
		3. 소수점 버리기
		1 <= 랜덤값 < 11
		
		코드 = > 랜덤값 * 10 + 1
		10 : 출력하고자 하는 갯수
		1 : 시작숫자
		Math.random() * 출력할 갯수 + 시작수
		
		*/
		int random = (int)(Math.random() * 10 + 1);
		
		System.out.println("랜덤 값 : "+random);
		
		int sum = 0;
		for(int i = 1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("sum : "+sum);
	}
	public void method6() {
		String str = "hello"; //문자열의 길이 : 5
		
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public void method7() {
		for (int i = 2; i < 10; i++) {
			for(int i2 = 2; i2<10; i2++) {
				int result = i * i2;
				System.out.println(i + " X "+ i2 +" = " + result);	
			}
		}
	}
}
