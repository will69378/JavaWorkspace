package com.kh.chap02_string.controller;

public class A_StringPool {
	/*
	 
	 String은 불변 클래스
	 
	 String은 기존에 담겨있던 값이 수정되는 순간 원래 담겨있던 공간에서 수정되지 않고
	 새로운 저장공간을 할당한 후 , 거기에 값을 추가함
	
	 문자열 상수 풀 ( String constant pool )
	  - 문자열 데이터가 담기는 영역으로 Heap 메모리 영역에 항상 고정적으로 할당됨
	 
	 print에는 주소값을 해석해서 출력하는 기능이 있고
	 String을 출력하면 toString이 자동으로 됨
	 
	 기존 hashcode()는 16진수 주소값을 10진수로 변환해줬는데
	 String의 hashcode()는 주소값이 아닌 문자열을 10진수로 변환하는걸로 오버라이딩 되어있음
	 
	 System.identifyHashCode(변수);는 실제 참조변수의 주소값을 확인하는 메서드
	 
	 자바에서는 문자열에 리터럴을 사용시 상수풀에 값을 저장함
	
	 문자열 상수풀 동작방식(jvm)
	 
	 1. 프로그램 실행 도중 문자열 리터럴을 만나면 값이 이미 상수풀에 있는 검사
	 2-1. 상수풀에 없다면 문자열의 hashCode 함수 호출하고 그 값을 상수들의 주소값으로 활용해서 값을 저장
	 2-2. 상수풀에 있다면 저장되어 있는 값의 주소값을 얕은 복사해서 반환함
	 
	 
	 hashCode 메서드를 오버라이딩한 이유
	 	- 문자열은 문자열 기반 hashCode 값을 상수풀 상의 주소값으로 사용
	 	  따라서 상수풀 안에 데이터를 저장할때 문자열을 hashCode 값으로 변환한 후 
	 	  중복 검사 후 값이 있으면 주소값을 변수에 할당, 없으면 상수풀에 새로 값 등록 및 그 값을 반환
	 */
	
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public void method2() {
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = "hello";
		String str4 = "world";
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
	
	/*
	 
	 String이 메모리 영역에서 차지하는 비중이 크기에 메모리가 부족할 때가 종종 있음
	 이걸 해결하기 위해 나온 기능이 문자열 상수 풀
	 
	 문자열 상수 풀로도 감당이 힘든 프로그램은 문자열보단 문자열 기반 기반 클래스인 
	 StringBuffer, StringBuilder를 사용 권장
	 
	 */
	
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "GoodBye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
	}
}
