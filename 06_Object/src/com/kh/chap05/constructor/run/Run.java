package com.kh.chap05.constructor.run;

import com.kh.chap05.constructor.model.vo.User;

public class Run {
	public static void main(String[] args) {
		User ur = new User();
		
		User ur2 = new User("user01");
		
		User ur3 = new User("user03", 30, '남');
		System.out.println(ur3.getAge());
		System.out.println(ur3.getGender());
		System.out.println(ur3.getUserid());
	}
}
