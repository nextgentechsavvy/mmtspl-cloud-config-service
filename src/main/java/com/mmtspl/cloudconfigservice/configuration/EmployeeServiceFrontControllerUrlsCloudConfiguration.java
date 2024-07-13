package com.mmtspl.cloudconfigservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("employee-service-rest-api")
public class EmployeeServiceFrontControllerUrlsCloudConfiguration   
{  
	
	private String baseUrl;  
	private String getAllEmployeeUrl;  
	private String getEmployeeByIdUrl;
	private String addEmployeeUrl;
	private String updateEmployeeUrl;
	private String deleteEmployeeUrl;
	private String getEmployeeByNameUrl;
	
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
}  

