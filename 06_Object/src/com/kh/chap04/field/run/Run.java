package com.kh.chap04.field.run;

import com.kh.chap04.field.model.vo.FieldTest1;
import com.kh.chap04.field.model.vo.FieldTest2;
import com.kh.chap04.field.model.vo.FieldTest3;

public class Run {
	public static void main(String[] args) {
		FieldTest1 ft1 = new FieldTest1();
		FieldTest2 ft2 = new FieldTest2();
		
		//System.out.println(ft2.pub);
		//protected와 default는 같은 패키지가 아니라 출력 X
		
		//static 필드 및 매서드 호출 방법
		//클래스명.static 필드명   or    클래스명.static 매서드()
		System.out.println(FieldTest3.PI);
		FieldTest3.test();
	}
}
