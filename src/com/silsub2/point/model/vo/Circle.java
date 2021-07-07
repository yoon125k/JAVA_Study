package com.silsub2.point.model.vo;

public class Circle extends Point {

	private int radius;

	public Circle() {
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		super.draw();
		System.out.println("raidus: " + radius);
		System.out.printf("원의 면적: %.2f \n" ,(Math.PI * radius * radius));
		System.out.printf("원의 둘레: %.2f \n" ,(2 * Math.PI * radius));
		
	}

}
