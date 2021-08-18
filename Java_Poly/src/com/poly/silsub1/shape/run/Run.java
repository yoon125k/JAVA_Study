package com.poly.silsub1.shape.run;

import com.poly.silsub1.shape.controller.ShapeManager;
import com.poly.silsub1.shape.controller.TestIShape;

public class Run {

	public static void main(String[] args) {

		ShapeManager sm = new ShapeManager();
//		sm.calcShape();
		
		TestIShape ts = new TestIShape();
//		ts.calcShape();
		
		ShapeManager sm2 = new ShapeManager();
		sm2.calcShapeArray();
		
	}

}
