package com.chap03_myException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int no = sc.nextInt();

		try {
			checkNum(no);
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void checkNum(int num) throws MyException {
		if (num < 10) {
			/*
			 * MyException me = new MyException(); 
			 * throw me;
			 */

			throw new MyException(num + "은 10보다 작은 숫자");

		} else {
			System.out.println(num + "은 10보다 크거나 같은 수");
		}
	}

}
