package com.mediator;

public class Promotion {
	protected String name = "NewCoupon";
	protected String code;
	protected String startDate, endDate;
	
	public void setName(String name) {
		this.name = name;
	}
	public void createProm(String startDate, String endDate, String code) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.code = code;
	}
	public String broadcast() {	
		return code;
	}
}