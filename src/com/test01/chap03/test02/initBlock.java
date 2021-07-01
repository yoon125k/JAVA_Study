package com.test01.chap03.test02;

public class initBlock {
	
	private String pName = "아이폰";
	private int price = 1900000;
	private static String brand = "애플";
	
	//JVM 기본값 초기화 
	
	{
		pName = "갤럭시";
		price = 1000000;
		brand = "삼성";
	}
	
	static {
//		pName = "벨벳";
//		price = 500000;
		brand = "LG";
	}
	
	//생성자 
	public initBlock() {
		
	}
	
	public initBlock(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		initBlock.brand = brand;
	}
	public void information() {
		System.out.println(pName + ", " + price + ", " + brand);
	}
}
