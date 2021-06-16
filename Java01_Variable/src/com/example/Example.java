package com.example;

import java.util.Scanner;

public class Example {

	public void example1(){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("첫번쨰 정수: ");
		int a = sc1.nextInt();
		System.out.println("두번쨰 정수: ");
		int b = sc1.nextInt();
		
		System.out.println("더하기 결과 : " + (a + b));
		System.out.println("빼기 결과 : " + (a - b));
		System.out.println("곱하기 결과 : " + (a * b));
		System.out.println("나누기한 몫 : " + (a / b));
		System.out.println("나누기한 나머지 : " + (a % b));
		
		
	}
	
	public void example2(){
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("가로 : ");
		double a = sc2.nextDouble();
		System.out.println("세로 : ");
		double b = sc2.nextDouble();
		
		System.out.println("면적 : " + (a * b));
		System.out.println("둘레 : " + (a + b) * 2);
	}
	
	 public void example3(){
		 
		 Scanner sc3 = new Scanner(System.in);
		 System.out.println("문자열을 입력하시오 : ");
		 String str = sc3.nextLine();
		 
		 char a = str.charAt(0);
		 char b = str.charAt(1);
		 char c = str.charAt(2);
		 
		 System.out.println("첫번쨰 문자 :" + a);
		 System.out.println("두번쨰 문자 :" + b);
		 System.out.println("세번쨰 문자 :" + c);
	 }
}

