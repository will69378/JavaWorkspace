package com.kh.practice.map.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	HashMap<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMembership(String id, Member m) {
		if(id==null) {
			map.put(id, m);
			return true;
		}
		else {
			return false;
		}
	}
	
	public String logIn(String id, String password) {
		if(id!=null) {
			if(map.containsKey(password)) {
				return String.valueOf(map.get(id));
			}
			else {
				return null;
			}
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
	
	public TreeMap<String, Member> sameName(String name) {
		
		if(map.containsKey(name)) {
			
		}
	}
	
	
}	
