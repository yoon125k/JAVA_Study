package com.poly.silsub1.shape.model.vo;

public class Rectangle extends Shape implements IShape {

	double width, height;
	
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
	
		return width * height;
	}

	@Override
	public double perimeter() {
		return (width + height) * 2;
	}

	@Override
	public double getHypotenuse() {
		// TODO Auto-generated method stub
		return 0;
	}


}
