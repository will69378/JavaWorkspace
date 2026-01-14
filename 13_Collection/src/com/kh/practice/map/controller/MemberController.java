package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		else {

			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(map.containsKey(id) && map.containsValue(password)) {
			return String.valueOf(map.get(id).getName());
		}
		else {
			return null;
		}
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.get(id).setPassword(newPw);
				return true;
			}

		}
		return false;
	}	
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	
	public TreeMap<String, String> sameName(String name) {

		Set<String> set = map.keySet();
		TreeMap<String, String> sn = new TreeMap<>();
			
		if(map.containsKey(name)) {
			for(String str : set) {
				if(str.equals(name)) {
					sn.put(str, name);
				}
			}
		}
		return sn;
	}
	
	
}	
