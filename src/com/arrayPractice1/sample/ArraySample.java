
package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {

		int[] arr = new int[10];
		Random rand = new Random();

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int ran = rand.nextInt(100) + 1;
			arr[i] = ran;
			System.out.print(arr[i] + " ");
			sum += arr[i];

		}
		System.out.println("10개 정수의 총합: " + sum);

	}

	public void test2() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + " ");

		}
		int max = arr[0];
		int min = arr[0];

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			} else if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println();

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}

	public void test3() {
		byte[] arr = new byte[10];
		Random rand = new Random();
		rand.nextBytes(arr);
		byte sum = 0;

		for (byte i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수 총합: " + sum);

	}

	public void test4() {

		Scanner sc = new Scanner(System.in);
		System.out.print("4_1 문자열 입력 : ");
		String nu = sc.next();

		String[] arr = new String[nu.length()];
		int[] _int = new int[nu.length()];
		int sum = 0;

		for (int i = 0; i < nu.length(); i++) {

			arr[i] = nu.substring(i, i + 1);
			_int[i] = Integer.parseInt(arr[i]);

			sum += _int[i];

		}
		System.out.println("합계: " + sum);

	}

	public void test5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("5_1 문자열 입력: ");
		String str = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println("-------------------");
		System.out.println("합계: " + sum);
		
//		String nu = sc.next();
//
//		char[] arr = new char[nu.length()];
//		String[] str1 = new String[nu.length()];
//		int[] _int = new int[nu.length()];
//		int sum = 0;
//
//		for (int i = 0; i < nu.length(); i++) {
//			arr[i] = nu.charAt(i);

		}

	}


