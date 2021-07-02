package silsub3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius;

	public Circle() {
		
	}

	public static double getPi() {
		return PI;
	}

	public static int getRadius() {
		return radius;
	}

	public static void setRadius(int radius) {
		Circle.radius = radius; // static 이기 떄문에
	}
	
	public void incrementRadius() {
		Circle.radius ++;
		System.out.println("원의 둘레는: " + Circle.radius * 2 * PI);
		System.out.println("원의 넓이는: " + Circle.radius * Circle.radius * PI);
	}
}
