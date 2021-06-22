package com.silsub1.example;

import java.util.Scanner;

public class Munjae {
	
Scanner sc = new Scanner(System.in);

	public void test1() {

		System.out.print("국 영 수 점수: ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		int sum, avg;
		sum = kor + eng + math;
		avg = sum / 3;

		if ((kor >= 40 && eng >= 40 && math >= 40) && avg >= 60) {
			System.out.println("합격");
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
		} else {
			System.out.println("불합격");
		}

	}

	public void test2() {

		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");

		System.out.print("입력: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("입력메뉴가 선택되었습니다.");
			break;
		case 2:
			System.out.print("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.print("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.print("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.print("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 다시 입력하십시오");

		}

	}

	public void test3() {
		System.out.print("정수입력: ");
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수");
		} else {
			System.out.println("양수가 아니다.");
		}

	}

	public void test4() {
		System.out.print("정수입력: ");
		int a = sc.nextInt();

		if (a > 0) {
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			System.out.println("양수가 아니다.");
		}
	}

	public void test5() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();

		if (name != null && name.length() > 0 && age > 0 && height > 0) {
			System.out.println("이름: " + name);
			System.out.println("나이: " + age);
			System.out.println("키: " + height);
			System.out.printf("확인: %s 의 나이는 %d이고, 키는 %.1f cm이다.", name, age, height);
		}
	}

	public void test6() {
		System.out.print("첫번쨰 정수: ");
		int a = sc.nextInt();
		System.out.print("두번쨰 정수: ");
		int b = sc.nextInt();

		if (a > 0 && b > 0) {
			System.out.println(a + " + " + b + " = " + (a + b));
			System.out.println(a + " - " + b + " = " + (a - b));
			System.out.println(a + " * " + b + " = " + (a * b));
			System.out.println(a + " / " + b + " = " + (a / b));
			System.out.println(a + " % " + b + " = " + (a % b));
		}
	}

	public void test7() {
		System.out.print("점수 입력: ");
		int a = sc.nextInt();
//		
//		while (a < 0) {
//			System.out.print("올바른 점수를 입력하세요: ");
//			a = sc.nextInt();
//		}
		
		
 		char c = ' ';

 		if( a>0) {
			if (a > 60) {
				if (a >= 90) {
					c = 'A';
				} else if (80 <= a && a < 90) {
					c = 'B';
				} else if (70 <= a && a < 80) {
					c = 'C';
				} else if (60 <= a && a < 70) {
					c = 'D';
				}
			}else { 
				c = 'F';
			}
//		System.out.println("점수: " + a);
//		System.out.println("학점: " + c);
		System.out.printf("점수는 %d 학점은 %c 이다.",a,c);
 		}else {
 		System.out.println("올바른 점수를 입력하세요.");
 		}
	}
}
