package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {

		Book b1 = new Book("체르니","체르니",50000);
		Book b2 = new Book("협주곡","쇼팽",40000);
		
		System.out.println("b1의 toString(): " + b1.toString());
		System.out.println("b2의 toString(): " + b2.toString());
		
		System.out.println("--------");
		
		//얕은 복사
		Book b3 = b1;
		
		//깊은 복사
		Book b4 = new Book("체르니","체르니",50000);

		System.out.println("b1과 b3(얕은복사) 주소 비교: " + b1.equals(b3));
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		System.out.println("b1과 b4(깊은복사) 객체 내용 비교: " + b1.equals(b4));
		
	}

}
