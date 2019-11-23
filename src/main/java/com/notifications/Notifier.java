package com.notifications;

public class Notifier {
	public static void main(String[] args) {
		
		ChangeManager ChMan = ChangeManager.getInstance();
		
		Product redDress = new Product("Red Dress", 10);
		Product blueDress = new Product("Blue Dress", 0);
		
		User user1 = new User("Prashant");
		User user2 = new User("Rohit");
		User user3 = new User("Tarun");
		User user4 = new User("Waqas");
		
		ChMan.Register(redDress, user1);
		ChMan.Register(blueDress, user2);
		ChMan.Register(redDress, user3);
		ChMan.Register(redDress, user4);
//		ChMan.PrintMapping();
		
		ChMan.UnRegister(redDress, user4);
//		ChMan.PrintMapping();
		
		redDress.setStock(0);
		redDress.setStock(15);
		
		
//		//create subject
//		Product redDress = new Product("Red Dress", 10);
//		Product blueDress = new Product("Blue Dress", 0);
//		
//		//create observers
//		User user1 = new User("Prashant");
//		User user2 = new User("Rohit");
//		User user3 = new User("Tarun");
//		
//		//register observers to the subject
//		redDress.attach(user1);
//		redDress.attach(user2);
//		redDress.attach(user3);
//		
//		blueDress.attach(user1);
//		blueDress.setStock(10);
//		
//		//attach observer to subject
//		redDress.setStock(0);
//		redDress.setStock(15);
		
		
	}
}
