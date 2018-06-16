package com.shangxin.bean;

import java.sql.Date;

public class DrugInfo {

	public String drugNumber;
	public String drugName; 
	public Date productDate;
	public String safeDate;
	public String supplierId;
	public float price;
	public float purchasePrice;
	public int stock;
	public int typeId;
	public String remakes;
	
	public String getDrugNumber() {
		return drugNumber;
	}
	public void setDrugNumber(String drugNumber) {
		this.drugNumber = drugNumber;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public String getSafeDate() {
		return safeDate;
	}
	public void setSafeDate(String safeDate) {
		this.safeDate = safeDate;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getRemakes() {
		return remakes;
	}
	public void setRemakes(String remakes) {
		this.remakes = remakes;
	}
	
	
}
