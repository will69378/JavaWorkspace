package com.kh.chap05_synccontrol.model.thread;

public class Data {
	private int item;
	
	private boolean empty = true;
	
	public void getData() {
		synchronized (this) {
			
			if(empty == true) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			item = 0;
			empty = true;
			System.out.println("소비자가 아이템을 소비하였습니다.");
		}
	}
	
	public void setData() {
		synchronized (this) {
			if(empty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			item = 1;
			empty = false;
			System.out.println("생산자가 아이템을 생산했습니다.");
			notify();
		}
	}
}
