package com.mmtspl.cloudconfigservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("address-service-rest-api")
public class AddressServiceFrontControllerUrlsCloudConfiguration   
{  
	
	private String baseUrl;  
	private String getAllAddressUrl;  
	private String getAddressByIdUrl;
	private String addAddressUrl;
	private String updateAddressUrl;
	private String deleteAddressUrl;
	private String getAddressByNameUrl;
	
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

