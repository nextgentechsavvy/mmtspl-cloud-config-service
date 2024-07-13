package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.UserServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.UserServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-user-service")
public class UserServiceFrontControllerUrlsController   
{  
	@Autowired
	UserServiceFrontControllerUrlsCloudConfiguration userServiceFrontControllerUrlsCloudConfiguration;
	
	@GetMapping("/frontcontrollerurls")  
	public UserServiceFrontControllerUrlsConfiguration retriveUserServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new UserServiceFrontControllerUrlsConfiguration(userServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				userServiceFrontControllerUrlsCloudConfiguration.getGetAllUserUrl(),
				userServiceFrontControllerUrlsCloudConfiguration.getGetUserByIdUrl(),
				userServiceFrontControllerUrlsCloudConfiguration.getAddUserUrl(),
				userServiceFrontControllerUrlsCloudConfiguration.getUpdateUserUrl(),
				userServiceFrontControllerUrlsCloudConfiguration.getDeleteUserUrl(),
				userServiceFrontControllerUrlsCloudConfiguration.getGetUserByNameUrl());  
		
	}  
	/*
	@GetMapping("/fault-tolerance-example")
	// configuring a fallback method
	@HystrixCommand(fallbackMethod = "fallbackRetrieveConfigurations")
	public LimitConfiguration retrieveConfigurations() {
		throw new RuntimeException("Not Available");
	}

	// defining the fallback method
	public LimitConfiguration fallbackRetrieveConfigurations() {
		// returning the default configuration
		return new LimitConfiguration(234, 76);
	} 
	*/
}  