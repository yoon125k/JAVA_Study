package silsub4.model.vo;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		this.grade = 90;
		this.classroom = 5;
		this.name = "김아무";
		this.height = 178.99;
		this.gender = 'M';
	}
	
	public Student() {
	}

	public void setGrade(int grade) {
		this.grade = grade;
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

	public int getGrader() {
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
	
	public void information() {
		System.out.println(grade + " , " + classroom + " , " + name + " , " + height + " , " + gender);
	}

}
