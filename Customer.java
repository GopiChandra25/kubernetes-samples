package com.fis.amm.validation.rest;

public class Customer {
	
	private String customerId;
	private String writerName;
	private String branch;
	private String productId;
	private Double cmpPrice;
	private String priceCategory;
	private Double newPrice;
	private String matrixId;
	private String dateCreated;
	private String exprirationDate;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getCmpPrice() {
		return cmpPrice;
	}
	public void setCmpPrice(Double cmpPrice) {
		this.cmpPrice = cmpPrice;
	}
	public String getPriceCategory() {
		return priceCategory;
	}
	public void setPriceCategory(String priceCategory) {
		this.priceCategory = priceCategory;
	}
	public Double getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(Double newPrice) {
		this.newPrice = newPrice;
	}
	public String getMatrixId() {
		return matrixId;
	}
	public void setMatrixId(String matrixId) {
		this.matrixId = matrixId;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getExprirationDate() {
		return exprirationDate;
	}
	public void setExprirationDate(String exprirationDate) {
		this.exprirationDate = exprirationDate;
	}
	

}
