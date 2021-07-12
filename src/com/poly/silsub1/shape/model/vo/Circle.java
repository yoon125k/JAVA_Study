package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape implements IShape{
	
	public static final double PI = Math.PI;
	private double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public static double getPI() {
		return PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public double perimeter() {
		
		return (2*radius) * PI;
	}

	@Override
	public double getHypotenuse() {
		// TODO Auto-generated method stub
		return 0;
	}



}
