package com.test01;

public class Varibale01 {
	// 타입 변수명 = 값(리터널);
	// 타입: 생성할 변수에 어떤 종류의 값이 들어갈지
	// 변수명: 변수의 이름
	// 값(리터널) : 변수에 들어갈 데이터
	public static void main(String[] args) {
	
	//1. 메소드 실행 준비
	// 클래스명 변수명 = new 클래스명();
	Varibale01 test = new Varibale01();
	
	//2. 메소드 실행
	// 변수명.메소드명();
	test.declareVaribale();
	test.initVariable();
	}
	
	public void declareVaribale() {
		byte bnum;
		short snum;
		int inum;
		long lnum;
		
		double dnum;
		float fnum;
		
		boolean isTrue;
		
		//문자형
		char ch;
		//문자열(참조형)
		String str;

		//------------------
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 2.0;
		
		isTrue = true;
		
		ch = 'S';
		str = "Hello";
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	public void initVariable() {
		
		byte bnum = 1;
		short snum = 2;
		int inum = 4;
		long lnum = 8;
		
		float fnum = 4.0f;
		double dnum = 8.0;
		
		boolean isTrue = true;
		
		char ch = 'A';
		String str = "ABC";
		
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
	}
}
