package com.kh.chap01_innerClass.part01_instance;

public class OuterClass {
	private String str = "외부 클래스 필드";
	private static String staticStr = "외부클래스 정적필드";
	private InnerClass inner;
	
	/*

인스턴스(객체) 내부 클래스
	- 필드(전역 변수)와 동일한 위치에 선언하는 내부클래스는 인스턴스 내부 클래스라고 한다.
	
	- 일반적으로 외부클래스에서만 사용하는 고유한 객체를 선언할 때 사용
	
	- 외부클래스의 보조적인 역할을 하는 클래스로 정의
	ex)  HashMap 내부의 Node, Keyset, EntrySet 등
	
	- 인스턴스 내부 클래스는 반드시 외부클래스에 의해 생성되어야함
	

정적(static) 내부 클래스 
	- 외부클래스가 로드되는 시점에서 정적 내부클래스도 함께 static 영역으로 저장된다.
	
	- 외부클래스에 종속적이지 않다
	
	- 하나의 클래스 파일에 다양한 클래스를 설계할 때 주로 사용한다(DTO)
	
	- 외부클래스와 무관하게 다른 클래스에서도 이용할 목적으로 사용한다
	
	- static을 붙여 저장공간을 heap에서 static으로 옮겨서 이렇게 사용 가능
	
	
DTO  ( Data Transfer Object )
	- 값을 전달하기 위해 사용하는 클래스
	- API 서버와 DB 서버 등에서 데이터를 송/수신 하기위한 용도의 객체들을 정의하는 클래스
	- VO 클래스와 다르게 데이터의 송/수신이 주 목적이기 때문에 불필요한 메서드들이 존재하지 않는다.
	(equals, hashcode, setter ... )
	- API 서버들에는 다양한 서비스들이 존재하며 각 서비스마다 요구하는 데이터의 형식 및 반환되는 응답의 형식이
	다양하기 때문에 이에 맞춰서 DTO 클래스를 설계시 굉장히 많은 양의 클래스들이 나온다.
	- 이렇게 너무 많은 DTO 클래스가 파일로 존재하면 관리가 힘들어지므로 필요한 클래스들을 하나의 파일로 모아서
	관리하는게 일반적이다.
	
	DTO와 VO의 차이점 : 목적이 다르다 ( DTO : 송수신, 즉 전달이 주목적 / 데이터를 활용하는게 주목적 
					

VO	 ( Value Object )
	- 가치가 있는 클래스를 표현하기 위한 목적으로 사용하는 클래스
	- 객체지향적으로 설계된 클래스
	- 어플리케이샨의 핵심적인 역할을 수행하는 클래스를 정의하는 클래스며 데이터의 불변성이
	 유지되어야 하기때문에 데이터를 중간에 변경할 수 있는 Setter 메서드는 정의 X
	 - 캡슐화 및 상속이 구현되어 있으며 equals와 hashcode등 객체의 기능을 정의하는 메서드들이 있다. 
	 
	 
빌더패턴
	- 자바의 객체생성방식의 단점을 보완하기 위해 고안된 객체생성 디자인 패턴
	- 정적 내부 클래스로 외부클래스의 필드를 초기화하고, 외부클래스 객체를 최종적으로 생성하여 반환하는 방식.
	- 매개변수 생성자가 많아지는 경우 사용을 고려하는 것이 좋다.
	

기존 객체 생성 및 초기화 방식
	1) 생성자를 이용한 객체 생성 및 초기화
		- 객체를 생성함에 매개변수를 전달하여 필드값을 초기화 하는 방식
		
		- 단점으로는 필드가 많을수록 만들어야하는 생성자가 많아질 수 있다.
		- 생성자 매개뱐수의 정보를 설명할 수 없기 때문에 잘못된 값이 추가될 위험이 있다.
		
	2) setter방식을 이용한 객체 초기화
		- 추가해야할 값의 정보를 확인할 수 있기 때문에 가독성을 좋으나 코드 길이가 길어질 수 있다.
		- 객체의 불변성을 해칠 수 있다.
	 */
	
	public OuterClass() {
		inner = new InnerClass();
	}
	
	private class InnerClass {
		private int num = 100;
		private static int sNum = 100;
		
		public void method() {
			System.out.println(num);
			System.out.println(str);
			System.out.println(staticStr);
			System.out.println(sNum);
		}
		
	}
	
	public void method() {
		inner.method();
	}
}
