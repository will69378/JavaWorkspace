package com.kh.practice.thread;

public class Provider extends Thread{
	private Data data;
	
	public Provider(Data data) {
		this.data = data;
	}
	
	public void run() {
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() * 100);
			data.setValue(random);
			System.out.printf("값이 입력되었습니다.\n"
					+ "put value : %d\n",data.getValue());

			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
