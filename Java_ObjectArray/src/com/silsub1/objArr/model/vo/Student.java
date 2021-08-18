package com.silsub1.objArr.model.vo;

public class Student {

	//filed
	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	//생성자
	public Student(){}
	public Student(int grade, int classroom, int number, String name) {
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.name = name;
	}
	
	//get,set
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade =grade;
	}
	
	public int getClassRoom() {
		return classroom;
	}
	public void setClassRoom(int classroom) {
		this.classroom = classroom;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade +"학년 " + classroom + "반 " + number + "번 " + name;
	}
}
