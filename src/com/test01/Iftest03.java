package com.test01;

import java.util.Scanner;

public class Iftest03 {
	// else if : 다중 조건을 줄 수 있는 문법.

	public void test() {
		int i = 10;
		int j = 20;

		if (i > j) {
			System.out.println(i + "은" + j + " 보다 큽니다.");
		} else if (i == j) {
			System.out.println(i + "은" + j + " 과 같습니다.");
		} else {
			System.out.println(i + "은" + j + " 보다 작습니다.");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();

		if (60 <= score) {
			if (90 <= score) {
				System.out.println("A등급");
			} else if (80 <= score && score < 90) {
				System.out.println("B등급");
			} else if (70 <= score && score < 80) {
				System.out.println("C등급");
			} else if (60 <= score && score < 70) {
				System.out.println("D등급");
			}
		} else {
			System.out.println("F등급");
		}

	}

	public void test3() {
		// 위의 문제에 각 등급별 중간 점수 이상의 경우에는 등급에 " + " 를 추가하여 출력
		// ex ) 95 점 이상은 등급이 A+로 출력되게 함.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int score = sc.nextInt();

		if (60 <= score) {
			if (90 <= score) {
				if (95 <= score) {
					System.out.println("A+등급");
				} else {
					System.out.println("A등급");
				}

			} else if (80 <= score && score < 90) {
				if (85 <= score) {
					System.out.println("B+등급");
				} else {
					System.out.println("B등급");
				}
			} else if (70 <= score && score < 80) {
				if (75 <= score) {
					System.out.println("C+등급");
				}else {
				System.out.println("C등급");
				}
			} else if (60 <= score && score < 70) {
				if(65 <= score) {
					System.out.println("D+등급");
				}else {
				System.out.println("D등급");
			}
		} 
			}else{
			System.out.println("F등급");
		}
	
	}
}

