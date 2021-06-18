package com.practice;

import java.util.Scanner;

public class Example {
	public void sample1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		double avg = (double) sum / 3;

		System.out.println((true && 40 <= kor && 40 <= eng && 40 <= math && 60 <= avg) ? "합격" : "불합격");
	}

	public void sample2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = sc.nextLine();

		System.out.print("학년 : ");
		int grade = sc.nextInt();

		System.out.print("반 : ");
		int group = sc.nextInt();

		System.out.print("번호 : ");
		int num = sc.nextInt();

		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);

		System.out.print("성적 :");
		double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s학생은 성적이 %.2f이다.", grade, group, num, gender, score);
	}

	public void sample3() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		System.out.println((true && num > 0) ? "양수다" : "양수가 아니다");

	}

	public void sample4() {

		String str;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();

		str = (true && num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(str);

	}

}
