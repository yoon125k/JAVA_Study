package com.test04;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		int num1 = sc.nextInt();

		System.out.print("연산자: ");
		char ch = sc.next().charAt(0);

		System.out.print("숫자: ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			switch (ch) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			default:
				System.out.println(" 연산자가 올바르지 않습니다.");
				break;
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}
}
