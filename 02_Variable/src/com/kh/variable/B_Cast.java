package com.kh.variable;

public class B_Cast {
	/*
	 * (자료)형변환 : 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터의 값 처리 규칙 
	 * 1. 값 끼리 연산할때는 항상 같은 자료형끼리만 연산해야함
	 * 	=도 마찬가지로 왼쪽 오른쪽값의 자료형이 같아야함
	 * 	만약, 다르다면 한쪽을 형변환 해줘야함
	 * 
	 * 형변환의 종류
	 * 1. 자동형변환 : 프로그램에 의해 자동으로 형변환 진행되어서 직접 할 필요 X
	 * 작은 바이트의 자료형 => 큰 바이트의 자료형
	 * 
	 * 2. 강제형변환 : 자동형변환이 불가능할 때 직접 형변환 연산자를 사용하여 변환
 	 * 큰 바이트의 자료형 => 작은 바이트의 자료형
	 */
		
	public void autoCasting() {
		
		//1.int(4byte) -> double(8byte)
		
		int i1 = 10;
		double d1 = i1; // double 자료형으로 자동형변환
		System.out.println("d1 : "+ d1);
		
		int i2 = 1000;
		double d2 = 3.3;
		
		double result = i2 + d2;  //i2 자동형변환 되어서  result에 들어감
		System.out.println(result);
		
		
		//2.int(4byte) -> long(8byte)
		
		int i3 = 1000;
		long l3 = i3; //long으로 자동형변환 
		
		
		//3. long(8byte) -> float(4byte) * 특이케이스! *
		
		//실수는 지수표기법을 사용하기 때문에 byte는 long이 더 크지만 float이 담을 수 있는 "값의 범위"가 크기에 자동형변환이 가능하다
		long l5 = 1000000000L;
		float f5 = l5;
		
		//4. char(2byte) <-> int(4byte) * 특이케이스 *
		
		char ch = 65; //65를 문자로 변환하면 아스키 코드에 의해 A로 변환
		System.out.println(ch);
		int num = '민';//48124로 변환되어서 나옴
		System.out.println(num);
		
		//5. byte와 short
		
		byte b1 = 17;
		byte b2 = 12;
		
		//자바에서 byte와 byte의 연산, short와 short의 연산결과는 항상 "int"로 취급한다
		byte b3 =(byte) (b1 + b2); //강제형변환하면 가능함
	}
	
	public void forceCasting() {
		
		//1. double -> float 
		
		float f1 = 4.0f; //f를 뒤에 안써주면 double로 해석됨 또한, 값이 리터럴일때만 f를 사용
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		//2. double -> int 
		
		double d3 = 10.89;
		int i3 = (int) d3; // 10.89의 소수점 부분은 날라가서 10만 출력
		System.out.println(i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum;
		//해결방법 1. 연산결과를 int에 맞춰 강제형변환
		int iSum1 =(int) (iNum + dNum);
		
		//해결방법 2. dNum을 int로 강제형변환
		int iSum2 = iNum + (int)dNum;
	}
	
}
