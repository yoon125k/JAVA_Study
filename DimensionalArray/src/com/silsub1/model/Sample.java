package com.silsub1.model;

import java.util.Random;
import java.util.Scanner;

public class Sample {
	public void munjae1() {

		// 랜덤 정수값
		int[][] arr = new int[3][3];
		Random rand = new Random();

		// 랜덤 숫자
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100) + 1;
			}
		}

		int[][] result = new int[4][4];
		int tot = 0;

		// 가로 합계
		for (int i = 0; i < arr.length; i++) {
			int row = 0;
			for (int j = 0; j < arr[i].length; j++) {
				result[i][j] = arr[i][j];
				row += result[i][j];
				result[i][3] = row;

			}
			tot += result[i][3];

		}

		// 세로 합계
		for (int i = 0; i < arr.length; i++) {
			int column = 0;
			for (int j = 0; j < arr[i].length; j++) {
				column += result[j][i];
				result[3][i] = column;

			}
			tot += result[3][i];
		}

		// 가로 세로 총 합계
		result[3][3] = tot;

		// 배열 표시
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void munjae2() {

		int[][] arr = new int[3][];
		int[] sum = new int[arr.length];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.print("열 입력: ");
			int row = sc.nextInt();
			arr[i] = new int[row];
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(arr[i][j] + " ");

				sum[i] += arr[i][j];
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.println(i + 1 + "행: " + sum[i]);
			}
		}
	}

}
