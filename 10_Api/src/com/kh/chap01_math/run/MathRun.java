package com.kh.chap01_math.run;



public class MathRun {

	public static void main(String[] args) {
		double num1 = 4.349;
		double num2 = -4.56;
		
		//Math.ceil : 올림 
		System.out.println("올림 : "+Math.ceil(num1));
		
		//Math.round(double) : 반올림(정수로만 나옴)
		System.out.println("반올림 : "+Math.abs(num2));
		
		//Math.floor(double) : 버림
		System.out.println("버림 : "+Math.floor(num2));
		
		//Math.abs(int / double / long / float) : 절대값 (음수를 양수로, 양수를 양수로)
		System.out.println("절대값 : "+Math.abs(num2));
		
		//Math.min(숫자, 숫자) : 최소값 (둘중 작은 값 출력)
		System.out.println("최소값  : "+Math.min(num2, num1));
		
		//Math.max(숫자, 숫자) : 최대값 (둘중 큰 값 출력)
		System.out.println("최대값  : "+Math.max(num2, num1));
		
		//Math.sqrt(double) : 제곱근 
		System.out.println("제곱근 : "+Math.sqrt(num1));
		
		//Math.pow(숫자, 제곱 숫자) : 제곱 
		//          2,   10   = 2의 10제곱
 		System.out.println("제곱근 : "+Math.pow(num1, num1));
		
	}
	
}
