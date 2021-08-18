package com.io.part03_addStream_chap04_object;

import java.io.Serializable;

public class Member implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String userID;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;

	private double point;
	
	public Member() {
	}

	public Member(String userID, String userPwd, String userName, int age, char gender) {
		super();
		this.userID = userID;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	public String getUserID() {
		return userID;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [userID=" + userID + ", userPwd=" + userPwd + ", userName=" + userName + ", age=" + age
				+ ", gender=" + gender + "]";
	}

}
