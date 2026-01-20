package com.kh.chap01_constant.model.vo;

import java.util.Objects;

public class Car {
	private String name;
	private int carColor;
/*

상수 ( Constant )
	- final과 같이 값이 변하지 않는 변수
	- 저장하고 있는 값에 대해서 가독성과 전달력을 높이기 위해 사용
	- public static final 키워드를 사용하여 static 영역에 데이터를 저장하고 재사용한다
	- 일반적으로 상수값은 변수명을 통해 의미를 부여하고 실제 값은 정수값을 저장하는 경우가 많음
		ex) Calendar.YEAR = 1;


상수의 단점
	- 변수명을 통해 의미부여가 가능하지만 값 자체에는 의미가 없다
	- 따라서 상수가 많아질수록 관리가 힘들어진다
	- 들어가는 값에 대한 검증 기능이 없다.
	
그 외 상수의 단점
	- 비슷한 상수값을 하나의 변수로 관리할 수 없다
		ex) 다양한 어플리케이션에서 사용되는 상수값이 있을때, 이를 하나의 변수로 관리하고 싶은 경우
		JAVA에서는 boolean으로 관리하는 값을, Oracle에서는 true라는 문자열로 관리한다고 할때
		두 값은 하나의 묶음으로 처리해야한다
		
	- 상수마다 고유의 메서드를 사용할 수 없다.
	
상수 단점을 보완한 코딩 방식
	- 값 자체에 의미를 부여, 경중 기능을 추가, 고유한 메서드를 추가, 비슷한 값들을 하나로 모아서 관리
	- 상수를 객체로 보관 
 */

	public static final int BLACK = 0;
	public static final int RED = 1;
	public static final int BLUE = 2;
	
	public static final int GREEN = 3;
	public static final int YELLOW = 3;
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", carColor=" + carColor + "]";
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getCarColor() {
		return carColor;
	}

	public void setCarColor(int carColor) {
		this.carColor = carColor;
	}
	
	public void setColor(Color c) {
		this.carColor = c.getColor();
	}
}
