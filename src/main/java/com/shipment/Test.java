package com.shipment;
//import com.mediator.Account;
//import java.util.Date;
//import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
//		Account A1 = new Account();
//		Account A2 = new Account();
		
		// Get the order details for user account A1
		Order ord = new Order();
		ord.getOrderDetails(1);
		
		// Get the order details for user account A1
		ord.getOrderDetails(2);
	}
}