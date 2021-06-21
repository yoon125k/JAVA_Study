package com.test01;

import java.util.Scanner;

public class Iftest02 {

	public void test() {
		int i = 20;

		if (i < 10) {
			System.out.println(i + "은 10보다 작습니다.");
		} else {
			System.out.println(i + "은 10보다 크거나 같습니다.");

		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한개를 입력: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	public void test3() {
		// 숫자 하나 입력
		// 50보다 큰 수라면 짝수,홀수 출력
		// 50보다 작은수는 작다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한개를 입력: ");
		int num = sc.nextInt();

		if (num >= 50) {
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");

			}
		} else {
			System.out.println("50보다 작다");
		}

	}

	public void test4() {
		// 숫자 하나 입력 받아 양수 음수 출력
		// 0이면 0입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자하나 입력: ");
		int num = sc.nextInt();

		/*
		 * if(num > 0) { 
		 * System.out.println("양수"); }else if (num < 0) {
		 * System.out.println("음수"); }else { System.out.println("0입니다."); }
		 */
		if (num != 0) {
			if (num > 0) {
				System.out.println("양수");
			} else if (num < 0) {
				System.out.println("음수");
			} 
				
			}else {
				System.out.println("0입니다.");
			}
		
	}
}
