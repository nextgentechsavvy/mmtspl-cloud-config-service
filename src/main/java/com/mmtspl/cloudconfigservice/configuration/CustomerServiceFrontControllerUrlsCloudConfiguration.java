package com.mmtspl.cloudconfigservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("customer-service-rest-api")
public class CustomerServiceFrontControllerUrlsCloudConfiguration   
{  
	
	private String baseUrl;  
	private String getAllCustomerUrl;  
	private String getCustomerByIdUrl;
	private String addCustomerUrl;
	private String updateCustomerUrl;
	private String deleteCustomerUrl;
	private String getCustomerByNameUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getGetAllCustomerUrl() {
		return getAllCustomerUrl;
	}
	public void setGetAllCustomerUrl(String getAllCustomerUrl) {
		this.getAllCustomerUrl = getAllCustomerUrl;
	}
	public String getGetCustomerByIdUrl() {
		return getCustomerByIdUrl;
	}
	public void setGetCustomerByIdUrl(String getCustomerByIdUrl) {
		this.getCustomerByIdUrl = getCustomerByIdUrl;
	}
	public String getAddCustomerUrl() {
		return addCustomerUrl;
	}
	public void setAddCustomerUrl(String addCustomerUrl) {
		this.addCustomerUrl = addCustomerUrl;
	}
	public String getUpdateCustomerUrl() {
		return updateCustomerUrl;
	}
	public void setUpdateCustomerUrl(String updateCustomerUrl) {
		this.updateCustomerUrl = updateCustomerUrl;
	}
	public String getDeleteCustomerUrl() {
		return deleteCustomerUrl;
	}
	public void setDeleteCustomerUrl(String deleteCustomerUrl) {
		this.deleteCustomerUrl = deleteCustomerUrl;
	}
	public String getGetCustomerByNameUrl() {
		return getCustomerByNameUrl;
	}
	public void setGetCustomerByNameUrl(String getCustomerByNameUrl) {
		this.getCustomerByNameUrl = getCustomerByNameUrl;
	}
}  

