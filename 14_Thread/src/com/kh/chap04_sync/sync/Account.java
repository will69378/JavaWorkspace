package com.kh.chap04_sync.sync;

public class Account {
	private int balance = 10000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		
		String name = Thread.currentThread().getName();
		synchronized (this) {
			System.out.println("현재 잔액은 : "+balance);
		
			if(money <= balance ) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 >>> 잔액 : %d원\n", name, money, balance);
			}
			else {
				System.out.printf("[%s] %d원 출금시도하였으나 잔액이 부족합니다.\n", name, money);
			}
		}
	}
}
