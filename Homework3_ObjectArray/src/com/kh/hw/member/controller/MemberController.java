package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	public final static int SIZE = 10;
	private Member[] m = new Member[SIZE];

	public int existMemberNum() {
		int count = 0;
		for (Member num : m) {
			if (num != null) {
				count++;
			}
		}
		return count;
	}

	public boolean checkId(String inputId) {
		boolean isD = false;

		for (Member num : m) {

			if (num != null && inputId.equals(num.getId())) {
				isD = true;
				break;
			}
		}
		return isD;
	}

	public void insertMember(String id, String name, String password,
			String email, char gender, int age) {
		
		Member num = new Member(id, name, password,
				email, gender, age);
		
		for(int i = 0; i<m.length; i++) {
			if(m[i]==null) {
				m[i] = num;
				break;
			}
		}
	}

	public String searchId(String id) {
		for (Member num : m) {

			if (num != null && num.getId().equals(id)) {
				return num.toString();
			}
		}
		return null;

	}

	public Member[] searchName(String name) {
		Member[] m = new Member[SIZE];
		
		int count = 0;
		for (Member num : this.m) {
			if (num != null && num.getName().equals(name)) {
				m[count++] = num;
			}
		}
		if(count == 0) {
			return null;
		}
		else {
			Member[] copy = Arrays.copyOf(m, count);
			return copy;
		}
	}

	public Member[] searchEmail(String email) {
		Member[] m = new Member[SIZE];
		
		int count = 0;
		for (Member num : this.m) {
			if (num != null && num.getEmail().equals(email)) {
				m[count++] = num;
			}
		}
		if(count == 0) {
			return null;
		}
		else {
			Member[] copy = Arrays.copyOf(m, count);
			return copy;
		}
	}

	public boolean updatePassword(String id, String password) {
		for(int i = 0; i<m.length; i++) {
			Member num = m[i];
			if(num != null && num.getId().equals(id)) {
				num.setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for(int i = 0; i<m.length; i++) {
			Member num = m[i];
			if(num != null && num.getId().equals(id)) {
				num.setName(name);;
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for(int i = 0; i<m.length; i++) {
			Member num = m[i];
			if(num != null && num.getId().equals(id)) {
				num.setEmail(email);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void delete() {
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		return m;
	}
}
