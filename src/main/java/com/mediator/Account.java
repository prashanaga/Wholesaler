package com.mediator;

public class Account {
	protected int id;
	protected int reg_status;
	protected String promCode;
	
	public void setId() {
		id = 1;
	}
	public int getId() {
		return id;
	}
	public void promUpdate(int reg_status) {
		this.reg_status = reg_status;	
	}
	public int getPromStatus() {
		return reg_status;
	}
	public void receiveUpdate(String promCode) {
		this.promCode = promCode;
		System.out.println(promCode);
	}
}
