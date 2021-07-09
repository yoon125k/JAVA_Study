package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape implements IShape{
	
	final double PI = Math.PI;
	double radius;
	
	public Circle() {}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getPI() {
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
		
		return radius * PI;
	}

	@Override
	public double getHypotenuse() {
		// TODO Auto-generated method stub
		return 0;
	}



}
