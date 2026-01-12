package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		/*

Set - 중복 값을 허용하지 않음
	- 저장된 순서를 보장하지 않는다 ( 인덱스가 없음 )

HashSet : 중복을 허용하지 않고, 빠르게 저장 및 조화가 가능한 자료 구조
LinkedHashSet : 중복을 허용하지 않지만, 저장된 순서를 유지함
TreeSet : 중복 허용 X, 오름차순 정렬을 기본값으로 지원 ( 바꾸기 가능 )

hashCode()
	- Object의 hashCode는 저장된 주소값을 10진수 형태로 변환하는 메서드
	- hashCode는 Hashmap, HashSet에서 데이터를 저장하기 위한 key 값에 사용되는 메서드
	- hashCode를 오버라이딩 하지 않고 equals에서만 오버라이딩하게 되면 논리적으로 두 객체는 같음을 판단할 수 있지만,
	데이터가 저장될떄는 서로 다른 주소값을 가지므로 중복으로 데이터가 저장됨
	
	- 즉, hashCode의 객체의 주소값으로 활용됨
	
HashSet에 객체를 저장하는 알고리즘
	1. 객체의 hashCode() 메서드로 객체를 저장할 위치 (주소값)을 찾는다
	2. 저장한 위치에 이미 저장된 값이 있다면 equals()를 통해 저장된 값과 새로 추가할 값이 같은지 검사한다
	(새로 추가할 값이 같은지 검사한다)
	3. 두 값이 같다면 데이터를 중복으로 저장하지 않고, 두 값이 다르다면 저장된 값의 다음 위치에 새로운 값을 저장한다
	
	
	Set 계열 반복문으로 뽑아내기
	
	1.	for(Student s : hs2) {
			System.out.println(s);
		}
		
	2.	Iterator<Student> iter = hs2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	
	List  <-->  Set	
		1. List에 Set 계열 데이터를 추가하는 방법 : 매개변수 생성자
		List<Student> list = new ArrayList<>(hs2);
		
		
		2. List에 Set 계열 데이터를 추가하는 방법 : addAll()
		List<Student> list2 = new ArrayList<Student>();
		list2.addAll(hs2);
		
	
	LinkedHashSet
		- 저장순서 유지
		Set<Integer> set1 = new LinkedHashSet<>();
		
	
	TreeSet
		- 데이터를 정렬 ( 기본 오름차순 ) 시켜서 보관
		Set<Integer> set2 = new TreeSet<>(set1);
		 */


		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("반갑습니다");
		hs1.add("반갑습니다");
		hs1.add("여러분");
		hs1.add("안녕하세요");
		hs1.add("여러분");

		System.out.println(hs1);
		System.out.println(hs1.size());
		System.out.println(hs1.remove("여러분"));
		System.out.println(hs1);

		Set<Student> hs2 = new HashSet<>();
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("공유", 40, 100));
		hs2.add(new Student("홍길동", 24, 60));
		hs2.add(new Student("김갑룡", 26, 49));
		
		System.out.println(hs2);
		
		Student s1 = new Student("홍길동", 24, 60);
		Student s2 = new Student("김갑룡", 26, 49);
		
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		Iterator<Student> iter = hs2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		List<Student> list = new ArrayList<>(hs2);
		
		List<Student> list2 = new ArrayList<Student>();
		list2.addAll(hs2);
		
		
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(4545);
		set1.add(111);
		set1.add(1);
		System.out.println(set1);
	
		Comparator<Integer> comp = Collections.reverseOrder();
		Set<Integer> set2 = new TreeSet<>(comp);
		set2.addAll(set1);
		
		System.out.println(set2);
	}
}
