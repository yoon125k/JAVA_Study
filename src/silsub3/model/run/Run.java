package silsub3.model.run;

import silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cr = new Circle();
		
		
		cr.setRadius(15);
		System.out.println("원의 둘레는: " + cr.getRadius());
		System.out.println("원의 넓이는: " + cr.getRadius() * 2 * cr.getPi());
		
		cr.incrementRadius();
	}

}
