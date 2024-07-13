package com.mmtspl.cloudconfigservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmtspl.cloudconfigservice.configuration.EmployeeServiceFrontControllerUrlsCloudConfiguration;
import com.mmtspl.cloudconfigservice.model.EmployeeServiceFrontControllerUrlsConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;  

@RestController 
@RequestMapping("/cloud-config-service-employee-service")
public class EmployeeServiceFrontControllerUrlsController   
{  
	@Autowired
	EmployeeServiceFrontControllerUrlsCloudConfiguration employeeServiceFrontControllerUrlsCloudConfiguration;
	
	@Autowired  
	private Environment environment; 
	
	@GetMapping("/frontcontrollerurls")  
	public EmployeeServiceFrontControllerUrlsConfiguration retriveEmployeeServiceFrontControllerUrlsConfiguration()  
	{  
		//getting values from the properties file  
		return new EmployeeServiceFrontControllerUrlsConfiguration(employeeServiceFrontControllerUrlsCloudConfiguration.getBaseUrl(), 
				employeeServiceFrontControllerUrlsCloudConfiguration.getGetAllEmployeeUrl(),
				employeeServiceFrontControllerUrlsCloudConfiguration.getGetEmployeeByIdUrl(),
				employeeServiceFrontControllerUrlsCloudConfiguration.getAddEmployeeUrl(),
				employeeServiceFrontControllerUrlsCloudConfiguration.getUpdateEmployeeUrl(),
				employeeServiceFrontControllerUrlsCloudConfiguration.getDeleteEmployeeUrl(),
				employeeServiceFrontControllerUrlsCloudConfiguration.getGetEmployeeByNameUrl(),
				Integer.parseInt(environment.getProperty("local.server.port")));  
		
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