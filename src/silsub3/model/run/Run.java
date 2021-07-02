package silsub3.model.run;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr = new Circle();
		
		
		Circle.setRadius(15);
		System.out.println("원의 둘레는: " + 2 * Circle.getRadius() * Circle.PI);
		System.out.println("원의 넓이는: " + Circle.getRadius() * Circle.getRadius() * Circle.getPi());
		
		cr.incrementRadius();
	}

}
