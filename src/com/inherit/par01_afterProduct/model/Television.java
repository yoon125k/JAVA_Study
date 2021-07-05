package com.inherit.par01_afterProduct.model;

import java.util.Date;

public class Television extends Product {

	private int inchType;

	public Television() {
//		super();
	}

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date,
			int inchType) {
//		super(); //생략
		
		super(brand,productNumber,productCode,productName,price,date);
		
		this.inchType = inchType;
	}

	public int getInchType() {
		return inchType;
	}

	public void setInchType(int inchType) {
		this.inchType = inchType;
	}

	public String printInformation() {
		return super.printInformation() + "," + inchType;

	}

}
