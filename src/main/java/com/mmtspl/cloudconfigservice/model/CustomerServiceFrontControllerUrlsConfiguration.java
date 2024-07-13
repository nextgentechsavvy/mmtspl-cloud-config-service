package com.mmtspl.cloudconfigservice.model;


public class CustomerServiceFrontControllerUrlsConfiguration   
{  
	private String baseUrl;  
	private String getAllCustomerUrl;  
	private String getCustomerByIdUrl;
	private String addCustomerUrl;
	private String updateCustomerUrl;
	private String deleteCustomerUrl;
	private String getCustomerByNameUrl;
	
	protected CustomerServiceFrontControllerUrlsConfiguration() {
		
	}
	
	public CustomerServiceFrontControllerUrlsConfiguration(String baseUrl, String getAllCustomerUrl, String getCustomerByIdUrl, String addCustomerUrl, String updateCustomerUrl, String deleteCustomerUrl, String getCustomerByNameUrl) {
		this.baseUrl =  baseUrl; 
		this.getAllCustomerUrl = getAllCustomerUrl;
		this.getCustomerByIdUrl =  getCustomerByIdUrl;
		this.addCustomerUrl =  addCustomerUrl;
		this.updateCustomerUrl =  updateCustomerUrl; 
		this.deleteCustomerUrl =  deleteCustomerUrl; 
		this.getCustomerByNameUrl =  getCustomerByNameUrl;	
	}
	

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

