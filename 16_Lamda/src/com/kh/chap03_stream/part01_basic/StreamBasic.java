package com.kh.chap03_stream.part01_basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBasic {
	
/*
스트림 (Stream)
	- 데이터를 스트림으로 보내고 중간에서 연산하고 그 값을 스트림으로 보내고 하는 식의 흐름을 만들어내는 클래스
	- 주로 컬렉션과 배열의 요소들에 대한 데이터 처리시에 많이 사용함 ( 이때 람다식으로 많이 처리함 )
	- 컬렉션의 데이터를 "함수형 프로그래밍 스타일"로 처리할 수 있도록 지원하는 클래스
	- 기존의 반복, 조건문으로 처리했던 작업들을 람다식으로 제어가 가능
	- 자료구조들(컬렉션 배열 기본자료형)을 스트림을 통해 일관성 있게 제어 가능
		
		이로써, 코드는 간결해지고 일관성 있게 제어가 가능해졌다
		
		Stream은 데이터 이동 
		람다식은 처리 방식에 대한 규칙
		

스트림의 연산메서드
	- 데이터를 처리하기 위한 중간연산 메서드와 최종연산 메서드가 존재
	
	(매우중요!)중간연산과 최종연산은 람다식의 인자를 받은 메서드들로 연산이 이루어진다
	그러므로 람다식 =- 스트림의 연산은 어느정도는 맞지만 틀렸다. 
	
	- 스트림의 데이터 처리 과정 
		1) 스트림 생성 및 초기화
		2) 중간연산 n회 수행
		3) 최종연산 1회 수행
		


스트림의 특징
	- 한번 사용한 스트림은 재사용이 불가능하다 (최종연산 후 스트림이 닫혀서)
	- 스트림은 최종연산 메서드가 호출되기 전까지 실제 연산을 수행하지 않는다  (메모리 효율을 위한 !지연연산!)
	- 컬렉션을 통해 스트림으로 변환한 경우, 기존 컬렉션의 데이터값을 변경하지 않는다 (즉, 깊은복사처럼 별개의 길이 생긴다)
	
	

스트림 객체 생성 방법
	1) 배열을 통한 스트림 생성
		- 배열 선언 및 할당, 초기화 실행 후 Arrays.stream() 호출
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		IntStream intStream = Arrays.stream(arr);
		// 자료형 스트림 박싱/언박싱 과정 없이 처리하기 위해 사용 == 성능과 메모리 효율 향상
		
		String[] sArr = {"김지원","명지원","김태환","류수정"};
		Stream<String> stream = Arrays.stream(sArr);
		
	2) 컬렉션을 통한 스트림 생성
		- 컬렉션 생성 및 초기화 후 컬렉션.stream()
	
		
		ArrayList<Integer> list = new ArrayList<>();
		Stream<Integer> arrayStream = list.stream();
		
		Set<Integer> set = new HashSet<>();
		Stream<Integer> setStream = set.stream();
		
		HashMap<String, Integer> map = new HashMap<>();
		Stream<String> mapStream = map.keySet().stream();
		//map계열은 set계열로 변환 후 스트림에 저장



스트림의 반복문
	1) 배열 반복문
		for(String str : 스트림) {
			System.out.println(str);
		}
		
	2) 스트림 반복문
		- forEach : 스트림을 단순 반복시 사용하는 최종 연산 메서드
		
		stream.forEach( (str) -> System.out.println(str));
		
	3) 배열 반복문에서 조건을 더한 반복문을 스트림으로 표현하기
	filter  --->  조건식의 결과 t/f가 나오는 람다식을 작성하는 중간연산 메서드
	
	IntStream iStream5 = intStream
				.filter( num -> num%2==0) // 1차 조건으로 거르고
				.peek(num -> System.out.println(num)) // 거른 값을 뽑고
				.filter(num -> num % 4 == 0); // 거른 값을 2차 조건으로 걸러주기
		//filter : 거름망처럼 조건식에 부합되는 값들을 걸러줌 
		//peek : 현재 사용중인 스트림값을 뽑는 메서드
	
			//sum : 스스로 모든 값을 더해주는 최종연산 메서드
		int sum2 = iStream5.sum();
		System.out.println("sum2 : "+sum2);
 */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		for(int i : arr) {
			if(i%2 == 0 && i%4 == 0) {
				sum+=i;
			}
		}

		
		//1

		
		IntStream intStream = Arrays.stream(arr);
		
		String[] sArr = {"김지원","명지원","김태환","류수정"};
		Stream<String> stream = Arrays.stream(sArr);
		
		
		//2
		ArrayList<Integer> list = new ArrayList<>();
		Stream<Integer> arrayStream = list.stream();
		
		Set<Integer> set = new HashSet<>();
		Stream<Integer> setStream = set.stream();
		
		HashMap<String, Integer> map = new HashMap<>();
		Stream<String> mapStream = map.keySet().stream();
		
		
		//3
		Stream<String> empty = Stream.empty();
		
		Stream<String> sStream = Stream.<String>builder().add("A").add("B").build();
		
		Stream<String> oStream = Stream.of("a","b","c","d");
		
		//기본 자료형을 통한 스트림 생성
		IntStream iStream3 = IntStream.range(1, 5); //{1,2,3,4}
		IntStream iStream4 = IntStream.rangeClosed(1, 5);//{1,2,3,4,5}
		
		//4. 파일 스트림을 통한 스트림 생성
		try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			
			//br.lines() 하나씩 뽑아오던 메서드
			//하나 읽어 오던걸 Stream으로 한번에 하기
			Stream<String> lines = br.lines();
			lines.forEach(str -> System.out.println(str));
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		IntStream iStream5 = intStream
				.filter( num -> num%2==0)
				.peek(num -> System.out.println(num))
				.filter(num -> num % 4 == 0);
		//filter : 거름망처럼 조건식에 부합되는 값들을 걸러줌 
		//peek : 현재 사용중인 스트림값을 뽑는 메서드
		
		//sum : 스스로 모든 값을 더해주는 최종연산 메서드
		int sum2 = iStream5.sum();
		System.out.println("sum2 : "+sum2);
		
	}
}
