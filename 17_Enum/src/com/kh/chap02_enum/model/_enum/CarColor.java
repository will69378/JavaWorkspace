package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

public enum CarColor {
	
	BLACK(0, "black") {
		@Override
		public void printTest() {
			System.out.println("검은색입니다");
		}
	},
	WHITE(1, "white") {
		@Override
		public void printTest() {
			System.out.println("하얀색입니다");
		}
	},
	RED(2, "red") {
		public void printTest() {
			System.out.println("빨간색입니다");
		}
	};
	
	/*
Enum = Enumeration ( 열거 ) : 클래스 내부의 상수값들을 열거하였기 때문에 enum 이라는 명칭을 쓴다.
객체 단위 상수값들을 간결하게 다루기 위해 고안됨


enum의 기능
	- enum 내부의 상수값들을 배열로 모아서 반환해주는 메서드
		values()
		
	 */

	
	private int color;
	private String name;
	
	
	//private을 쓰는 이유는 생성이 안된 값을 새로 생성하는 일이 없도록 하기 위해
	private CarColor(int color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public int getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	
	public static CarColor valueOf(int color) {
		return Arrays.stream(values())
		.filter(_enum -> _enum.color == color)
		.findFirst()
		.orElseThrow(() -> new RuntimeErrorException(null, "일치하는 컬러가 없습니다"));
	}
	
	public abstract void printTest();
	
}	
