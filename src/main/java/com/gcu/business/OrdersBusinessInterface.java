package com.gcu.business;

import java.util.List;
import com.gcu.model.OrderModel;

public interface OrdersBusinessInterface
{
	//Print test
	public void test();
	
	//Grab list of orders
	public List<OrderModel> getOrders();
	
	//Init method calls 
	public void init();
	
	//Method call on app destroy
	public void destroy();
}
