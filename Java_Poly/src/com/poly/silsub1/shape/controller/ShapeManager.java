package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle;
import com.poly.silsub1.shape.model.vo.Shape;

import com.poly.silsub1.shape.model.vo.Triangle;

public class ShapeManager {
	public void calcShape() {

		{
			Shape s;

			s = new Circle(15.5);
			System.out.println("원면적 : " + s.area());
			System.out.println("원둘레 : " + s.perimeter());

			s = new Rectangle(34.5, 42.7);
			System.out.println("사각형면적 : " + s.area());
			System.out.println("사각형둘레 : " + s.perimeter());
		}

	}

	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];

		iarr[0] = new Circle(15.5);
		iarr[1] = new Rectangle(34.5, 42.7);
		iarr[2] = new Triangle(10.5, 12.5);
		iarr[3] = new Triangle(15.5, 17.5);
		iarr[4] = new Triangle(20.5, 22.5);

		for (int i = 0; i < iarr.length; i++) {
			System.out.println("------");
			System.out.printf("넓이는 %.2f \n", iarr[i].area());
			System.out.printf("둘레는 %.2f \n", iarr[i].perimeter());

//			if (i > 1) {
//				System.out.printf("삼각형의 빗변은 %.2f \n", iarr[i].getHypotenuse());
//			}
			
			if (iarr[i] instanceof Triangle) {
				System.out.printf("삼각형의 빗변은 %.2f \n",((Triangle)iarr[i]).getHypotenuse());
//				System.out.println(((Triangle)iarr[i]).getHypotenuse());
			}
		}

	}
}
