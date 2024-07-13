package com.mmtspl.cloudconfigservice.model;


public class AddressServiceFrontControllerUrlsConfiguration   
{  
	private String baseUrl;  
	private String getAllAddressUrl;  
	private String getAddressByIdUrl;
	private String addAddressUrl;
	private String updateAddressUrl;
	private String deleteAddressUrl;
	private String getAddressByNameUrl;
	
	protected AddressServiceFrontControllerUrlsConfiguration() {
		
	}
	
	public AddressServiceFrontControllerUrlsConfiguration(String baseUrl, String getAllAddressUrl, String getAddressByIdUrl, String addAddressUrl, String updateAddressUrl, String deleteAddressUrl, String getAddressByNameUrl) {
		this.baseUrl =  baseUrl; 
		this.getAllAddressUrl = getAllAddressUrl;
		this.getAddressByIdUrl =  getAddressByIdUrl;
		this.addAddressUrl =  addAddressUrl;
		this.updateAddressUrl =  updateAddressUrl; 
		this.deleteAddressUrl =  deleteAddressUrl; 
		this.getAddressByNameUrl =  getAddressByNameUrl;	
	}
	

	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getGetAllAddressUrl() {
		return getAllAddressUrl;
	}
	public void setGetAllAddressUrl(String getAllAddressUrl) {
		this.getAllAddressUrl = getAllAddressUrl;
	}
	public String getGetAddressByIdUrl() {
		return getAddressByIdUrl;
	}
	public void setGetAddressByIdUrl(String getAddressByIdUrl) {
		this.getAddressByIdUrl = getAddressByIdUrl;
	}
	public String getAddAddressUrl() {
		return addAddressUrl;
	}
	public void setAddAddressUrl(String addAddressUrl) {
		this.addAddressUrl = addAddressUrl;
	}
	public String getUpdateAddressUrl() {
		return updateAddressUrl;
	}
	public void setUpdateAddressUrl(String updateAddressUrl) {
		this.updateAddressUrl = updateAddressUrl;
	}
	public String getDeleteAddressUrl() {
		return deleteAddressUrl;
	}
	public void setDeleteAddressUrl(String deleteAddressUrl) {
		this.deleteAddressUrl = deleteAddressUrl;
	}
	public String getGetAddressByNameUrl() {
		return getAddressByNameUrl;
	}
	public void setGetAddressByNameUrl(String getAddressByNameUrl) {
		this.getAddressByNameUrl = getAddressByNameUrl;
	}
}  

