package com.inherit.par01_afterProduct.model;

import java.util.Date;

public class Desktop extends Computer {

	private boolean allInOne;

	public Desktop(String brand, String productNumber, String productCode, String productName, String cpu, int hdd,
			int ram, String os, int price, Date date, boolean allInOne) {
		super(brand, productNumber, productCode, productName, price, date, cpu, hdd, ram, os);
		this.allInOne = allInOne;
		
		System.out.println("Computer 상속 받은 Desktop 클래스 생성자 호출...");
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	public String printinformation() {
		return super.printInformation() + "," + allInOne;
	}

}
