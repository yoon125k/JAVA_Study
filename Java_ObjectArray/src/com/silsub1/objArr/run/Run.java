package com.silsub1.objArr.run;

import com.silsub1.objArr.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체생성
		Student st1 = new Student(3, 1, 1, "홍길동");
		Student st2 = new Student(4, 3, 2, "유관순");
		Student st3 = new Student(2, 7, 5, "윤봉길");

		// 객체배열
		// 객체 배열 null 값 들어가 있음
		Student[] objArr = new Student[3];

		// 객체의 주소값을 null값이 들어있는 곳에 넘김
		objArr[0] = st1;
		objArr[1] = st2;
		objArr[2] = st3;

		// 출력
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i].information());
		}

	}

}
