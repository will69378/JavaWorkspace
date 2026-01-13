package com.kh.chap03_generic.model.vo;

public class GenericExtends <T extends Parent>{
	
	private T type;
	
	public void printing() {
		type.doPrint();
	}

	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}
	
	
}
