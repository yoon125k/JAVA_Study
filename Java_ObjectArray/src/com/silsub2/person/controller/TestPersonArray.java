package com.silsub2.person.controller;

import java.util.Scanner;

import com.silsub2.person.model.vo.Person;

public class TestPersonArray {

	public static void main(String[] args) {
		
		//객체배열
		//null 값이 들어가있음
		Person[] objArr = new Person[5];
		
		int sumAge = 0;
		int sumHeight = 0;
		
		//객체생성
		for(int i=0; i<5; i++) {
		Scanner sc= new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: " );
		int age = sc.nextInt();
		System.out.print("키 입력: ");
		int height = sc.nextInt();
		Person st = new Person(name,age,height);
		
		sumAge+= age;
		sumHeight += height;
		
		objArr[i] = st;
		System.out.println(objArr[i].information());
		
		}
		System.out.println("평균 나이: " + (sumAge/5));
		System.out.println("평균 키: " + (sumHeight/5));
		
		

	
		
		
 

		
	}

}
