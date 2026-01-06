package com.kh.practice.chap02_abstractNinterface.run;

import com.kh.practice.chap02_abstractNinterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = pc.method();
		
		for (int i = 0; i < pc.method().length; i++) {
			System.out.println(arr[i]);
		}
	}
}
