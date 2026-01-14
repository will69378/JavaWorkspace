package com.kh.chap01_thread.model.thread;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		//각 스레드가 실행할 작업을 기술하는 메서드
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("작업 1 ("+i+")");
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("작업 2 ("+i+")");
		}
		
	}
	
}
