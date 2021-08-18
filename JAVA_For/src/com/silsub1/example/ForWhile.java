package com.silsub1.example;

import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);

	public void printStar1() {

		System.out.print("1_1: ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
				if (i != num) {
					for (int j = 1; j <= i; j++) {
						System.out.print('*');
					}
				}
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void printStar2() {

		System.out.print("2_1: ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.println();
				for (int j = 1; j <= i; j++) {
					System.out.print('*');

				}
			}
		} else if (num < 0) {
			for (int i = 1; i <= Math.abs(num); i++) {
				for (int j = Math.abs(num); j >= i; j--) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}

	public void countInputCharacter() {
		System.out.print("3_1: ");
		String st = sc.next(); // apple
		System.out.print("3_2: ");
		char ch = sc.next().charAt(0); // p

		int cnt = 0;
		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) < 'A' || st.charAt(i) > 'z') {
				System.out.println("영문자가 아닙니다");
				return;
			}
		}
		for (int j = 0; j <= st.length() - 1; j++) { // 5번
			if (st.charAt(j) == ch) {
				cnt += 1;
			}
		}
		System.out.println("포함된 갯수: " + cnt);

	}

}
