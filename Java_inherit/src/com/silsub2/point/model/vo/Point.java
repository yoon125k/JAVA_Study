package com.silsub2.point.model.vo;

public class Point {
	
	protected int x;
	protected int y;
	
	public Point() {}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println("x 좌표는:" + x);
		System.out.println("y 좌표는:" + y);
	}
}
