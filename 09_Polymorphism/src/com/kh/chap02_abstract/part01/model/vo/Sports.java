package com.kh.chap02_abstract.part01.model.vo;

public abstract class Sports {
	private int people;
	
	/*
	 추상 매서드 
	 	- 추상 매서드가 존재한다면 클래스 또한 abstract 예약어를 넣어서 추상 클래스로 만들어야한다
	 	- 몸통부가 존재하지 않는 미완성된 매서드를 의미
	 	- 추상매서드를 정의하기 위해선, abstract 예약어를 추가해야함
	 	- 추상 메서드는 자식 클래스에서 "오버라이딩"으로 완성되며 자식 클래스에서
	 	상속받은 추상 메서드를 재정의하지 않으면 에러
	 	- 추상 메서드를 통해 클래스간의 통일성을 확보할 수 있다

	 	
	 추상 클래스
	 	- 추상 클래스를 상속받게 되면 추상클래스 내부의 미구현된 추상메서드들을 완성해야한다
	 	- 추상 클래스란 미완성된 부분이 존재하는 클래임을 의미
	 	- 내부에 실행 시킬 메서드가 없어 미완성된 클래스이기에 객체 생성 불가, 참조변수는 사용 가능
	 	- 추상 매서드가 존재한다면 클래스 또한 abstract 예약어를 넣어서 추상 클래스로 만들어야한다
	 	- 추상 클래스는 "일반 필드", "일반 메서드", "생성자", "추상 메서드"로 이루어져 있다
	 	- 추상 클래스는 클래스의 상속이 주된 목적이며 메서드 강제 구현은 겸사로 함
	 	
	 	
	 추상 클래스를 사용하는 경우
	 	- 부모 클래스를 상속받으면서 모든 자식 클래스에서 공통으로 구현해야하는 경우
	 	메서드 구현의 강제를 위해 추상 클래스를 사용한다.
	 	- 상속이 메인이고 메서드 강제는 겸사로 
	 	
	
 	 */
	
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public abstract void rule() {
		System.out.println("경기 규칙");
	}
	
	public int getPeople() {
		return people;
	}
	public void setPeople(int peolpe) {
		this.people = people;
	}
	
}






























