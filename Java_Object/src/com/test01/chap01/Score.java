package com.test01.chap01;

public class Score {

	private String name = "김아무";
	private int kor = 90;
	private int eng = 84;
	private int math = 97;

	// 총합을 구해 출력하는 메소드
	public void sum() {
		System.out.println("총합은 : " + (kor + eng + math));
	}

	// 평균을 구해 출력하는 메소드
	public void avg() {
		System.out.println("평균은 : " + ((kor + eng + math) / 3));
	}

	// 평균점수를 구해 등급을 출력하는 메소드
	public void grade() {
		int avg = (kor + eng + math) / 3;
		if (avg >= 90) {
			System.out.println('A');
		} else if (avg >= 80) {
			System.out.println('B');
		} else if (avg >= 70) {
			System.out.println('C');
		} else if (avg >= 60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
	}

	// 필드값을 출력하는 메소드
	public void prn() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
	}
}
