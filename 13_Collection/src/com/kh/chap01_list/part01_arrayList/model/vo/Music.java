package com.kh.chap01_list.part01_arrayList.model.vo;

import java.util.ArrayList;
import java.util.List;

public class Music implements Comparable<Music>{
	private String title;
	private String artist;

	public Music() {

	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;

	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist+"]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int compareTo(Music o) {
		/*
		 
		 compareTo 메서드
		 	- 현재 ( this ) 객체와 매개변수로 전달된 객체간의 비교를 수정하는 메서드
		 	- 반환값으로 양수, 0, 음수의 값들이 반환되도록 설정해야한다
		 	- sort 메서드에서 호출한다.
		 	- 양수, 0 -> 자리유지
		 	  음수 -> 자리교체
		 	  
		 	1. 제목 기준 오름차순 정렬  
		 	this.title.compareTo(o.title);
		 	
		 	2. 제목 기준 내림차순 정렬
		 	o.title.compareTo(this.title);
		 	
		 	3. 제목, 아티스트 기준 오름차순 정렬
		 	if(this.title.compareTo(o.title) == 0) {
				this.artist.compareTo(o.artist);
			}
		 */
		this.title.compareTo(o.title);
		o.title.compareTo(this.title);
		if(this.title.compareTo(o.title) == 0) {
			this.artist.compareTo(o.artist);
		}
		
		return 0;
	}

}
