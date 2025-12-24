package com.kh.operator;

public class C_Compound {
	/*
	 * 복합 대입 연산자 산술 연산자와 대입연산자를 함께 사용하는 연산자 연산속도가 빨라지므르 사용을 권장(최적화)
	 */

	public void method() {
		int num = 12;

		num += 3; // == num = num + 3;

		//num 값 -5
		num -= 5;
		
		//num 값 곱하기 7
		num *= 7;
		
		//num 값 나누기 2
		num /= 2;
		
		//num을 4로 나누고 나머지 값 num에 대입
		num %= 4;
		
		// 오직 +=의 경우만 문자열 접합이 가능함!
		String str = "Hello";
		str += "World"; //str == "HelloWorld"
		
		
	}
}
