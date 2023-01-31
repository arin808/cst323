package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import com.gcu.business.AnotherOrdersBusinessService;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.OrdersBusinessInterface;

@Configuration
public class SpringConfig
{
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	@SessionScope
	public OrdersBusinessInterface getOrdersBusiness()
	{
		//Specify which service class to use as configuration
		return new OrdersBusinessService();
	}
	

}
