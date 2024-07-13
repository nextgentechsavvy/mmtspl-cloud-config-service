package com.mmtspl.cloudconfigservice.model;


public class UserServiceFrontControllerUrlsConfiguration   
{  
	private String baseUrl;  
	private String getAllUserUrl;  
	private String getUserByIdUrl;
	private String addUserUrl;
	private String updateUserUrl;
	private String deleteUserUrl;
	private String getUserByNameUrl;
	
	protected UserServiceFrontControllerUrlsConfiguration() {
		
	}
	
	public UserServiceFrontControllerUrlsConfiguration(String baseUrl, String getAllUserUrl, String getUserByIdUrl, String addUserUrl, String updateUserUrl, String deleteUserUrl, String getUserByNameUrl) {
		this.baseUrl =  baseUrl; 
		this.getAllUserUrl = getAllUserUrl;
		this.getUserByIdUrl =  getUserByIdUrl;
		this.addUserUrl =  addUserUrl;
		this.updateUserUrl =  updateUserUrl; 
		this.deleteUserUrl =  deleteUserUrl; 
		this.getUserByNameUrl =  getUserByNameUrl;	
	}
	

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

