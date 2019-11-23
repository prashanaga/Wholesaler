package com.mediator;
import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
	private List<User> users;
	
	public Mediator() {
		this.users = new ArrayList<User>();
	}
	
	public void addUser(User user){
		this.users.add(user);
	}
	
	
	public void sendProm(String code) {
		for(User u : this.users){
			if(u.getPromStatus() == 1) {
				u.receive("Promotion code is: "+code);
			}
			else {
				u.receive("Didn't register for promotions!");
			}
		}
	}
}
