package com.inherit.par02_override.run;

import com.inherit.par02_override.model.Book;

public class Run {

	public static void main(String[] args) {

		Book b1 = new Book("수학의정석", "홍성대", 20000);
		Book b2 = new Book("피아노소곡집", "세광", 15000);

		// toString() 스트링명 리턴 , 클래스 패키지 명과 16진수 해쉬코드값을 리턴
//		System.out.println("b1=" + b1.toString());
//		System.out.println("b2=" + b2.toString());
//		System.out.println("b1=" + b1);
//		System.out.println("b2=" + b2);
		
		//두 객체를 비교
		System.out.println("b2=" + b1.equals(b2));
		
		//얕은 복사
		Book b3 = b1;
		System.out.println("b3=" + b1.equals(b3));
		
		//b1과 값이 동일한 비교
		Book b4 = new Book("수학의정석", "홍성대", 20000);
		System.out.println("b4=" + b1.equals(b4));
		
		System.out.println("b1의 haschcode: " + b1.hashCode());
		System.out.println("b4의 haschcode: " + b4.hashCode());
	}

}
