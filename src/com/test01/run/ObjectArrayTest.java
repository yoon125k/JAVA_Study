package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {
	public static void main(String[] args) {
		// 선언 및 할당
		Book[] bk = new Book[3]; // Book 타입이니깐 Book 객체만 들어간다.

		// 초기화
		bk[0] = new Book("자바의 정석", "홍길동", "KH", 1000);
		bk[1] = new Book("C언어의 정석", "김길동", "KH", 2000);
		bk[2] = new Book("프로그래밍", "공길동", "KH", 3000);

		// 선언 및 할당과 동시에 초기화
		Book[] bk2 = { new Book("자바의 정석", "홍길동", "KH", 1000), 
				new Book("C언어의 정석", "김길동", "KH", 2000),
				new Book("프로그래밍", "공길동", "KH", 3000) };
		

		System.out.println(bk[0]);
//		System.out.println(bk[0].getPrice());
//		System.out.println(bk[1].getPrice());
//		bk[0].setPrice(1500);
//		System.out.println(bk[0].getPrice());
		
		// .length 활용
//		System.out.println("도서 갯수: " + bk.length);
		
		//도서 출력
		
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		// 도서 검색
		
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 입력: ");
		String sTitle = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(sTitle.equals(bk[i].getTitle())) {
				System.out.println(bk[i].information());
			}
		}
	}
	
}
