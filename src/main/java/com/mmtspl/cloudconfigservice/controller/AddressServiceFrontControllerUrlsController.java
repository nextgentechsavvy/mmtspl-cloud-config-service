package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.AddressServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.AddressServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-address-service")
public class AddressServiceFrontControllerUrlsController   
{  
	@Autowired
	AddressServiceFrontControllerUrlsCloudConfiguration addressServiceFrontControllerUrlsCloudConfiguration;
	
	@GetMapping("/frontcontrollerurls")  
	public AddressServiceFrontControllerUrlsConfiguration retriveAddressServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new AddressServiceFrontControllerUrlsConfiguration(addressServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				addressServiceFrontControllerUrlsCloudConfiguration.getGetAllAddressUrl(),
				addressServiceFrontControllerUrlsCloudConfiguration.getGetAddressByIdUrl(),
				addressServiceFrontControllerUrlsCloudConfiguration.getAddAddressUrl(),
				addressServiceFrontControllerUrlsCloudConfiguration.getUpdateAddressUrl(),
				addressServiceFrontControllerUrlsCloudConfiguration.getDeleteAddressUrl(),
				addressServiceFrontControllerUrlsCloudConfiguration.getGetAddressByNameUrl());  
		
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