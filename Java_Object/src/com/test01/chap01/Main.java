package com.test01.chap01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Account a = new Account() ;
		
		//잔액확인
		a.display();
		
		//100만원 입금
		a.in(1000000);
		a.display();
		
		a.in(1500000);
		a.display();
		
		//50만원 인출
		a.out(500000);
		a.display();
		
//		a.balance -= 2000000;
		
		a.out(500000);
		a.display();
	}

}
