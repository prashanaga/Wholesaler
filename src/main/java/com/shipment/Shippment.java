package com.shipment;

import java.util.Date;
import java.util.Calendar;

public class Shippment {
	public int id;
	public String status;
	public String date;
	public String estimatedDate;
	public String deliveryDate;
	// Set the estimated delay
	public int delDays = 10;
	
	public void createShipment(int id, String status, String date, String estimatedDate) {
		this.id = id;
		this.status = status;
		this.date = date;
		this.estimatedDate = estimatedDate;
	}
	
	public void setDateDetails(int day, int month, int year) {
		
		Calendar shipDate = Calendar.getInstance();
		
		if (day != 0 && month != 0 && year != 0) {
			shipDate.set(Calendar.DATE, day);
			shipDate.set(Calendar.MONTH, month);
			shipDate.set(Calendar.YEAR, year);
		}
		
		Date shippedDate = shipDate.getTime();
		
		String date = String.format("%tB %<te, %<tY", shippedDate);
		System.out.println("Your product is shipped on: " +date);
		
		// Estimated date is delDays from the shipped date
		shipDate.add(Calendar.DATE, delDays);
		
		Date estDate = shipDate.getTime();
		
		String estimatedDate = String.format("%tB %<te, %<tY", estDate);
		System.out.println("Estimated date of delivery is: " +estimatedDate);
	}
	
	public void getShipment() {
		if (status == "packing") {
			System.out.println("Your package is being prepared!");
		} else if (status == "transit") {
			System.out.println("Your package is on the way!");
		} else if (status == "delivered"){
			System.out.println("Package delivered!");
		} else {
			System.out.println("Something went wrong with the package. Contact our support!");
		}
		System.out.printf("Shipment ID: %d\n Status: %s", id, status);
	}
	
	public void updateShipment(String status, Date delDate) {
		this.status = status;
	}
	
	public void notifyUser() {
		System.out.println("Notified user about the shipment!");
	}
}