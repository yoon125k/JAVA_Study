package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {

	public static void main(String[] args) {
		
		Book bk1 = new Book("자바의 정석","홍길동","KH",1000);
		Book bk2 = new Book("C언어의 정석","김길동","KH",2000);
		Book bk3 = new Book("프로그래밍","공길동","KH",3000);
		
		//출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		//도서검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String sTitle = sc.nextLine(); // 제목에 띄어쓰기가 있으므로 .nextLine() 사용
		
		if(bk1.getTitle().equals(sTitle)) {
			System.out.println(bk1.information());
		}else if(bk2.getTitle().equals(sTitle)) {
			System.out.println(bk2.information());
		}else if(bk3.getTitle().equals(sTitle)) {
			System.out.println(bk3.information());
		}
		
	}

}
