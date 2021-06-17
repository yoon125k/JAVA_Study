package com.example2;

import java.util.Scanner;

public class CastingSample {

	static Scanner sc = new Scanner(System.in);

	public void printUniCode() {

		System.out.print("문자 입력: ");
		String str = sc.nextLine();

		char str2 = str.charAt(0);
		int uni = str2;
		System.out.println(str  + " is unicode: " + uni);

	}

	public void calculatorScore() {

		System.out.print("국어: ");
		double kor = sc.nextDouble();
		System.out.print("영어: ");
		double eng = sc.nextDouble();
		System.out.print("수학: ");
		double mat = sc.nextDouble();

		int sum = (int) (kor + eng + mat);
		int avg = sum / 3;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}

}
