package com.kh.chap02.objectArray.run;

import com.kh.chap02.objectArray.model.vo.Phone;

public class WrongSample {
	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}

	}
}
