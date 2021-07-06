package com.inherit.silsub0;

public class Run {

	public static void main(String[] args) {
		Car c1 = new SportsCar("노란");
		c1.accelPedal();
		System.out.println(c1);
		c1.accelPedal();
		c1.accelPedal();
		System.out.println(c1);
	}

}
