package com.test01.run;

import com.test01.model.dto.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		//선언 및 할당
		Book[] bk = new Book[3]; //Book 타입이니깐 Book 객체만 들어간다.
		
		//초기화
		bk[0] = new Book("자바의 정석","홍길동","KH",1000);
		bk[1] = new Book("C언어의 정석","김길동","KH",2000);
		bk[2] = new Book("프로그래밍","공길동","KH",3000);
		
	}
}
