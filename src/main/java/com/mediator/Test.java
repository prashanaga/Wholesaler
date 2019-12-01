package com.mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		Account u1 = new Account();
		Account u2 = new Account();
		Account u3 = new Account();
		
		// Users promotion status
		u1.promUpdate(1);
		u2.promUpdate(0);
		u3.promUpdate(1);
		
		// Administrator creates a new promotion
		Promotion p = new Promotion();
		// Start date, end date, and code for promotion
		p.createProm("01/Jan/2020", "15/Jan/2020", "NewYear30");
		
		mediator.addUser(u1);
		mediator.addUser(u2);
		mediator.addUser(u3);
		
		mediator.sendProm(p.broadcast());
		
	}
}
