package com.kh.operator;

public class B_InDecrease {

	/*
	 * 증감연산자(단항연산자) : ++, --
	 * 
	 * ++ : 변수에 있는 값을 1 증가
	 * 
	 * -- : 변수에 있는 값을 1 감소
	 * 
	 * ++변수 같은 형태를 전위연산자 : 선증감 후처리 변수++ 같은 형태를 후위연산자 : 선처리 후증감
	 */

	public void method1() {
		int num = 10;
		System.out.println("전위연산자 적용 전 num : " + num); // 결과 : 10
		System.out.println("1회 수행 : " + ++num); // 결과 : 11
		System.out.println("2회 수행 : " + ++num); // 결과 : 12
		System.out.println("3회 수행 : " + ++num); // 결과 : 13

		System.out.println("최종 num : " + num); // 결과 : 13

		int num2 = 10;
		System.out.println("후위연산 전 num2 : " + num2); // 결과 : 10
		System.out.println("1회 수행 : " + num2++); // 결과 : 10 / 이 문장 실행 후 : 11
		System.out.println("2회 수행 : " + num2++); // 결과 : 11 / 실행 후 : 12
		System.out.println("3회 수행 : " + num2++); // 결과 : 12 / 실행 후 : 13

		System.out.println("최종 num2 : " + num2); // 결과 : 13
	}

	public void method2() {
		int a = 10;
		int b = ++a; // 메모리 값을 증가 시켰기에 따로 저장 안해도 증가 유지

		System.out.println("a : " + a); // 11
		System.out.println("b : " + b); // 11

		int c = 10;
		int d = c++; // 일단 d에 10을 대입 후 c 증가

		System.out.println("c : " + c); // 11
		System.out.println("d : " + d); // 10
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = num1++ * 3;
		
		System.out.println(num1); //21
		System.out.println(result1); //60
	}
	
	public void method4(){
        int a = 10;
        int b =20;
        int c = 30;
        //주석으로 어떻게 출력될거같은지 생각하기
        System.out.println(a++); //10(11)
        System.out.println((++a) + (b++)); // 32 / a=12, b=20(21)
        System.out.println((a++)+(--b)+(--c)); //12(13) + 20 + 29 = 61
        System.out.printf("a: %d , b: %d, c: %d",a,b,c  ); //a : 13, b : 20, c : 29
    }
	
}
