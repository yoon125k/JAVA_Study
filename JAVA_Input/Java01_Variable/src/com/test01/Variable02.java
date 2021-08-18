package com.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Variable02 {
	public static void main(String[] args) {
		//준비
		//클래스명 변수명 = new 클래스명 ();
		Variable02 test = new Variable02();
		
		test.input1();
		test.input2();
		
	}
	
	public void input1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 값 한개를 입력 하세요: ");
		String value;
		
		try {
			value = br.readLine(); // 문자열 형태로 저장
		
			//System.out.println(("계산 결과:" + (value*3));
			
			int no = Integer.parseInt(value);
			System.out.println("계산 결과:" + (no*3));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void input2() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.nextLine(); // 한줄을 읽어온다.
		
		System.out.println("Age:");
		int age = sc.nextInt();
		
		System.out.println("Height(소수점 첫쨰 자리까지):");
		double height = sc.nextDouble();
		
		System.out.println("Gender(F/M):");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0); // sc.next().charAt(0);
		
		System.out.println(name + "님은" + age + "세 이며, 키는" + height + "cm이며 성별은" + gender + " 입니다.");
		
	}
}
