package com.kh.chap01_constant.model.vo;

//자동차의 색깔에 대한 상수값을 객체 형태로 관리하는 클래스
public class Color {
	public static final Color BLACK = new Color(0, "black");
	public static final Color WHITE = new Color(1, "white");
	public static final Color RED = new Color(2, "red") {
		
		public void method() {
			System.out.println("저는 red에만 존재하는 메서드입니다.");
		}
		
	};  
	// 익명 내부 클래스 ( inner 클래스 )로 메서드 만들기
	
	
	
	private int color;
	private String strColor;
	
	public Color(int color, String strColor) {
		super();
		this.color = color;
		this.strColor = strColor;
	}

	public int getColor() {
		return color;
	}

	public String getStrColor() {
		return strColor;
	}
	
	
	
}
