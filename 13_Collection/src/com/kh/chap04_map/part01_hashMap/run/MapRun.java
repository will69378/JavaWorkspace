package com.kh.chap04_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.part01_hashMap.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		/*

HashMap
	- 많은 양의 데이터를 빠르게 저장하고 관리하기 위해서 사용하는 클래스로
	key값과 value값을 함께 저장한다.
	- 계층 구조상 List, Set 계열과 다른 Map 계열 인터페이스를 상속한 클래스로서 사용하는 메서드가 다르다
	- 데이터를 저장할 때 key, value를 한 쌍으로 저장하고 key를 통해 value가 저장된 위치에 접근한다.
	- key값의 중복을 허용하지 않는다. 
	- 동일한 key값에 데이터를 저장하면 마지막으로 추가된 value 값이 저장된다.
	
	HashMap<key, value> hm = new HashMap<>();
	
	
	1. put(K key, V value) : map 공간에 key, value를 세트로 추가하는 메서드 ( 일부 값은 같고 일부는 다르면 덮어쓰기한다 )
	
	2. get(K key) : V -> HashMap에서 key와 일치하는 value 값을 찾는 메서드
	
	3. size() : 초기화된 데이터 수 반환 = 크기
	
	4. replace(K key, V value)
		- HashMap에서 key 값과 일치하는 값을 찾아, 기존 value를 입력한 value로 교체한다
		
	5. remove(Key k) : key 값과 일치하는 값을 찾아서 제거해주는 메서드
					   key와 value를 함께 삭제
		 */
		
		HashMap<String, Snack> hm = new HashMap<>();
		hm.put("다이제", new Snack("초코맛", 800));
		hm.put("칸쵸", new Snack("초코맛", 400));
		hm.put("두쫀쿠", new Snack("초코맛", 450));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		hm.put("다이제", new Snack("초코맛", 900));
		
		System.out.println(hm);
		
		System.out.println(hm.get("두쫀쿠"));
		
		System.out.println(hm.size());
		
		hm.replace("다이제", new Snack("오레오", 300));
		System.out.println(hm);
		
		hm.remove("다이제");
		System.out.println(hm.get("오레오"));
		
		System.out.println("=======================================");
		
		/*

Map 계열 데이터 반복문 돌리기
	
	방법 1. keySet()을 활용한 반복
	
		Set<String> set = hm.keySet();
		for(String key : set) 
			System.out.println(key);
			System.out.println(hm.get(key));
			
	
	방법 2. entrySet()을 활용한 반복
		- 맵의 key, value 값이 담긴 entry를 set에 담아 반환해주는 메서드
			
		Set<String> set = hm.keySet();
		Set<Entry<key, value>> entrySet = hm.entrySet();
		for(Entry<key, value> entry : entrySet) {
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getKey());

		 */
		
		Set<String> set = hm.keySet();
		for(String key : set) {
			System.out.println(key);
			System.out.println(hm.get(key));
		}
		
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		for(Entry<String, Snack> entry : entrySet) {
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getKey());
		}
	}
}
