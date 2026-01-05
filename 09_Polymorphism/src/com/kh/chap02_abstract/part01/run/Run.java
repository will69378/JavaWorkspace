package com.kh.chap02_abstract.part01.run;

import com.kh.chap02_abstract.part01.model.vo.Basketball;
import com.kh.chap02_abstract.part01.model.vo.FootBall;
import com.kh.chap02_abstract.part01.model.vo.Sports;

public class Run {
	public static void main(String[] args) {
		Sports s = new Basketball();
		
		Sports[] arr = new Sports[2];
		
		arr[0] = s;
		arr[1] = new FootBall();
		
		for(Sports spo : arr) {
			spo.rule();
		}
	}
}
