package com.kh.variable;

public class A_Variable {

	//시급과 근무시간과 근무일수를 곱해 월급을 계산해주는 메서드
	public void printVariable() { 
		
		int pay = 9000; //=은 대입연산자로 대입할때 사용 ==이 양쪽이 같다.
		int time = 6;
		int day = 5;
		
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : " + pay);
		System.out.println("근무 시간 : " + time);
		System.out.println("근무 일수 : " + day);
		
		System.out.println("김지원1 : " + pay * time * day);
		System.out.println("김지원2 : " + pay * time * day);
		System.out.println("김지원3 : " + pay * time * day);
		System.out.println("김지원4 : " + pay * time * day);
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 가독성 확보
		 * 2. 재사용성 증대
		 * 3. 유지보수성 증대
		 */
		
	}
	
	public void declareVariable() {
		/*
		 * 변수의 선언
		 * [표현법]
		 * 자료형 변수명 ;
		 * 
		 * 자료형 : 어떤 값을 담아낼지 , 어떤 크기의 값을 담아낼지에 따라 다르게 저장
		 * ex) int, float, char 순서대로 정수, 실수, 문자를 담아냄 
		 * 
		 * 변수명 : 변수의 이름 지정
		 * 		해당 변수로 담아내는 값을 잘 표현해야 보기에 편하다 
		 * 
		 * 변수명 명명에 대하여
		 * 1. 변수명은 "영어 소문자"로 시작함
		 * 2. 낙타등 표기법을 사용함 
		 * 	ex) String userFirstname; 이어지는 단어에 첫글자를 대문자로 하는게 낙타등 표기법
		 * 
		 * 주의점 
		 * 1. 변수 선언은 클래스 아래 영역, 메서드 내부에서만 사용 가능
		 * 2. 같은 영역 안에서 동일한 이름의 변수명 사용 불가
		 * 3. 해당 영역 안에서 선언한 변수는 해당 영역에서만 사용 가능
		 * 
		 */
		
		
		//변수에 값을 대입하는 행위 : 초기화
		//자바에서는 변수를 반드시 초기화하고 사용해야한다. 선언만 해서는 안됨
		//1. 논리형 변수
		boolean isTrue; //이게 낙타등 표기법 ! 
		
		//2-1. 숫자형 변수 
		//1byte당 -2^8 ~ 2^8-1
	 	//2byte는 -2^16 ~ 2^16-1,4byte는 -2^32 ~ 2^32-1 이런식으로 증가
		byte bNum; 	//1byte
					
		short sNum; //2byte
		
		int iNum; //4byte
		
		long lNum; //8byte
		
		
		//2-2. 실수형 변수
		float fNum; //4바이트 소수점 7자리까지
		
		double dNum; //(대표자료형) 8바이트 소수점 15자리까지 정확도를 높일때 사용 
		
		//3. 문자형
		char ch; //2바이트 0~65, 535 아스키 코드
		//기본자료형 끝
		
		//4. 문자열 (참조자료형) 기본 자료형처럼 사용됨 * 추후 설명
		String str; 
		
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long, float은 값 뒤에 순서대로 L, f를 붙여준다 
		
		fNum = 4.0f;
		dNum = 8.0; //double은 대표자료형이라 뒤에 안붙임
		
		ch = 'A'; //문자형과 문자열은 ''와 "" 각각 사용
		str = "ABC";
		
	}
	
	public void initVariable()	{
		boolean isTrue = false; //논리형
		
		int longInteger = 999_999_999;  //_빼고 초기화됨
		byte bNum = 1;
		System.out.println(bNum);

		
		byte iNum = 127;
		
		bNum = (byte)(iNum + 15); //최대값인 127을 넘어가서 데이터 오버플로우가 일어나서 최소값으로 변하고 나머지 값을 더함
								  //127 + 1 = -128에 + 14를 해서 -114가 됨
		System.out.println(bNum);
	}
	
	public void constant() {
		
		int age = 20;
		age = 21;
		
		final int AGE = 21; //final은 변수의 값이 바뀌지않게 함
							//상수 값을 저장하고 있는 변수의 이름은 "대문자"로 작성한다.
		
	}
	
	
}
