package com.shangxin.bean;

public class SearchInfo {
	
	private String drugNumber;
	private String drugName;
	private int stock;
	private int sellStock;
	
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getSellStock() {
		return sellStock;
	}
	public void setSellStock(int sellStock) {
		this.sellStock = sellStock;
	}
}
