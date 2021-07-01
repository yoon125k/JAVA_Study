package silsub3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private int radius;

	public Circle() {
		
	}

	public static double getPi() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void incrementRadius() {
		radius += 1;
		System.out.println("원의 둘레는: " + radius);
		System.out.println("원의 넓이는: " + radius * 2 * PI);
	}
}
