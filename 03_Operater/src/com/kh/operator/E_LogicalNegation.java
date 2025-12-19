package com.kh.operator;

public class E_LogicalNegation {
	/*
	 * 논리 부정 연산자 == !(단항연산자)
	 * 
	 * 	!논리값
	 * 		논리값을 반대로 바꿔주는 연산자
	 */
	
	public void method() {
		System.out.println("true의 부정" + !true);
		
		boolean b = true; 
		boolean b2 = !b; //false
		
		boolean b3 = !(5 > 3); //false
		
		
	}
}
