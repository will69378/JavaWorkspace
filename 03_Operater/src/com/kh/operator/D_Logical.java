package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	/*
	 * 논리 연산자
	 * 
	 * 논리 값 두개를 비교하는 연산자
	 * 
	 * 1. AND && : a && b -> a 와 b 모두가 참일 때만 true, 나머지는 false
	 * 
	 * 2. OR || : a || b -> a 와 b 둘 중 하나라도 참이거나 둘다 참이면 true, 나머지는 false
	 */

	Scanner sc = new Scanner(System.in);

	public void method1() {
		
		System.out.print("숫자를 하나 입력하세요.");
		
		int num = sc.nextInt();
 		
		// num의 값이 0보다 크면서 짝수일 때
		
		boolean result = (num > 0) && (num % 2 == 0) ;
		
		
	}
	
	public void method2() {
		
		//입력한 값이 1이상 100이하의 숫자인지 확인
		System.out.print("정수 : ");
		
		int x = sc.nextInt();
		
		boolean result = (x >= 1) && (x <= 100) ;
	}
	
	public void method3() {
		//사용자가 입력한 값이 y거나 Y인 경우 참, 아니면 거짓을 반환해라
		
		System.out.println("계속 진행하면 y를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
	}
	
	public void method4() {
		
		int num1 = 10;
		
		//중요 
		//AND 연산자의 경우 앞쪽 조건이 false면 뒤에 조건은 실행 자체를 하지않는다.
		
		boolean result1 = (num1 < 5) && (num1++ > 0); //false
		
		System.out.println("result1 : " + result1); //false
		System.out.println(num1); //10
		
		int num2 = 10;
		
		//중요
		//OR 연산자 또한 비슷하게 앞쪽 조건에서 이미 true가 나온다면 뒤쪽 조건 실행 안함
		boolean result2 = (num2 < 20) || (++num2 > 0); //true
		System.out.println(num2); //10
		
		
	}

}
