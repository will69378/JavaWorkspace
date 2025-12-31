package com.kh.chap01.oneVsMany.run;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book bk1 = new Book();
		
		bk1.setTitle("DoIT");
		bk1.setAuthor("김지원");
		bk1.setPublisher("동화나라");
		bk1.setPrice(20000);
		
		Book bk2 = new Book("DoYourSelf", "김지원", "동화나라", 15000);
		
		Book bk3 = new Book("원피스","오다 에이치로", "점프", 10000);
		
		for(int i = 0; i<3; i++) {
			if(i==0) {
				System.out.println(bk1.information());
			}
			else if(i==1) {
				System.out.println(bk2.information());
			}
			else {
				System.out.println(bk3.information());
			}
		}
		
		Book[] arr = new Book[3];
		arr[0] = bk1;
		arr[1] = bk2;
		arr[2] = bk3;
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책의 제목 : ");
		String searchTitle = sc.next();
		
		for(int i = 0; i<arr.length; i++ ) {
			if(searchTitle.equals(arr[i].getTitle())) {
				System.out.println(arr[i].information());
			}
		}
	}
	
	
}
