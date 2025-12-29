package com.kh.chap02.encapsulation.model.vo;

public class Student {
	
		private String name;
		private int age;
		private double height;
		
		
		//name 필드에 값을 초기화하는 용도의 매서드
		//초기화를 위해선 값을 얻어와야 하므로 매개 변수 존재
		//초기화를 진행한 후 그 값을 반환할 필요는 없기에 반환형은 void
	
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			//매개 변수 : 매서드 호출 시 전달되는 값을 받아주기 위한 변수 선언 방법
			this.name = name;
		}

		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		
		
		
}
