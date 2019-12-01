package com.mediator;
import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
	private List<Account> users;
	
	public Mediator() {
		this.users = new ArrayList<Account>();
	}
	
	public void addUser(Account user){
		this.users.add(user);
	}
	
	
	public void sendProm(String code) {
		for(Account u : this.users){
			if(u.getPromStatus() == 1) {
				u.receiveUpdate("Promotion code is: "+code);
			}
			else {
				u.receiveUpdate("Didn't register for promotions!");
			}
		}
	}

}
