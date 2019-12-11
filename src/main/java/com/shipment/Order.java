package com.shipment;

import java.util.Date;
import java.util.List;

import com.wholesaler.dao.orderDao;

import java.util.ArrayList;
import java.util.Calendar;

public class Order {
	public int orderId;
	public int orderAmount;
	public int orderStatus;
	public String orderMsg;
	public String orderDate;
	public String orderDetails;
	
	public void setId(int orderId) {
		this.orderId = orderId;
	}
	
	public void setDate(int day, int month, int year) {
		Calendar ordDate = Calendar.getInstance();
		
		if (day != 0 && month != 0 && year != 0) {
			ordDate.set(Calendar.DATE, day);
			ordDate.set(Calendar.MONTH, month);
			ordDate.set(Calendar.YEAR, year);
		}
		
		Date date = ordDate.getTime();
		
		orderDate = String.format("%tB %<te, %<tY", date);
		//System.out.println("Ordered on: " +orderDate);
	}
	
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public String getOrderStatus() {
		if (orderStatus == 0) {
			orderMsg = "Your order " + orderId + "  has been cancelled!";
		} else if (orderStatus == 1) {
			orderMsg = "Your order " + orderId + "  has been placed!";
		} else {
			orderMsg = "Something went wrong with " + orderId+ ". Contact support!";
		}
		return orderMsg;
	}
	
	public void getOrderDetails(int userId) {
		List<Order> ordLst = new ArrayList<Order>();
		
		orderDao ordDao = new orderDao();
		ordLst = ordDao.getOrdersList(userId);
		
		System.out.println("Order details for User: " + userId);
		System.out.println("Number of orders: "+ ordLst.size());
		for (Order ord: ordLst) {
			System.out.println();
			System.out.printf("Order Id: %d\nOrder Amount: %d\nOrder Date: %s\nOrder Status: %s\n",ord.orderId, ord.orderAmount, ord.orderDate, ord.getOrderStatus());
		}
		System.out.println("-------------------------------");
	}
	
	public void placeOrder(int userId) {
		this.orderStatus = 1;
		System.out.println("[+] Order placed! "+ userId);
	}
	public void cancelOrder(int orderId) {
		this.orderStatus = 0;
	}
	
	public void orderHistory() {
		
	}
}
