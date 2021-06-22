package com.test01;

import java.util.Scanner;

public class SwitchTest02 {
	public void testSwitch() {
		//정수 두개와 연산기호문자 1개를 입력받아서,
		//연산 기호 문자에 해당하는 계산을 수행하고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력(1 + 2): ");
		int num1 = sc.nextInt();
		char a = sc.next().charAt(0);
		int num2 = sc.nextInt();
		

				
		switch(a) {
		case '+':
			System.out.println(num1 + " + " + num2 + " 은 "+ (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " 은 "+ (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " 은 "+ (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num2 + " 은 "+ (num1 / num2));
			break;
		default:
			System.out.println("올바른 방식이 아닙니다.");
		}
		
		/*
		 * int res = 0;
		 * boolean flag = true;
		 * 
		 * switch (a){
		 * case '+':
		 * 	res = no1 + no2;
		 * 	break;
		 * 	
		 * default:
		 * flag = false;
		 * }
		 * 
		 * if(flag){
		 * System.out.println( num1 + "" + a + "" + num2 + "=" + res);
		 * }
		 */
	}

}
