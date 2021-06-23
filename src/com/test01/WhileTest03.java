package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 1 100 까지 역순 출력
		WhileTest03.prn01();

		// 2. 1 100까지 2의 배수
		WhileTest03.prn02();

		// 3. 1 100까지 7의 배수 개수 총합
		WhileTest03.prn03();

	}

	public static void prn01() {

		int i = 100;
		while (i != 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("----------");
	}

	public static void prn02() {
		int i = 1;
		while (i != 101) {

			if (i % 2 == 0) {
				System.out.println(i);

			}
			i++;
		}
		System.out.println("----------");
	}

	public static void prn03() {
		int i = 1;
		int count = 0;
		int sum = 0;

		while (i != 101) {

			if (i % 7 == 0) {
				count += 1;
				sum += i;
			}
			i++;
		}

		System.out.println("1 100의 7의 배수 개수: " + count);
		System.out.println("1 100의 7의 배수 총합: " + sum);
	}
}
