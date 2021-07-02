package com.silsub2.student.controller;

import java.util.Scanner;

import com.silsub2.student.model.vo.Student;

public class TestStudentArray {

	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		char check;
		int cnt = 0;
		
		int sumK =0;
		int sumE =0;
		int sumM =0;
		
		Scanner sc = new Scanner(System.in);

		// 객체배열
		// null 값이 들어가 있음
		Student[] objArr = new Student[10];

		// 객체생성
		do {
			System.out.println("입력 학생수(최대 10명):" + cnt + "명");
			System.out.print("추가하시겠습니까?(y,Y): ");
			check = sc.next().charAt(0);
			if (check == 'y' || check == 'Y') {
				cnt++;
				System.out.print("학년: ");
				int gender = sc.nextInt();
				System.out.print("반: ");
				int classroom = sc.nextInt();
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("국어점수: ");
				int kor = sc.nextInt();
				System.out.print("영어점수: ");
				int eng = sc.nextInt();
				System.out.print("수학점수: ");
				int math = sc.nextInt();

				Student st = new Student(gender, classroom, name, kor, eng, math);
				objArr[cnt - 1] = st;

				sum = kor + eng + math;
				avg = sum / 3;
				System.out.println(name + "의 평균은: " + avg);
				
				sumK += kor;
				sumE += eng;
				sumM += math;

			} else if (check != 'y' || check != 'Y') {
				System.out.println("종료");
				break;
			}
		} while (cnt < objArr.length);

		// 모든 정보 출력
		if (cnt > 0) {
			
			System.out.println("총 국어평균: " + (sumK/cnt));
			System.out.println("총 영어평균: " + (sumE/cnt));
			System.out.println("총 수학평균: " + (sumM/cnt));

			for (int i = 0; i < cnt; i++) {
				System.out.println(objArr[i].information());
			}
		} else if (cnt < 1) {
			System.out.println("불러올 학생 정보가 없음");
		}

	}

}
