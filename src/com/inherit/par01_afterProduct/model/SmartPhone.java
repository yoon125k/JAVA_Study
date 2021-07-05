package com.inherit.par01_afterProduct.model;

import java.util.Date;

public class SmartPhone extends Computer {

	private String mobileAgency; // 통신사



	public SmartPhone(String brand, String productNumber, String productCode, String productName,
			String cpu, int hdd, int ram, String os, int price, Date date, String mobileAgency) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		
		this.mobileAgency = mobileAgency;
		
		System.out.println("Computer 상속 받은 SmartPhone 클래스 생성자 호출...");
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String printInformation() {
		return super.printInformation() + "," + mobileAgency;
	}

}
