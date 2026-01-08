package com.kh.exception.controller;

public class C_CustomException extends Exception{
	/*
	 특정 상황에서 발생하는 예외를 직접 만드는 방법
	 	
	 	1. 예외처리 클래스 생성 후 , Exception 클래스 상속 (extends Exception)
	 	
	 	2. super 키워드를 통해 부모 생성자에 매개변수로 메세지를 전달
	 	
	 	3. 부모 생성자에서 msg 내용을 호출하면서 예외처리
	 */
	
	public C_CustomException(String msg) {
		super(msg);
	}
	
}
