package com.gcu.business;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService {
	
	Logger logger = LoggerFactory.getLogger(SecurityBusinessService.class);

	public boolean authenticate(String username, String password) {
		logger.info("=========Accessing SecurityBusinessService.authenticate()=========");
		return true;
	}
}
