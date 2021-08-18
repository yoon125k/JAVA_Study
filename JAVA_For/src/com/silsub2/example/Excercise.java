package com.silsub2.example;

import java.util.Scanner;

public class Excercise {

	public void excercise1() {

		int x = 0, y = 0;



		for (int i = 0; i < 5; i++) {
			for (int j = 1 + (5 * i); j <= 5 + (5 * i); j++) {
				System.out.print(j + " ");
				if (j % 6 == 1) {
					x += j;
//				System.out.print("x: " + j);
				} else if (j % 4 == 1) {
					y += j;
//					System.out.print("y:" + j);					
				}

			}
			System.out.println();

		}
//			System.out.println("x: " + x);
//		System.out.println("y: " + y);
		System.out.println("x의 합은: " + (x + y));

	}

	public void excercise2() {

		int ran = (int) ((Math.random() * 100) + 1);
		int cnt = 0;
		int input = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println(ran);

		while (input != ran) {
			System.out.print("입력: ");
			input = sc.nextInt();
			if (input < ran) {
				System.out.println("입력하신 정수보다 작습니다.");
				cnt++;
			} else if (input > ran) {
				System.out.println("입력하신 정수보다 큽니다.");
				cnt++;
			}

		}
		System.out.println("정답입니다." + cnt + "회 만에 정답을 맞추셨습니다.");

	}
}
