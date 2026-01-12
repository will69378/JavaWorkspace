package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;
import com.kh.chap01_list.part01_arrayList.model.vo.MusicArtistDescending;

public class ListRun {
	/*
	 컬렉션 (Collection) 
	 	- 자료 구조가 내장되어 있는 클래스로 자에서 제공하는 자료구조를 담당하는 프레임워크
	 	- 데이터들이 새롭게 추가 또는 삭제 및 수정이 되는 기능들을 정의해놓은 툴
	 	
	 	
	 배열과 컬렉션의 차이점
	 	- 배열의 단점
	 		1. 같은 자료형 데이터만 저장 가능
	 		2. 배열의 크기를 수정할 수 없음
	 		3. 배열 내부의 값들을 조정하기 불편함
	 		
	 	- 컬렉션의 장점
	 		1. 여러 자료형의 값을 저장할 수 있음. ( 제네릭 설정을 통해 한가지 유형의 데이터만 저장도 가능 )
	 		2. 중간에 값을 추가하거나 삭제하는 등 배열 내부의 값들을 조작하기 편리한 메서드가 정의되어있음
	 		3. 크기에 대한 제약이 없다.   <=== 배열 깊은 복사를 알아서 해준다.
	 		
	 		
	 		
	 컬렉션의 3가지 분류
	 	List 계열
	 		- 담고자 하는 값만을 저장
	 		- 값을 저장 시 순서를 유지한다. (index 존재)
	 		- 중복값을 담아도 상관없다.
	 		- ArrayList, Vector(동기화 기능때문에 느림), LinkedList등이 존재
	 
	 	Set 계열
	 		- 담고자하는 값만 저장
	 		- 값 저장시 순서를 유지한다 (index 존재)
	 		- 중복값 허용 안함
	 		
	 		- HashSet : HashCode()를 기반으로 작동함
	 		- TreeSet 
	 	
	 	Map 계열
	 		- 담고자 하는 값(value)와 그 값을 저장하는 키(key)를 통해 저장
	 		- 값 저장시 순서를 유지 하지 않는다
	 		- key 값의 중복은 허용하지 않으나, value의 중복은 허용
	 		- HashMap, Propeties
	 	
	 	
	 자료 구조
	 	- 방대한 데이터를 효율적으로 다룰 때 필요한 개념
	 	
	 프레임워크
	 	- 효율적인 기능들이 적용되어 있는 툴
	 	
	 
	 */
	
	public static void main(String[] args) {
		
		
		/*
		 
		 제네릭 (  <E>  )
		 
		 	- 별도의 제네릭 설정없이 컬렉션 객체 생성시 제네릭은 Object로 설정된다.
		 	- 제네릭을 설정하면 설정한 타입의 값들만을 컬렉션에 담을 수 있다.
		 	
		 
		 제네릭을 설정하는 이유
		 1. 명시한 타입의 객체만 저장가능하도록 하여 "타입의 안정성"을 확보하기 위해서
		 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 직접 형변환하는 작업을 없애기 위해서
		 
		 ArrayList<Music> list = new ArrayList<>(3);
		 이럴 경우 Music만 가능
		 
		 
		 1. .add(E e) : 리스트의 끝( 초기화된 위치 기준 ) 에 전달된 e를 추가시켜주는 메서드
		 
		 2. .add(int index, E e)
		 	- 리스트에 전달되는 index 값 위치에 e를 추가하는 메서드
		 	- 크기를 넘어가도 크기를 확장해서 에러 없음
		 	- 중간에 값 추기시 알아서 기존 값들이 한칸씩 밀려나남
		 	- 하지만 추가를 할때 순차적으로 해줘야한다 갑자기 50번에 입력하면 에러남
		 	
		 3. .set(int index, E e)
		 	- 리스트에 해당 인덱스의 값을 전달되는 e로 변경시켜주는 메서드
		 	add가 추가라면 set은 변경이다
		 	
		 4. .remove(int index) : 리스트에 인덱스위치의 값을 삭제 시키는 메서드
		 
		 5. .size() 
		 	- 리스트에 초기화한 데이터 수를 반환하는 메서드
		 	
		 6. .get(int index) : E
		 	- 리스트에서 index 위치의 값을 반환해주는 메서드

		 7. .contains(E e) : boolean
		 	- String 의 contains와 같은 효과
		 	
		 8. .indexOf(E e) : int
		 	- 매개인자 요소가 몇번 인덱스에 있는지 그 값을 반환 ( 없다면 -1 )
		 	
		 9. sublist(int index1, int index2) 
		 	- subString과 비슷하게 index1부터 index2까지의 데이터를 추출한 새로운 sublist를 반환하는 메서드
		 	
		 10. addAll(Collection c) 
		 	- 리스트에 컬렉션에 있는 데이터를 모두 추가해주는 메서드
		 	
		 11. isEmpty() : boolean
		 	- 리스트가 비어있는지 체크하는 메서드
		 
		 12. clear()
		 	- 리스트에 저장한 모든 값을 비워주는 메서드
		 
		 13. Collections.sort(List list) 
		 	- 배열을 정렬해주는 메서드
		 	- 사전 등록 순서상으로 오름차순으로 정렬해줌
		 	Collections.sort(list3);
		 	
		 14. .reverseOrder();
		 	- 오름차순을 내림차순으로 바꾸듯이 메서드의 기능을 반전시킴
		 	Comparator<String> comp = Collections.reverseOrder();
		 	Collections.sort(list3, comp);
		 	
		 15. Collections.shuffle()
		 	- 내부 데이터를 섞는 메서드
		 	Collections.shuffle(list3);
		 	
		 	
		 반복문으로 출력하기
		 	1. for문을 이용한 반복문
		 	2. 향상된 for문을 이용한 반복문 
		 	3. Iterator : 컬렉샨 내부 인자를 Iterator에 담아서 관리하는 형식
		 */
		
	ArrayList<Music> list = new ArrayList<>(3);

		List<String> list3 = new ArrayList<String>();
		list3.add("나지원");
		list3.add("라지원");
		list3.add("가지원");
		list3.add("다지원");
		
		Collections.sort(list3);
		Collections.shuffle(list3);
		System.out.println(list3);
	 	
		Comparator<String> comp = Collections.reverseOrder();
		Collections.sort(list3, comp);
		
		Collections.shuffle(list3);
		System.out.println(list3);
	
		list.add(new Music("Tears","소찬휘"));
		list.add(new Music("와","이정현"));
		list.add(new Music("명","김현정"));
		
		System.out.println(list);
		
		list.add(0, new Music("바다의 왕자", "박명수"));

		
		System.out.println(list);
		
		list.set(0, new Music("순정", "코요테"));
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("데이터 수 : " +list.size());
		
		Music m = list.get(0);
		System.out.println(m);
		
		ArrayList<Integer> Iarr = new ArrayList<>(3);
		Iarr.add(1);
		Iarr.add(9);
		Iarr.add(900);
		System.out.println(Iarr.contains(9));
		
		System.out.println(Iarr.indexOf(900));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("============================================");
		for(Music mus : list) {
			System.out.println(mus);
		}
		System.out.println("============================================");
		
		Iterator<Music> iter = list.iterator();
		while(iter.hasNext()) {
			Music m3 = iter.next();
			System.out.println(m3);
		}
		
		System.out.println("============================================");
		
		List<Music> list2 = list.subList(0, 1);
		
		list.addAll(list2);
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());
		
		
		System.out.println("============================================");
		
		/*
		 
		 내가 만든 클래스 정렬하기 위한 방법
		 
		 1. comparable : 인터페이스 상속
		 	- VO클래스에 직접 상속시켜 사용
		 	- 해당 VO클래스의 기본정렬조건으로 사용된다.
		 	
		 
		 2. comparator : 인터페이스 상속
		 	- 기본정렬조건 외에 추가 정렬조건을 만들고자 할 때 사용
		 	- VO 클래스 외에 별도 클래스에 Comparator를 상속시켜서 구현한다
		 	- 여러개의 정렬조건을 만들 수 있다.
		 	
		 */
		
		Collections.sort(list);
		System.out.println(list);
		
		Comparator<Music> comp2 = new MusicArtistDescending();
		Collections.sort(list, comp2);
		System.out.println(list);
	}
}
