package com.test02;

import java.util.Scanner;

public class OperatorTest01 {

	static Scanner sc = new Scanner(System.in);

	public void and() {
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		System.out.println((true && num > 0 ? "양수" : (true && num == 0 ? "0" : "음수")));
	}

	public static void or() {
		System.out.print("m or M이 맞는가?:  ");

		char a = sc.next().charAt(0);
		System.out.println((a == 'M' || a == 'm' ? "맞음" : "틀림"));
	}
	


}
