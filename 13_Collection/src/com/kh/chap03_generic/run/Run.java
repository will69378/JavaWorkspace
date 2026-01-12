package com.kh.chap03_generic.run;

import java.util.ArrayList;

public class Run {
	public static void main(String[] args) {
		/*

1. 제네릭 등장 이전 프로그래밍 방식
	- 컬렉션 데이터를 추가시 항상 Object 객체로 저장해야 했다
	- 저장된 데이터를 꺼내서 활용시에는 항상 강제형변환이 필요했다
	- 단, 형변환시에 잘못된 자료형으로의 형변환을 진행한다면 에러가 발생할 수 있었다
	List l = new ArrayList();
		for(Object o : l) {
			String s = (String) o;
		}
		
2. 제네릭 등장
	- 데이터의 자료형을 일반화 시켜서 여러 자료형을 다룰 수 있게 만든 문법
	
	- 클래스의 메서드의 반환형, 매개변수, 필드의 자료형들을 미리 확정
	짓지 않고 파라미터화 하여 나중에 지정할 수 있게 만드는 문법
	
	- 즉, 제네릭을 사용하면 다양한 자료형들을 저장할 수 있게 때문에 타입변수라고도 함
	
	- 제네릭을 사용하면 런타임이 아닌 컴파일 시점에서 에러를 캐치할 수 있으므로 타입안정성을 확보할 수 있다.

		 */
		
		List l = new ArrayList();
		for(Object o : l) {
			String s = (String) o;
		}
		
		
	}
}
