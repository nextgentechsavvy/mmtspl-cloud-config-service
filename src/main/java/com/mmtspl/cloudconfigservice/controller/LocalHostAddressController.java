package com.mmtspl.cloudconfigservice.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/cloud-config-service-local-host")
public class LocalHostAddressController {

	@GetMapping("/getLocalHostAddress")  
	public String getLocalHostAddress()  
	{ 
		String localHostAddress = "127.0.0.1";
		try {
		    localHostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
		    e.printStackTrace();
		}
	    System.out.println("localHostAddress :: " + localHostAddress);
		return localHostAddress;
	}
}

