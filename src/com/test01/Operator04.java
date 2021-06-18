package com.test01;

import java.util.Scanner;

public class Operator04 {
	public static void main(String[] args) {
		
		new Operator04().opTest();
	}
	
	//3항 연산자 : 항목이 3개, (조건식) ? 참일 떄 값1 : 거짓일 떄 값 2;
	
	public void opTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		// String res = (num>0)? "양수" : "양수가 아니다";
		String res = (num>0)? "양수" : (num==0)?"0이다":"음수";
		
		System.out.println(res);
	}

}
