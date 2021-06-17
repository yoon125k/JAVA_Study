package com.test01;

public class Variable05 {
	public static void main (String[] args) {
		Variable05 va = new Variable05();
		
		va.test1();
		va.test3();
	}
	
	public void test1() {
		boolean flag = true;
		//flag = (boolean)100; // boolean 자료형은 무조건 true,false만 들어간다. 형변환의 예외적
		
		// 자료형이 다르더라도 작은 크기의 변수 타입은 큰 변수 타입으로 저장이 가능 ( 자동형변환, 묵시정형변환, upcasting)
		// 큰 변수 타입은 작은 변수 타입으로 자동 변환이 되지 않아 형변환을 명시해야한다.( 강제형변환, 명시적형변환, downcasting)
		
		int num = 'A';
		System.out.println("num: " + num);
		
		char ch = 98;
		System.out.println("ch: " + ch);
		
		char ch2 = (char)num;
		System.out.println("ch2" + ch2);
		
		int num2 = -98;
		char ch3 =(char)num2;
		System.out.println("ch3: " + ch3);
	}
	public void test2() {
		
		int inum = 10;
		long lnum = 100;
		
		int isum = (int)(inum + lnum);
		// long lsum = inum + lnum;
		// int isum = inum + (int)lnum;
		
		byte bnum = 1;
		short snum = 2;
		
		short sum = (short)(bnum + snum);
		
	}
	
	public void test3() {
		long lnum = 100;
		
		float fnum = lnum;
		
		System.out.println("fnum: " + fnum);
		
		double dnum = 12.3;
		
		int inum = (int)dnum;
		
		System.out.println("inum: " + inum);
	}
}
