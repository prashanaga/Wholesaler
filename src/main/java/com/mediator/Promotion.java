package com.mediator;

public class Promotion {
	protected String code;
	
	public void createBroadcast() {
		code = "Discount30";
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String broadcast() {	
		return code;
	}
}
