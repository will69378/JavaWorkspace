package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	
	/*
	 DAO
	 
	 데이터에 연결하기 위한 용도의 클래스를 관리하는 패키지
	 FileOutputStream : 파일로 데이터를 1byte 단위로 출력하는 스트림
	 new FileOutputStream(입출력할 파일 객체 / 파일명);
	 
	 new FileOutputStream(new File(입출력할 파일 객체 / 파일명)); 이게 더 좋음
	 
	 1. FileOutputStream 객체 생성 == 입출력할 파일과 연결
	 	- 매개변수로 전달한 파일이 존재하지 않으면 해당 파일을 새로 생성하면서 통로가 개설
	 	- 존재하는 파일이면 즉시 통로 연결
	 	- true 미 작성시 : 기존에 해당 파일에 내용을 덮어씌우기로 출력
	 	- true 작성시 : 이어쓰기 방식으로 출력
	 	new FileOutputStream(new File("a_byte.txt"), true);
	 	
	 	
	 2. 연결 통로로 데이터 출력
	 	- read() : 1byte씩 int 데이터를 읽어온다
	 	- write() : 0 ~ 127 까지의 숫자만 사용 가능, 즉 영문자를 제대로 표현 못함
	 				일반 바이트스트림으로 한글과 같은 유니코드 문자 표현 불가
	 				
	 
	 3. 다 쓴 스트림 반납하기
	 	- .close();
	 	
	 	 스트림은 자원을 많이 먹기에 다 쓰면 반납해야한다
	 	 
	 	 
	 	 
	
	 자바프로그램으로 데이터를 입력받는 기능
	 */
	FileOutputStream fout = null;
	public void fileSave() {

		try {
			fout =  new FileOutputStream(new File("a_byte.txt"), true);
			fout.write(65);
			
			byte[] bArr = {99, 100, 101};
			fout.write(bArr);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileInputStream fin = null;
		
		
		try {
			fin = new FileInputStream(new File("a_byte.txt"));
			int value = 0;
			
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}




























