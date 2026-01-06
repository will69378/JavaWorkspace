package com.kh.practice.chap02_abstractNinterface.controller;

import com.kh.practice.chap02_abstractNinterface.model.vo.*;

public class PhoneController {
	private String[] result = new String[2];
	Phone[] p = new Phone[2];
	
	public String[] method() {
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		
		for (int i = 0; i < result.length; i++) {
			result[i] = ;
		}
		
		return result;
	}
	
	
}

