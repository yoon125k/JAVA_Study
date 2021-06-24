package com.test01;

import java.util.Scanner;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ForTest01.test1();
//		ForTest01.test2();
//		ForTest01.test3();

		ForTest01 tx = new ForTest01();
//		tx.test4();
		tx.test5();
	}

	public static void test1() {
		// 0 10 출력
		int no = 0;
		while (no <= 10) {
			System.out.println(no);
			no++;
		}
		System.out.println(("--------"));

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println(("--------"));
	}

	public static void test2() {
		// 역순
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println(("--------"));
	}

	public static void test3() {
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println(("--------"));

		for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
			System.out.println(i + "번쨰");
			System.out.println(j + "번쨰");
		}

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
		System.out.println();

		int i = 1;
		for (; i < 10;) { // i 가 사라진다
			System.out.println(i + " ");
			i++;
		}

	}

	public void test4() {
		// 1 부터 100 사이의 임의 난수 하나를 구한다음
		// 0 난수까지 합계

		int r = (int) (Math.random() * 100) + 1;
		int sum = 0;
		for (int i = 0; i <= r; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public void test5() {
		// 정수두개입력후
		// 작은수 큰수까지 합 구해 출력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;

		if (a < b) {
			for (int i = 1, j = a; i <= b && j <= b; i++, j++) {

				sum += j;

			}
			System.out.println(a + "부터" + b + "까지의 합은: " + sum);

		} else if (a > b) {
			for (int i = 1, j = b; i <= a && j <= a; i++, j++) {

				sum += j;

			}
			System.out.println(b + "부터" + a + "까지의 합은: " + sum);

		}

		/*
		 * int sum =0 , max =0 , min = 0;
		 * 
		 * if(num1 > num2) { max = num1; min = num2; }else{ max = num2; min = num1; }
		 * 
		 * for(int i = min; i<=max; i++){ sum +=i }
		 */
	}
}
