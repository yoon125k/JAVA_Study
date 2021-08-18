package com.poly.part0.test01;

public abstract class Animal {
	// 추상 클래스
	// 추상 메소드를 포함한 클래스
	// 객체 생성 X
	// 참조형 변수 타입으로는 사용 가능

	public abstract void bark();
	// 실행부가 없음
	// 추상 메소드
	// 반드시 구현
	
	public void eat(String animal) {
		System.out.println(animal + " 먹는다.");
	}

}
