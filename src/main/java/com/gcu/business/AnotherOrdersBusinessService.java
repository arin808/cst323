package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessInterface
{
	
	Logger logger = LoggerFactory.getLogger(AnotherOrdersBusinessService.class);
	
	@Override
	public List<OrderModel> getOrders()
	{
		//New list of orders; food
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(10L, "AAA", "Big Mac", 8.50f, 1));
		orders.add(new OrderModel(11L, "AAB", "Large Fries", 120.0f, 3));
		orders.add(new OrderModel(12L, "AAC", "Chicken Nuggets", 4.0f, 2));
		orders.add(new OrderModel(13L, "AAD", "Coke", 1.0f, 1));
		orders.add(new OrderModel(14L, "AAE", "Apple Pie", 1.50f, 2));

		return orders;
	}
	
	//Init prints message
	public void init()
	{
		logger.info("=========AnotherOrdersBusinessService init called=========");
	}
	//Destroy prints message
	public void destroy()
	{
		logger.info("=========AnotherOrdersBusinessService init called=========");
	}
}
