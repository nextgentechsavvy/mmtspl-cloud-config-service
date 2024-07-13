package com.mmtspl.cloudconfigservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  


@Component  
@ConfigurationProperties("department-service-rest-api")
public class DepartmentServiceFrontControllerUrlsCloudConfiguration   
{  
	
	private String baseUrl;  
	private String getAllDepartmentUrl;  
	private String getDepartmentByIdUrl;
	private String addDepartmentUrl;
	private String updateDepartmentUrl;
	private String deleteDepartmentUrl;
	private String getDepartmentByNameUrl;
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	
	public String getGetAllDepartmentUrl() {
		return getAllDepartmentUrl;
	}
	public void setGetAllDepartmentUrl(String getAllDepartmentUrl) {
		this.getAllDepartmentUrl = getAllDepartmentUrl;
	}
	public String getGetDepartmentByIdUrl() {
		return getDepartmentByIdUrl;
	}
	public void setGetDepartmentByIdUrl(String getDepartmentByIdUrl) {
		this.getDepartmentByIdUrl = getDepartmentByIdUrl;
	}
	public String getAddDepartmentUrl() {
		return addDepartmentUrl;
	}
	public void setAddDepartmentUrl(String addDepartmentUrl) {
		this.addDepartmentUrl = addDepartmentUrl;
	}
	public String getUpdateDepartmentUrl() {
		return updateDepartmentUrl;
	}
	public void setUpdateDepartmentUrl(String updateDepartmentUrl) {
		this.updateDepartmentUrl = updateDepartmentUrl;
	}
	public String getDeleteDepartmentUrl() {
		return deleteDepartmentUrl;
	}
	public void setDeleteDepartmentUrl(String deleteDepartmentUrl) {
		this.deleteDepartmentUrl = deleteDepartmentUrl;
	}
	public String getGetDepartmentByNameUrl() {
		return getDepartmentByNameUrl;
	}
	public void setGetDepartmentByNameUrl(String getDepartmentByNameUrl) {
		this.getDepartmentByNameUrl = getDepartmentByNameUrl;
	}
}  

