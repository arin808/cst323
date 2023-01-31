package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface
{
	@Autowired
	private DataAccessInterface<OrderModel> service;
	
	@Override
	public void test()
	{
		System.out.println("The test method is working if you see this");
	}

	@Override
	public List<OrderModel> getOrders()
	{
		return service.getOrders();
	}

	//When init is called print message
	public void init()
	{
		System.out.println("OrdersBusinessService init called");
	}
	//When app is destroyed print message
	public void destroy()
	{
		System.out.println("OrdersBusinessService destroy called");
	}
}
