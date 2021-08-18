package com.chap01_string;

public class Run {

	public static void main(String[] args) {
//		Run.test1();
		Run.test2();
	}

	public static void test1() {

		// 1.문자열을 리터럴로 생성
		String str = "abc";
		String str1 = "abc";

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());

		// 2.생성자를 통한 문자열 생성
		String str2 = new String("abc");
		String str3 = new String("abc");

		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		//
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}

	public static void test2() {
		String str = "abc";
		
		//charAt
		System.out.println(str.charAt(1));

		//concat
		System.out.println(str.concat("def"));

		//contains
		System.out.println(str.contains("ab"));
		
		String str1 = "a,b,c";
		//split
		String[] strArr = str1.split(",");
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		for(String arr: strArr) {
			System.out.println(arr);
		}
		
		//toUpperCase
		System.out.println(str.toUpperCase());
		
		//substring
		System.out.println(str1.substring(2,4));
		
		String str2= "       ab  c   ";
		//trim
		System.out.println(str2.trim());
		
	}

}
