package com.poly.part0.test02;

import java.util.Scanner;

public class Mtest {
	public static void main(String[] args) {

		System.out.print("선택 [1:고양이 2:강아지 3:송아지]: ");
		Scanner sc =new Scanner(System.in);
		int select = sc.nextInt();
		
		Base base = null;
		
		switch(select){
			case 1:
				base = new Cat();
				break;
			case 2:
				base = new Dog();
				break;
			case 3:
				base = new Cow();
				break;
		}
		
		base.start();
		// base 클래스 안에 있는 start 가 정적바인딩(연결) 되어 있다.
		
		// 실행시에 객체가 무엇이 들어 있는지에 따라 그에 따라 바인딩 되어 실행된다.(동적바인딩)
		base.stop();
		// base 클래스 안에 있는 stop 가 정적바인딩(연결) 되어 있다.
		
	}
}
