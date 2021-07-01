package com.test01.chap04;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User us = new User();
		User us2 = new User("ID","1234","김아무");
		User us3 = new User("ID","4321","김무김",new Date());
		
		User us4 = new User("ID","5432");
		
		us.information();
		
		us2.information();
		
		us3.information();
		
		us4.information();
	}

}
