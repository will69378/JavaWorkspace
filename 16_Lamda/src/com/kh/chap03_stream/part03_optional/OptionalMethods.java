package com.kh.chap03_stream.part03_optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMethods {
	
/*

Optional
	- 자바 8버전부터 추가 
	- 스트림에서 NPE, 기타 에러상황들을 방지하기 위한 용도로 사용하는 클래스
	- Optional은 데이터를 직접 다루는 대신 optional 객체를 통해 간접적으로 다룸
	- Optional을 객체로 사용할 때 Optional 내부에 데이터가 있는지 없는지 항상 확인하는 절차를 
	강제함으로서 에러를 방지
	- Optioanl 객체를 변수에 저장하여 관리할 때 변수명에 maybe, opt와 같은 Optional 타입을
	암묵적으로 제시함

 */

		
		
/*

Optional 객체 생성 방법
	1. Optional.empty() : 값이 비어있는 Optional 생성
	2. Optional.of(object) : null이 아닌 객체를 다음 Optional 생성
	3. Optional.ofNullable(object) : null일수도 있는 Optional 생성 


Optional 객체 내부 메서드들
	- get() : Optional 내부의 값을 반환하는 메서드 ( 값이 없다면 NoSuchElement 예외발생 )
	- getas자료형() : 해당 자료형의 값을 반환하는 메서드
	- orElse(T) : get()으로 꺼낼 값이 존재하지 않을 경우에  반환할 값
	- orElseGet(Supplier) : orElse에 경우에 반환할 값을 람다식으로 구현함
	- orElseThrow(Supplier) : get()으로 꺼낼값이 없을 때, 람다식을 통해 구현한 
	에러 객체를 호출
	
 */
	
	public static void main(String[] args) {
		
		OptionalMethods om = new OptionalMethods();
		om.test2();
	}
	
	
	
	
	public void test1() {
		List<String> list = Arrays.asList("홍길동","신사",null,"");
		list.stream().forEach
		(s -> System.out.println(s+" : "+getStringLength(s)));
	}
	
	public int getStringLength(String str) {
		Optional<String> maybeStr = Optional.ofNullable(str);
		
		return maybeStr
				.map( s -> s.length())
				.orElse(0);
			//.orElseThrow( () -> new RuntimeException(str) );
		
	}
	
	public void test2() {
		
		Member member = new Member();
		member.setEmail("will69378@gmail.com");
		
		Order order = new Order();
		order.setMember(member);
		
		System.out.println(getEmailOfMemberFromOrder(order));
		System.out.println(getEmailOfMemberFromOrder(null));
		System.out.println(getEmailOfMemberFromOrder(new Order()));
	}
	
	public String getEmailOfMemberFromOrder(Order order) {
		//Optional 없는 버전
//		if(order != null) {
//			Member member = order.getMember();
//			if(member != null) {
//				String email = member.getEmail();
//				return email;
//			}
//		}
//		return "email X";
		
		//Optional 사용한 버전
		return Optional
				.ofNullable(order)
				.map(o -> o.getMember())
				.map(m -> m.getEmail())
				.orElse("이메일이 존재하지 않습니다.");
		
	}
	
	static class Order {
        Member member;
        int count;
        public Order() {
        }
        public Member getMember() {
            return member;
        }
        public void setMember(Member member) {
            this.member = member;
        }
        public int getCount() {
            return count;
        }
        public void setCount(int count) {
            this.count = count;
        }
        public Order(Member member, int count) {
            super();
            this.member = member;
            this.count = count;
        }
        @Override
        public String toString() {
            return "Order [member=" + member + ", count=" + count + "]";
        }
    }
    static class Member {
        String id;
        String email;
        public Member() {
        }
        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Member(String id, String email) {
            super();
            this.id = id;
            this.email = email;
        }
        @Override
        public String toString() {
            return "Member [id=" + id + ", email=" + email + "]";
        }
    }
}
