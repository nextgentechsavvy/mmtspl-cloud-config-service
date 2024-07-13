package com.mmtspl.cloudconfigservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("user-service-rest-api")
public class UserServiceFrontControllerUrlsCloudConfiguration   
{  
	
	private String baseUrl;  
	private String getAllUserUrl;  
	private String getUserByIdUrl;
	private String addUserUrl;
	private String updateUserUrl;
	private String deleteUserUrl;
	private String getUserByNameUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getGetAllUserUrl() {
		return getAllUserUrl;
	}
	public void setGetAllUserUrl(String getAllUserUrl) {
		this.getAllUserUrl = getAllUserUrl;
	}
	public String getGetUserByIdUrl() {
		return getUserByIdUrl;
	}
	public void setGetUserByIdUrl(String getUserByIdUrl) {
		this.getUserByIdUrl = getUserByIdUrl;
	}
	public String getAddUserUrl() {
		return addUserUrl;
	}
	public void setAddUserUrl(String addUserUrl) {
		this.addUserUrl = addUserUrl;
	}
	public String getUpdateUserUrl() {
		return updateUserUrl;
	}
	public void setUpdateUserUrl(String updateUserUrl) {
		this.updateUserUrl = updateUserUrl;
	}
	public String getDeleteUserUrl() {
		return deleteUserUrl;
	}
	public void setDeleteUserUrl(String deleteUserUrl) {
		this.deleteUserUrl = deleteUserUrl;
	}
	public String getGetUserByNameUrl() {
		return getUserByNameUrl;
	}
	public void setGetUserByNameUrl(String getUserByNameUrl) {
		this.getUserByNameUrl = getUserByNameUrl;
	}
}  

