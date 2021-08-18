package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.opTest1();
		test.opTest2();
	}
	
	// && 그리고
	// || 또는 
	// 논리값  && 논리값,논리값 || 논리값,
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		System.out.println("1부터 100사이인지 확인: " + (1 <= num && num <= 100));
		
		System.out.println("문자 입력: ");
		char ch = sc.next().charAt(0);
		//대문자인지 확인
		int a = (int)ch;
		System.out.println("영 대문자인지 확인: " + (65 <= a && a <= 90));
		System.out.println("영 대문자인지 확인: " + ('A' <= ch && ch <= 'Z'));
	
		//||
		// 입력한 문자가 대소문자 상관없이 'y' 'Y'인지 확인 할떄
		System.out.println("계속 하시려면 y 또는 Y를 입력하세요: ");
		char ch2 = sc.next().charAt(0);
		System.out.println("영문자 y인지 확인: " + (ch2 == 'y' || ch2 == 'Y'));
	}
	
	public void opTest2() {
		int num = 10;
		
		int res = (true && ++ num > 0)? num+1 : num+2;
		System.out.println("&&확인: " + num );
		System.out.println(res);
	}
}
