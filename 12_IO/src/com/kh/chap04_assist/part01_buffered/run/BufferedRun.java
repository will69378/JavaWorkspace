package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {
	
	/*
	 
	 보조 스트림
	 	- 기반 스트림의 부족한 성능이나 기능을 추가할 수 있는 스트림
	 	- 보조스트림은 단독으로 사용이 불가
	 
	 	보조스트림 변수명 = new 보조스트림(기반스트림 객체);
	 	보조스트림1 변수명 = new 보조스트림1(new 보조스트림2(기반스트림 객체));
	 	
	 BufferdXXX
	 	- 속동 성능 향상 목적의 보조 스트림
	 	- 내부적으로 버퍼공간을 제공하여 데이터를 모아놨다가 한번에 입출력 진행
	 	
	 */
	
	public static void main(String[] args) {
		BufferedDao dao = new BufferedDao();
		
		dao.fileRead();
	}
	
}
