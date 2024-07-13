package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.ProductServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.ProductServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-product-service")
public class ProductServiceFrontControllerUrlsController   
{  
	@Autowired
	ProductServiceFrontControllerUrlsCloudConfiguration productServiceFrontControllerUrlsCloudConfiguration;
	
	@GetMapping("/frontcontrollerurls")  
	public ProductServiceFrontControllerUrlsConfiguration retriveProductServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new ProductServiceFrontControllerUrlsConfiguration(productServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				productServiceFrontControllerUrlsCloudConfiguration.getGetAllProductUrl(),
				productServiceFrontControllerUrlsCloudConfiguration.getGetProductByIdUrl(),
				productServiceFrontControllerUrlsCloudConfiguration.getAddProductUrl(),
				productServiceFrontControllerUrlsCloudConfiguration.getUpdateProductUrl(),
				productServiceFrontControllerUrlsCloudConfiguration.getDeleteProductUrl(),
				productServiceFrontControllerUrlsCloudConfiguration.getGetProductByNameUrl());  
		
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