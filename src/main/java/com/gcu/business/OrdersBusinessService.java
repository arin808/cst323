package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface
{
	@Autowired
	private DataAccessInterface<OrderModel> service;
	
	Logger logger = LoggerFactory.getLogger(OrdersBusinessService.class);

	@Override
	public List<OrderModel> getOrders()
	{
		return service.getOrders();
	}

	//When init is called print message
	public void init()
	{
		logger.info("=========OrdersBusinessService init called=========");
	}
	//When app is destroyed print message
	public void destroy()
	{
		logger.info("=========OrdersBusinessService destroy called=========");
	}
}
