package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		Car c1 = new SportsCar("노란");
		c1.accelPedal();
		System.out.println(c1);
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1);
		
		
		System.out.println("------------");
		Car c2 = new SUV("검은"); //다형성 , 부모클래스 타입으로 자식 클래스 객체생성
		c2.accelPedal();
		System.out.println(c2);
		c2.accelPedal();
		c2.accelPedal();
		System.out.println(c2);
	}

}
