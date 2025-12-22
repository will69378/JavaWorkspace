package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 조건문 - 조건식을 통해 참 / 거짓을 판단하여 그에 해당하는 코드를 실행. - 조건식은 보통 비교연산자, 논리연산자를 사용하여 작성한다.
	 * - 조건문은 if / switch 문으로 나뉘어서 사용함.
	 */

	Scanner sc = new Scanner(System.in);

	public void method() {
		/*
		 * 단독 if문
		 * 
		 * [표현법] if(조건식) { 조건식이 true인 경우 실행할 코드 }
		 */

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수");
		}

		if (num <= 0) {
			System.out.println("양수가 아니다");
		}
	}

	public void method2() {
		/*
		 * if ~ else 문 if(조건식) { //조건식이 true인 경우 실행할 코드 } else { //조건식이 false인 경우 실행할 코드
		 * }
		 */
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");

		}
	}

	public void method3() {
		/*
		 * if - else if 문 같은 비교 대상으로 "여러개의 조건"을 제시해야 하는 경우 사용 if(조건식1) { 조건식1이 참인 경우 }
		 * else if(조건식2) { 조건식2이 참인 경우 } else if(조건식3) { 조건식3이 참인 경우 } else { 위의 조건들이 모두
		 * false인 경우 실행 }
		 */
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		// 조건식을 만족하는 순간 아래 코드들은 실행하지 않고 즉시 빠져나감

		// if - else if 없는 버전
		/*
		 * if (num > 0) { System.out.println(); } else { if (num < 0 ) {
		 * 
		 * } }
		 */

	}

	public void method4() {
		// 사용자가 입력한 나이를 가지고 어린이/청소년/성인/어르신 인지 출력
		// 13세이하 : 어린이 , 13세 초과 19세 이하 : 청소년, 19세 초과 60 이하 : 성인, 60 초과 :어르신

		System.out.print("나이를 입력하세요 : ");
		int num = sc.nextInt();

		if (num <= 13) {
			System.out.println("어린이");
		} 
		else if (num > 13 && num <= 19) {
			System.out.println("청소년");
		} 
		else if (num > 19 && num <= 60) {
			System.out.println("성인");
		} 
		else if (num > 60) {
			System.out.println("노인");
		} 
		else {
			System.out.println("다시 입력하세요");
		}
	}
	
	public void method5() {
		//성별과 이름을 입력받아, 이름과 성별을 출력
		//성별은 m/f로 입력받고 출력시에는 남자, 여자로 출력
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.println("성별(M/F) : ");
		char ch = sc.next().charAt(0);
		
		String result;
		if(ch == 'm' || ch == 'M') {
			result = "남자";
		}
		else if(ch == 'f' || ch == 'F') {
			result = "여자";
		}
		else {
			result = "";
			System.out.println("다시 입력");
		}
		
		System.out.println(name + "님은 " + result +"입니다");
	}

	public void method6() {
		//사용자에게 이름을 입력받아 본인 이름과 일치하는지 비교하기
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		String myname = "김지원";
		
		//주소값이 달라서 내용물이 같아도 다르다고 인식함
		/*if(name == myname) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		} */
		
		/*
		(중요) ! 기본자료형과 비교시 ==, != 사용가능함
		
		단 참조자료형(String) 은 동등 비교시 정상적인 비교 안됨
		참조자료형은 서로 값이 동일한지 비교할 때 .equals()를 사용
		
		*/
		
		if(name.equals(myname)) {
			System.out.println("일치");
		}
		else {
			System.out.println("불일치");
		}
	}
	
}
