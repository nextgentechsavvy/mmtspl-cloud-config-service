package com.mmtspl.cloudconfigservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableHystrix
//@EnableDiscoveryClient
public class MMTSPLCloudConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MMTSPLCloudConfigServiceApplication.class, args);
	}

}
