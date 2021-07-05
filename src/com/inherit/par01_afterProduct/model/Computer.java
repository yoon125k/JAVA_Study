package com.inherit.par01_afterProduct.model;

import java.util.Date;

public class Computer extends Product {
	// product 클래스를 상속 받고 데스크탑,스마트폰의 공통 속성을 추출하여 정의

	private String cpu;
	private int hdd; // hdd
	private int ram; // ram
	private String os; // 운영체제
	
	

	public Computer() {

	}

	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int hdd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.os = os;
		
		System.out.println("Product 상속 받은 Computer 클래스 생성자 호출...");
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public int getRam() {
		return ram;
	}

	public String getOs() {
		return os;
	}


	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setOs(String os) {
		this.os = os;
	}



	public String printInformation() {
		return super.printInformation() + "," + cpu + "," + hdd + "," + ram + "," + os;
	}
}
