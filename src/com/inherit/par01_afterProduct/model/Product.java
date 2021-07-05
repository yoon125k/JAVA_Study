package com.inherit.par01_afterProduct.model;

import java.util.Date;

public class Product {

	private String brand; // 제조사
	private String productNumber; // 상품번호
	private String productCode; // 상풍코드
	private String productName; // 상품명
	private int price; // 가격
	private Date date; // 제조일자

	public Product() {
		super();
	}

	public Product(String brand, String productNumber, String productCode, String productName, int price, Date date) {
		super();
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.price = price;
		this.date = date;
	}

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

	public String printInformation() {
		return brand + "," + productNumber + "," + productCode + "," + productName + "," + price + "," + date;
	}
}
