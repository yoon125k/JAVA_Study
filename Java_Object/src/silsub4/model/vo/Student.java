package silsub4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	{
		Student.grade = 90;
		this.classroom = 5;
		this.name = "김아무";
		this.height = 178.99;
		this.gender = 'M';
	}

	public Student() {
	}

	public static void setGrade(int grade) {
		Student.grade = grade;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public static int getGrader() {
		return grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public String getName() {
		return name;
	}

	public double getHegith() {
		return height;
	}

	public char getGender() {
		return gender;
	}

	public String information() {
		return grade + " , " + classroom + " , " + name + " , " + height + " , " + gender;
	}

}
