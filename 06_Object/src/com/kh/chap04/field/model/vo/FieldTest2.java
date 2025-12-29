package com.kh.chap04.field.model.vo;

public class FieldTest2 {
	/*
	 
	 접근제한자
	 
	 (+)public : 어떤 패키지든 어떤 클래스든 접근 가능
	 
	 (#)protected :  같은 패키지 내에서만 접근 가능
	 단, 다른 패키지에서도 상속받은 클래스라면 접근 가능
	 
	 (~)default : 같은 패키지 내에서만 접근 가능
	 접근제한자를 따로 안적으면 사용되는 기본값
	 
	 (-)private : 같은 클래스에서만 접근 가능
	 
	 */
	
	public String pub = "public";
	
	protected String pro = "protected";
	
	String def = "default";
	
	private String pri = "private";
	
}
