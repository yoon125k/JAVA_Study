package com.poly.part0.test06;

import java.util.Scanner;

public class Square extends Areaimpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로: ");
		int x = sc.nextInt();
		System.out.print("세로: ");
		int y = sc.nextInt();
		
		int res = x * y;
		setResult(String.valueOf(res)); // res <- 스트링 에러, (+ "" 함으로써 스트링으로 형변환) 
		// 또는 타입.valueOf(변환변수) 로 형변환
	}
	
	@Override
	public void print() {
		System.out.println("사각형의");
		super.print();
	}

}
