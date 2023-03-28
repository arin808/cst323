package com.gcu.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	@Autowired
	private OrdersBusinessInterface service;
	
	@Autowired
	private SecurityBusinessService security;
	
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping("/")
	public String display(Model model)
	{
		//Display Login form
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		
		logger.info("=========Accessing LoginController.display() at path /=========");
		
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel,  BindingResult bindingResult, Model model)
	{
		//Validate for errors
		if(bindingResult.hasErrors())
		{
			model.addAttribute("title", "Login Form");
			logger.error("=========Error during login in LoginController.doLogin() at /doLogin=========");
			return "login";
		}
		
		//Create Order list
		List<OrderModel> orders = service.getOrders();
	
		logger.info("=========Accessing LoginController.doLogin() at path /doLogin=========");
		
		//Bind model attributes and send to orders page
		model.addAttribute("title", "My Orders");
		model.addAttribute("orders", orders);
		
		//Security call
		security.authenticate(loginModel.getUsername(), loginModel.getPassword());
		
		return "orders";
	}
}
