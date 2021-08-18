package com.poly.part0.test06;

public abstract class Areaimpl implements Area {

	private String result;

	@Override
	public void print() {
		System.out.println(Area.print + result);
		// super < static이라서 주소에 접근 x
		// static 프로그램이 시작되면 준비가 된다.
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public abstract void make();
	// abstract 를 붙이면 부모추상클래스의
	// 추상메소드를 무조건 구현하지 않아도 된다. 단 언젠가 어디서는 구현되어야한다.

}
