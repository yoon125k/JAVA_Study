package com.poly.part0.test06;

import java.util.Scanner;

public class Circle extends Areaimpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int r = sc.nextInt();
		
		double res = r*r*Math.PI;
		
		String result = String.format("%.2f",res);
		// String으로 변경
		super.setResult(result);
	}
	@Override
	public void print() {
		System.out.println("원의");
		super.print();
	}

}
