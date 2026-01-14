package com.kh.chap04_sync.run;

import com.kh.chap04_sync.sync.Account;
import com.kh.chap04_sync.sync.Atm;

public class Run {
	public static void main(String[] args) {
		Thread th1 = new Thread();
		
/*
동기화
	- 멀티스레드 프로그래밍에서 스레드 간에 경쟁상태에 있는 공유 자원에 대한 "접근순서(임계영역)"을 지정해주는 것
	- 멀티스레드 프로그래밍에서 여러 스레드가 동시에 하나의 자원에 접근하는 상황을 경쟁상태라고 부름
	즉, 자원을 차지하고자 경쟁하는 것
	- 이를 방지하기 위해 하나의 공유자원에 접근할 때는 하나의 스레드만 접근할 수 있도록 
	통제해야하는데 통제하기 위해 해당 자원을 "통제 영역"으로 지정하고 통제 영역을 지정하는 키워드가 동기화이다.
	
동기화 처리 방법
	1. synchronzied 메서드 만들기
		- 메서드 전체에 대해 락을 걸고, 메서드 종료시 락이 풀린다.
		
	2. synchronzied block 사용하기 (권장)
		- 동기화가 필요한 일부 내용에만 락을 건다.
		- 동기화 블럭이 끝나는 순간 락이 풀린다.
		- 임계영역이 아닌 지역까지는 모든 스레드가 접근 가능하기 때문에, 메서드 전체로 임계영역으로 지정하는 것보다 효율이 좋다.

 */
		
		Account acc = new Account();
		
		Thread Atm1 = new Thread(new Atm(acc), "ATM 1");
		Thread Atm2 = new Thread(new Atm(acc), "ATM 2");
		
		Atm1.start();
		Atm2.start();
	}
}
