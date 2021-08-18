package com.test01;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ForTest02.test1();
		ForTest02.test2();
//		ForTest02.test3();
//		ForTest02.test4();
	}

	public static void test1() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}

	public static void test2() {
//		for (int i = 2; i < 10; i++) {
//			System.out.println("--- " + i + "단 ---");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " x " + j + " = " + i * j);
//			}
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("2_1: ");
//		int dan = sc.nextInt();
//		System.out.println(dan + "단");

		int dan = 2;
		int num = 1;
//			9번 반복 (2,3,4,5,6,7,8,9)8번 총72 <

		for (int i = 0; i < 72; i++) {
			if (num == 1) {
				System.out.println("---" + dan + "단---");
			}
			System.out.println(dan + " X " + num + " = " + dan * num);
			if (num == 9) {
				num = 1;
				dan++;
			} else {
				num++;
			}
		}

	}

	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3_1: ");
		int row = sc.nextInt();
		System.out.print("3_2: ");
		int col = sc.nextInt();
		for (int r = 1; r <= row; r++) {

			for (int c = 1; c <= col; c++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	public static void test4() {
		// 별표문자를
		// 입력된 줄수와 칸수만큼 출력
		// 단,아래와 같이 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("4_1: ");
		int row = sc.nextInt();
		System.out.print("4_2: ");
		int col = sc.nextInt();

		for (int r = 1; r <= row; r++) {
			for (int c = 1; c <= col; c++) {
				if (r == c) {
					System.out.print(r);
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
	}
}
