package com.test01.chap01;

public class Account {
//필드생성
	private String name = "김아무";
	private String accNo = "010-1234-1234";
	private String pwd = "1234";
	private int bankCode = 22;
	private int balance = 0;
	//생성자
	public Account() {
		
	}

	public void in(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "님의 계좌에" + money + "원이 입금 되었습니다.");
		} else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	public void out(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에" + money + "원이 출금 되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	public void display() {
		System.out.println(name + "님의 계좌에 잔액은 " + balance + "원 입니다.");
	}
}

