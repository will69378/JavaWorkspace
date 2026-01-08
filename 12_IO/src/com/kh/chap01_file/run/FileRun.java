package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	public static void main(String[] args) {
		/*
		 
		 java.io.file
		 
		 	- 파일의 개념을 추상화하여 만들어진 클래스
		 	- 별도의 입출력 기능은 존재하지 않는다
		 	- 파일의 속성이나 경로, 이름, 크기 등을 알 수 있다.
		 
		 
		 
		 1. 경로를 지정하지 않고 파일 생성
		 File file1 = new File("test.txt");
		 file1.createNewFile();	
		 
		 
		 2. 경로를 지정하고 파일 생성   (실제 있는 폴더가 아니면 실행했을때 에러)
		 File file2 = new File("C:/aaa/test.txt");
		file2.createNewFile();
		
		
		3. 폴더만 생성하기
		File bbbFolder = new File("C:/bbb");
		bbbFolder.mkdir();   <---- makeDirectory의 줄임
		
		
		4. 폴더 여러개 만들기
		File cccdddFolder = new File("C:/ccc/ddd");
		cccdddFolder.mkdirs();    <---- s를 붙이면 여러개 가능
		
		
		
		File에서 제공하는 메서드들
			자바pdf의 IO 파일 참고	
		
		 */
		
		try {
			
			
			File file1 = new File("test.txt");
			file1.createNewFile();			
			
			File file2 = new File("C:/aaa/test.txt");
			file2.createNewFile();
			
			File bbbFolder = new File("C:/bbb");
			bbbFolder.mkdir();
			
			File cccdddFolder = new File("C:/ccc/ddd");
			cccdddFolder.mkdirs();
			
			System.out.println(file2.isFile());

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
