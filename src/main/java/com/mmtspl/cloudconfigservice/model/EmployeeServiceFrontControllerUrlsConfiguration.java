package com.mmtspl.cloudconfigservice.model;


public class EmployeeServiceFrontControllerUrlsConfiguration   
{  
	private String baseUrl;  
	private String getAllEmployeeUrl;  
	private String getEmployeeByIdUrl;
	private String addEmployeeUrl;
	private String updateEmployeeUrl;
	private String deleteEmployeeUrl;
	private String getEmployeeByNameUrl;
	
	private int port;
	
	protected EmployeeServiceFrontControllerUrlsConfiguration() {
		
	}
	
	public EmployeeServiceFrontControllerUrlsConfiguration(String baseUrl, String getAllEmployeeUrl, String getEmployeeByIdUrl, String addEmployeeUrl, String updateEmployeeUrl, String deleteEmployeeUrl, String getEmployeeByNameUrl, int port) {
		this.baseUrl =  baseUrl; 
		this.getAllEmployeeUrl = getAllEmployeeUrl;
		this.getEmployeeByIdUrl =  getEmployeeByIdUrl;
		this.addEmployeeUrl =  addEmployeeUrl;
		this.updateEmployeeUrl =  updateEmployeeUrl; 
		this.deleteEmployeeUrl =  deleteEmployeeUrl; 
		this.getEmployeeByNameUrl =  getEmployeeByNameUrl;
		this.port = port;
	}
	

	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getGetAllEmployeeUrl() {
		return getAllEmployeeUrl;
	}
	public void setGetAllEmployeeUrl(String getAllEmployeeUrl) {
		this.getAllEmployeeUrl = getAllEmployeeUrl;
	}
	public String getGetEmployeeByIdUrl() {
		return getEmployeeByIdUrl;
	}
	public void setGetEmployeeByIdUrl(String getEmployeeByIdUrl) {
		this.getEmployeeByIdUrl = getEmployeeByIdUrl;
	}
	public String getAddEmployeeUrl() {
		return addEmployeeUrl;
	}
	public void setAddEmployeeUrl(String addEmployeeUrl) {
		this.addEmployeeUrl = addEmployeeUrl;
	}
	public String getUpdateEmployeeUrl() {
		return updateEmployeeUrl;
	}
	public void setUpdateEmployeeUrl(String updateEmployeeUrl) {
		this.updateEmployeeUrl = updateEmployeeUrl;
	}
	public String getDeleteEmployeeUrl() {
		return deleteEmployeeUrl;
	}
	public void setDeleteEmployeeUrl(String deleteEmployeeUrl) {
		this.deleteEmployeeUrl = deleteEmployeeUrl;
	}
	public String getGetEmployeeByNameUrl() {
		return getEmployeeByNameUrl;
	}
	public void setGetEmployeeByNameUrl(String getEmployeeByNameUrl) {
		this.getEmployeeByNameUrl = getEmployeeByNameUrl;
	}
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}  

