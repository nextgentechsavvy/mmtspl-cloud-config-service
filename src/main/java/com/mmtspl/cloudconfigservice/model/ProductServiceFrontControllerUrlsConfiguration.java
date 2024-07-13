package com.mmtspl.cloudconfigservice.model;


public class ProductServiceFrontControllerUrlsConfiguration   
{  
	private String baseUrl;  
	private String getAllProductUrl;  
	private String getProductByIdUrl;
	private String addProductUrl;
	private String updateProductUrl;
	private String deleteProductUrl;
	private String getProductByNameUrl;
	
	protected ProductServiceFrontControllerUrlsConfiguration() {
		
	}
	
	public ProductServiceFrontControllerUrlsConfiguration(String baseUrl, String getAllProductUrl, String getProductByIdUrl, String addProductUrl, String updateProductUrl, String deleteProductUrl, String getProductByNameUrl) {
		this.baseUrl =  baseUrl; 
		this.getAllProductUrl = getAllProductUrl;
		this.getProductByIdUrl =  getProductByIdUrl;
		this.addProductUrl =  addProductUrl;
		this.updateProductUrl =  updateProductUrl; 
		this.deleteProductUrl =  deleteProductUrl; 
		this.getProductByNameUrl =  getProductByNameUrl;	
	}
	

	public String getBaseUrl() {
		return baseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}
	public String getGetAllProductUrl() {
		return getAllProductUrl;
	}
	public void setGetAllProductUrl(String getAllProductUrl) {
		this.getAllProductUrl = getAllProductUrl;
	}
	public String getGetProductByIdUrl() {
		return getProductByIdUrl;
	}
	public void setGetProductByIdUrl(String getProductByIdUrl) {
		this.getProductByIdUrl = getProductByIdUrl;
	}
	public String getAddProductUrl() {
		return addProductUrl;
	}
	public void setAddProductUrl(String addProductUrl) {
		this.addProductUrl = addProductUrl;
	}
	public String getUpdateProductUrl() {
		return updateProductUrl;
	}
	public void setUpdateProductUrl(String updateProductUrl) {
		this.updateProductUrl = updateProductUrl;
	}
	public String getDeleteProductUrl() {
		return deleteProductUrl;
	}
	public void setDeleteProductUrl(String deleteProductUrl) {
		this.deleteProductUrl = deleteProductUrl;
	}
	public String getGetProductByNameUrl() {
		return getProductByNameUrl;
	}
	public void setGetProductByNameUrl(String getProductByNameUrl) {
		this.getProductByNameUrl = getProductByNameUrl;
	}
}  

