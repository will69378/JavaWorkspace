package com.kh.chap01_list.part01_arrayList.model.vo;

import java.util.Comparator;

public class MusicArtistDescending implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		
		
		return o2.getArtist().compareTo(o1.getArtist());
	}
	
	
	
}
