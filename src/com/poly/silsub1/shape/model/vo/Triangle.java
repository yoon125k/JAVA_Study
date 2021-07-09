package com.poly.silsub1.shape.model.vo;

public class Triangle implements IShape{

	double base;
	double height;
	
	public Triangle() {}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getHypotenuse() {
		return Math.sqrt((base*base)+(height+height));
	}
	
	@Override
	public double area() {
		return (base * height) /2;
	}
	
	@Override
	public double perimeter() {
		return base + height + getHypotenuse();
	}

}
