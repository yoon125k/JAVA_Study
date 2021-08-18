package com.test01;

import java.util.Scanner;

public class Iftest01 {

	// 단독 if문
	// 조건식의 결과 값이 참(true)면 {} 안 코드를 실행
	// 조건식의 결과 값이 거짓(false)면 {} 안 코드를 무시하고 넘어간다.
	public void testIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한개를 입력: ");
		int num = sc.nextInt();

		// 짝수인지 조건확인
		if (num % 2 == 0) {
			System.out.println("짝수");
		}

		// 짝수가 아닌지 조건확인
		if (num % 2 != 0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료");
	}
}
