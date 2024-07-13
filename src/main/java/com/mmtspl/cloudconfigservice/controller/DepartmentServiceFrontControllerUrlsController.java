package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.DepartmentServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.DepartmentServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-department-service")
public class DepartmentServiceFrontControllerUrlsController   
{  
	@Autowired
	DepartmentServiceFrontControllerUrlsCloudConfiguration departmentServiceFrontControllerUrlsCloudConfiguration;
	
	@GetMapping("/frontcontrollerurls")  
	public DepartmentServiceFrontControllerUrlsConfiguration retriveDepartmentServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new DepartmentServiceFrontControllerUrlsConfiguration(departmentServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				departmentServiceFrontControllerUrlsCloudConfiguration.getGetAllDepartmentUrl(),
				departmentServiceFrontControllerUrlsCloudConfiguration.getGetDepartmentByIdUrl(),
				departmentServiceFrontControllerUrlsCloudConfiguration.getAddDepartmentUrl(),
				departmentServiceFrontControllerUrlsCloudConfiguration.getUpdateDepartmentUrl(),
				departmentServiceFrontControllerUrlsCloudConfiguration.getDeleteDepartmentUrl(),
				departmentServiceFrontControllerUrlsCloudConfiguration.getGetDepartmentByNameUrl());  
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