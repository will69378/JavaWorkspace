package com.kh.chap01_innerClass.part02_static.model.vo;

public class Member {
	
	private String id;
	private String name;
	private int age;
	
	
	public Member() {
		
		
	}
	
	
	//외부클래명.Builder
	public static class Builder {
		private String id;
		private String name;
		private int age;
		
		public Builder() {
			
		}
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		
		public Member build() {
			Member m = new Member();
			
			if(id == null) {
				return null;
			}
			m.id = id;
			m.name = name;
			m.age = age;
			
			return m;	
		}
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
