package com.test01.chap03.test01;


// 변수 선언 위치에 따른 구분
public class Variable01 { // class 시작
	
	//class 영역 안
	// 필드 == 멤버변수 ( 클래스가 가지는 멤버라는 의미 ) == 전역변수 (클래스 전역에서 사용할 수 있는 변수라는 의미)
	private int globalNum;

	public void testMethod(int num) { // method 영역의 시작
		//메소드 영역에서 작성하는 변수를 지역변수
		int localNum = 0;
		
		System.out.println(num);
		System.out.println(localNum);
		System.out.println(globalNum);
	} //method 영역 끝
	
	public void testMethod2(int num) {
		System.out.println(globalNum);
//		System.out.println(localnum);
		
		for(int i=0; i<5; i++) {}
//		System.out.println(i);  //i는 일종의 지역변수 
	}
} // class 끝
