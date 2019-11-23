package com.notifications;

public class User extends Observer{
	private String name;
	
	public User(String name){
		this.name=name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void update(Subject subject) {
		if(subject.isInStock()) {
			System.out.println(this.name+" received notification -> " + "Hurry up, " + subject.getTitle() + " is back in stock.");
		}
	}
}
