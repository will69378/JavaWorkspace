package com.kh.practice.thread;

public class Customer extends Thread{
	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.printf("get Value : %d\n"
					+"값을 꺼냈습니다. value가 비었습니다.\n", data.getValue());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
