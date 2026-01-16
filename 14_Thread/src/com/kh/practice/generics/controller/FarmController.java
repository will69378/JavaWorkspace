package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	HashMap<Farm, Integer> hMap = new HashMap<>();
	
	ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		boolean result = hMap.containsKey(f);
		if(result) {
			return false;
			
		}
		hMap.put(f, amount);
		return true;
	}
	
	public boolean removeKind(Farm f) {
		boolean result = hMap.containsKey(f);
		if(result) {
			return false;
		}
		hMap.remove(f);
		return true;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		boolean result = hMap.containsKey(f);
		if(result) {
			hMap.replace(f, hMap.get(f), amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm() {
		return hMap;
	}
	
	public boolean buyFarm(Farm f) {
		
	}
	
	public boolean removeFarm(Farm f) {
		
	}
	
	public ArrayList<Farm> printBuyFarm() {
		
	}
}
