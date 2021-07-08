package com.poly.part0.test02;

public abstract class Base {
	// 추상 클래스
	// 추상 메소드를 포함한 클래스
	// 객체 생성 x , 상속하여 객체 생성
	// abstract 만 붙이면 일반메소드만 있어도 추상클래스
	
	public Base() {
		System.out.println("base 생성");
	}
	
	public abstract void start();
	public abstract void stop();
}
