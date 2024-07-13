package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.CustomerServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.CustomerServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-customer-service")
public class CustomerServiceFrontControllerUrlsController   
{  
	@Autowired
	CustomerServiceFrontControllerUrlsCloudConfiguration customerServiceFrontControllerUrlsCloudConfiguration;
	
	@GetMapping("/frontcontrollerurls")  
	public CustomerServiceFrontControllerUrlsConfiguration retriveCustomerServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new CustomerServiceFrontControllerUrlsConfiguration(customerServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				customerServiceFrontControllerUrlsCloudConfiguration.getGetAllCustomerUrl(),
				customerServiceFrontControllerUrlsCloudConfiguration.getGetCustomerByIdUrl(),
				customerServiceFrontControllerUrlsCloudConfiguration.getAddCustomerUrl(),
				customerServiceFrontControllerUrlsCloudConfiguration.getUpdateCustomerUrl(),
				customerServiceFrontControllerUrlsCloudConfiguration.getDeleteCustomerUrl(),
				customerServiceFrontControllerUrlsCloudConfiguration.getGetCustomerByNameUrl());  
		
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