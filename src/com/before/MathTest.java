package com.before;

import java.util.Random;

public class MathTest {
	public static void main(String[] args) {
		new MathTest().testMath();
		new MathTest().testRandom();
		new MathTest().pracRandom();
	}

	public void testMath() {

		System.out.println("PI: " + Math.PI);
		
		System.out.println("-7의 절대값: " + Math.abs(-7));
		System.out.println("-123.4의 절대값: " + Math.abs(-123.4));
		
		System.out.println("임의의 난수: " + Math.random());
	}
	
	public void testRandom() {
		//1부터 100까지의 난수 구하기
		int random = (int)(Math.random()*100) +1;
		
		System.out.println("random: " + random);
		
		//0 99
		int ran = new Random().nextInt(100);
		System.out.println("ran: " + ran);
	}
	
	public void pracRandom() {
		//0 9
		int ran1 = (int)(Math.random()*10);
		//int ran1 = new Random().nextInt(10);
		//1 10
		int ran2 = (int)(Math.random()*10)+1;
		//int ran2 = new Random().nextInt(10)+1;
		//20 35
		int ran3 = (int)(Math.random()*16)+20;
		//int ran3 = new Random().nextInt(16)+20;
		// 0 1
		int ran4 = (int)(Math.random()*2);
		//int ran4 = new Random().nextInt(2);
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		System.out.println(ran4);
		
	}

}
