package com.test04;

import java.util.Scanner;

public class test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt()% 12;

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int n = i; n >= 1; n--) {
				System.out.print(n >= 10 ? " " + n : " " + n);

			}
			for (int n = 2; n <= i; n++) {
				System.out.print(n >= 10 ? " " + n : " " + n);
				System.out.println();
			}
		}

	}
}
