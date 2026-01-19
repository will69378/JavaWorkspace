package com.kh.chap01_innerClass.part03_local;

public class OuterClass3 {
	/*

지역 내부 클래스
	- 지역( Local ) 변수처럼 메서드 내부에 정의된 클래스
	- 메서드 안에서만 사용이 가능하며 메서드가 호출될때 생성
	- 지역내부 클래스 안에서 사용되는 지역변수는 상수( final )처럼 취급 ( 메모리 효율성을 위해 )
	
메모리 복습
	1) stack
		- 메서드 호출시 stack에는 메서드 프레임이 쌓임
		- 메서드 프레임 내부에는 지역변수를 위한 저장공간이 할당
		- 메서드 종료시에는 메서드 프레임이 제거되면서 지역변수의 저장공간도 함께 소멸

	2) static 키워드가 붙은 변수는 static 메모리 영역에 저장공간이 할당됨
		- static final ~  => static 메모리 내부의 constant pool에 할당됨
		final 키워드만 붙은 변수도 constant pool에 저장공간이 임시로 할당
	 */
	
	private String str = "일반필드";
	private static String staticStr = "정적필드";
	
	public Runnable getRunnable(int num2) {
		int local = 1;
		
		//local = 5;
		
		//지역변수는 지역 내부 클래스에서 사용되는 경우, final 예약어가 붙은 것처럼 취급함
		//왜냐하면 static 메모리에서 지역변수의 저장공간이 소멸한 후 참조를 유지하기 위해서
		
		class LocalInnerClass implements Runnable {
			private int num = 10;

			@Override
			public void run() {
				
				//지역변수는 메서드 종료시 스택 공간에서 함께 소멸
				System.out.println(local);
				System.out.println(num);
				System.out.println(num2);
				System.out.println(str);
				System.out.println(staticStr);
			}
		}
		return new LocalInnerClass();
		

	}
	
}
