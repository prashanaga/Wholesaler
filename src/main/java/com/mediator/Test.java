package com.mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		u1.promUpdate(1);
		u2.promUpdate(0);
		u3.promUpdate(1);
		
		Promotion p = new Promotion();
		p.createBroadcast();
		
		mediator.addUser(u1);
		mediator.addUser(u2);
		mediator.addUser(u3);
		
		mediator.sendProm(p.broadcast());
		
	}
}
