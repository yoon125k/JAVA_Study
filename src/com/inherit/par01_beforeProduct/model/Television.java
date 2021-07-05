package com.inherit.par01_beforeProduct.model;

import java.util.Date;

public class Television {
	private String brand; // 제조사
	private String productNumber; // 상품번호
	private String productCode; // 상풍코드
	private String productName; // 상품명
	private int price; // 가격
	private Date date; // 제조일자
	private int inchType; // 인치

	public Television() {

	}

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date,
			int inchType) {
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;

		this.price = price;
		this.date = date;
		this.inchType = inchType;
	}

// getter setter
	public String getBrand() {
		return brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public Date getDate() {
		return date;
	}

	public int getInchType() {
		return inchType;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}

	public void information() {
		System.out.println(brand + "," + productCode + "," + productName + "," + productNumber + "," + price + ","
				+ date + "," + inchType);
	}
}