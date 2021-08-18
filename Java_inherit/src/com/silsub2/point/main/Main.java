package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {

		Circle[] cr = new Circle[3];

		Rectangle[] ra = new Rectangle[3];

		cr[0] = new Circle(5, 5, 10);
		cr[1] = new Circle(15, 15, 20);
		cr[2] = new Circle(25, 25, 30);

		for (int i = 0; i < cr.length; i++) {

			cr[i].draw();
			System.out.println("------------");
		}
		System.out.println();

		ra[0] = new Rectangle(5, 5, 10, 10);
		ra[1] = new Rectangle(15, 15, 20, 20);
		ra[2] = new Rectangle(25, 25, 30, 30);

		for (int i = 0; i < ra.length; i++) {

			ra[i].draw();
			System.out.println("------------");
		}
	}

}
