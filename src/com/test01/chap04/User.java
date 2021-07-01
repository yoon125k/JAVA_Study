package com.test01.chap04;

import java.util.Date;

public class User {
	private String id;
	private String pw;
	private String name;
	private Date date;
	
	//기본 생성자
	public User() {
		System.out.println("기본생성자");
	}
	//매개변수 생성자 ( 필드 초기화 )
	public User(String id, String pw, String name, Date date) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
		//this() 중복될 떄 사용
		this(id,pw,name);
		this.date = date;
	}

	public User(String id, String pw, String name) {
		this(id,pw);
		this.name = name;
	}
	
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	//setter & getter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	//출력
	public void information() {
		System.out.println(id + "," + pw + "," + name + "," + date);
	}
}
