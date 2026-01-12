package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		int result = o2.getTitle().compareTo(o1.getTitle());
		
		if(result == 0) {
			result = o2.getSinger().compareTo(o1.getSinger());
		}
		
		
		return result;
	}

}
