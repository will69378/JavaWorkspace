package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharcterController {
	
	public CharcterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		char[] ch = s.toCharArray();
		
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
			if(((int)ch[i]<65 || (int)ch[i]>90) && 
					((int)ch[i]<97 || (int)ch[i]>122)) {
				continue;
			}
			count++;
		}
		
		return count;
	}
}
