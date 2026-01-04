package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	public int SIZE = 10;
	private Member [] m = new Member[SIZE];
	
	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if(!(m[i].getId()==null)) {
				count++;
			}
		}
		
		return count;
	}
	
	public boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i]==null) {
				break;
			}
			if(m[i].getId().equals(inputId)) {
				return true;
			}
			
		}
		return false;
		
		
	}
	
	public void insertMember(String id, String name,
			String password, String email, char gender,
			int age) {
		for (int i = 1; i <= m.length; i++) {
			if(m[i-1]==m[i]) {
				break;
			}
			m[i-1].setId(id);
			
			m[i-1].setName(name);
			m[i-1].setPassword(password);
			m[i-1].setEmail(email);
			m[i-1].setGender(gender);;
			m[i-1].setAge(age);
		}
		
	}
	
	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				System.out.println("찾으신 회원 조회 결과입니다.");
				
			}
		}return id;

	}
	
	public Member[] searchName(String name) {
		for (int i = 0; i < m.length; i++) {
			if(m[i].getName().equals(name)) {

				return m[i].getName();
			}
		}
	}
	
	public Member[] searchEmail(String email) {
		
	}
	
	public boolean updatePassword(String id, String password) {
		
	}
	
	public boolean updateName(String id, String name) {
		
	}
	
	public boolean updateEmail(String id, String email) {
		
	}
	
	public boolean delete(String id) {
		
	}
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		
	}
}
