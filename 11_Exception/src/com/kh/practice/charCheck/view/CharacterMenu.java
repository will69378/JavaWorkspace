package com.kh.practice.charCheck.view;

import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharcterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		CharcterController c = new CharcterController();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		
		String take = sc.nextLine();
		
		try {	
			System.out.println(take+"에 포함된 영문자 개수 : "+c.countAlpha(take));
			
			
		} catch (CharCheckException e) {
			e.printStackTrace();
			
		}
	}
}
