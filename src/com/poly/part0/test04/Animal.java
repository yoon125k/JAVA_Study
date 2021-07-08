package com.poly.part0.test04;

public abstract class Animal {
	//추상 메소드를 포함한 클래스
	//객체 생성 x, 상속하여 객체 생성
	//abstract 만 붙이면 일반메소드가 있어도 추상클래스
	
	public void eat(String feed) {
		System.out.println(feed + " 먹는다!!");
	}

	public abstract void bark();
}
