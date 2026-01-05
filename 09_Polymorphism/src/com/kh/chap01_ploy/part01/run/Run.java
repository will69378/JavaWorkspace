package com.kh.chap01_ploy.part01.run;

import com.kh.chap01_ploy.part01.model.vo.*;

public class Run {
	public static void main(String[] args) {
		/*
		 
		 대입연산자 ( = )을 기준으로 왼쪽과 오른쪽의 자료형은 항상 같아야 한다.
		 
		 1. 부모타입 참조변수로 부모타입 객체를 다루는 경우
		 
		 
		 */
		
		System.out.println("1. 부모타입 참조변수로 부모 객체 다루기");
		
		Parent p1 = new Parent();
		
		p1.printParent();
		
		
		//2. 자식타입 참조변수로 자식타입 객체 다루기
		
		System.out.println("2. 자식타입 참조변수로 자식타입 객체 다루기");
		
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		
		//3. 부모타입 참조변수로 자식타입 객체를 다루는 방법
		System.out.println("3. 부모타입 참조변수로 자식타입 객체를 다루기");
		Parent p2 = (Parent)new Child1();
		
		p2.printParent();
		((Child1)p2).printChild1();
		
		/*
		 위에 같은 경우가 가능한 이유는 부모에 자식을 대입하려면 자식이 부모로 강제형변환이 이루어지기 때문
		 
		 클래스 간의 형변환
		 
		 1. UpCasting
		 	-자식타입에서 부모타입으로 자동 형변환
		 	-자동형변환이 이루어지므로 생략 가능
		 	ex) 자식객체.부모매서드();
		 		부모참조변수 = 자식객체;
		 		
		 2. DownCasting 
		 	-부모타입에서 자식타입으로 형변환 되는 경우
		 	-생략이 불가능하므로 강제 형변환 필수
		 	ex) ( (자식) 부모). 자식매서드();
		 */
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(3,1,2);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(3,2);
		arr2[1] = new Child2(1,4);
		
		//다형성이 적용되면 부모타입 래퍼런스로 다양한 자식 객체 받기 가능
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(3,2);
		arr[2] = new Child1(3,1,2);
		arr[3] = new Child2(1,4);
		
		for(int i = 0; i<arr.length; i++) {
			/*각 인덱스 별로 실제 참조하고 있는 자식클래스로 적절히 다운캐스팅 후, 매서드를 호출하기
			1. instanceof 자료형 연산자 사용하기
			 - 객체가 실제로 참조하고 있는 클래스를 확인하여 자료형과 같다면 ture 아니면 false를 반환
			2. 오버라이딩 이용하기
			
			동적 바인딩
				-프로그램이 실행되기 전에는 컴파일 단계에서 참조변수의 클래스의 매서드를 실행된다고 나오지만
				실제 runtime 단계에서는 자식객체 내부의 오버라이딩된 매서드를 찾아가서 실행하는 기능
			*/
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
				
			}else if(arr[i] instanceof Child2) {
				((Child2)arr[i]).printChild2();
			}
			
			arr[i].print();
			
			
			
		}
	}
}
