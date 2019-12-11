package com.wholesaler.dao;
import java.util.ArrayList;
import java.util.List;

import com.shipment.Order;

public class orderDao {
	public List<Order> getOrdersList(int userId) {
		List<Order> lst = new ArrayList<Order>();
		
		Order order1 = new Order();
		Order order2 = new Order();
		
		order1.setId(001);
		order1.orderAmount = 100;
		order1.setDate(10, 12, 2019);
		order1.placeOrder(userId);
		
		order2.setId(002);
		order2.orderAmount = 200;
		order2.setDate(0, 0, 0);
		order2.cancelOrder(order2.orderId);
		
		lst.add(order1);
		lst.add(order2);
		
		List<Order> lst2 = new ArrayList<Order>();
		
		Order order3 = new Order();

		order3.setId(003);
		order3.orderAmount = 100;
		order3.setDate(8, 12, 2019);
		order3.setOrderStatus(1);
		
		lst2.add(order3);
		
		if (userId == 1) {
			return lst;
		} else {
			return lst2;
		}
		
	}
}