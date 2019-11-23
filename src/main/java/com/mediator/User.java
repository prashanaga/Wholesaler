package com.mediator;

public class User{
	protected String name;
	protected int reg;
	
	public void promUpdate(int reg) {
		this.reg = reg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPromStatus() {
		return reg;
	}
	
	public String getName() {
		return name;
	}
	
	public void receive(String code) {
		System.out.println(code);
	}
}
