package com.test01;

public class MethodTest02 {
	public static void main(String[] args) {
		
		
		MethodTest01.publicMethod(); // 어디서나 접근
		MethodTest01.protectedMethod();  // 같은 패키지
		MethodTest01.defaultMethod(); // 같은 패키지
		// MethodTest01.privateMethod();  // 같은 클래스가 아니므로 error
		
		//2.non static;
		//class 변수명 = new class();
		//변수명.method();
		MethodTest01 method01 = new MethodTest01();
		method01.NonStaticMethod();
		
	}
}
