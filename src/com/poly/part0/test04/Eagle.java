package com.poly.part0.test04;

public class Eagle extends Animal implements Bird, com.poly.part0.test03.Animal {
	//abstract 추상클래스는 1개 , 인터페이스는 여러개 가능
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("파닥파닥");
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("삐에잌삐이잌");
	}

}
