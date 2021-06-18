package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		
		//static method 준비과정 x
		//클래스명.메소드명();
		
		//Operator01.test();
		
		
		Operator01 test = new Operator01();
		test.test2();
		
	}
	
	public static void test() {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		System.out.println("true의 부정: " + !true);
		System.out.println("fasle의 부정: " + !false);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("입력한 정수가 양수인가? " + (num>0));
		System.out.println("입력한 정수가 양수가 아닌가? " + !(num>0));
		
		System.out.println("입력한 정수가 짝수인가? " + (num % 2 == 0));
		System.out.println("입력한 정수가 짝수가 아닌가? " + !(num % 2 == 0));
	}
	
	public void test2() {
		// ++ : 1증가 , ++값, 값++로 사용
		// -- : 1감소, --값, 값--로 사용
		
		int age = 20;
		
		System.out.println("현재 나이는? " + age);
		
		++age;
		System.out.println("++age의 결과는? " + age);	
		
		age++;
		System.out.println("age++의 결과는? " + age);	
		
		--age;
		System.out.println("--age의 결과는? " + age);
		
		age--;
		System.out.println("age--의 결과는? " + age);
		
		//----------------
		
		int num1 = 20;
		
		//후위연산자
		int res = ++num1 * 3;
		
		System.out.println("res: " + res);
		System.out.println("num1: " + num1);
	}
}
