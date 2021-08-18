package com.test01;

/*
 * 멤버변수 :클래스 영역에 선언
 * 클래스 변수 , 인스턴스 변수로 나눌 수 있다.
 * 클래스 변수는 모든 객체가 공통적으로 같은 속성을 가질 떄 
 * ex ) static int height = 200; 키는 고정
 * 인스턴스 변수는 각각의 객체(=인스턴스)마다 개별적인 속성을 가질떄
 * ex ) String haircolor;	머리색깔은 바뀜
 * 
 * 지역변수 : 메소드나 생성자 내부에 선언
 * 메소드 내에 선언, 메소드 종료되면 자동으로 소멸
 * void a (){
 * 		int b;
 * }
 * 
5. 클래스 설계시 static의 사용지침
- 먼저 클래스의 멤버변수중 모든 인스턴스에 공통된 값을 유지해야하는 것이 있는지
   살펴보고 있으면, static을 붙여준다.

- 작성한 메서드 중에서 인스턴스 변수를 사용하지 않는 메서드에 대해서 static을
   붙일 것을 고려한다.

출처: https://vaert.tistory.com/101 [Vaert Street]
*/

public class MethodTest01 {
	public static void main(String[] args) {
		
		// 같은 클래스안에서는 접근 제한자 상관없이 가능 
		// static은 준비과정 생략, 그냥 실행만
		MethodTest01.publicMethod(); //어디서나 접근 (+)
		MethodTest01.protectedMethod(); // 상속된 곳 또는 패키지 내 (#)
		MethodTest01.defaultMethod(); // 패키지 내
		privateMethod(); // 현재 클래스 내 (-) // MethodTest01.privateMethod(); 로 웬만하면 실행
		
		MethodTest01 mt = new MethodTest01();
		mt.NonStaticMethod(); 
		
	}
	
	//접근제한자
	
	//어디서나 접근 (+)
	public static void publicMethod() {
		System.out.println("public method");
	}
	
	//상속일 경우 상속된 곳에서 (#)
	//상속이 아닌 경우 같은 패키지 안에서
	protected static void protectedMethod() {
		System.out.println("protected method");
	}
	
	// 같은 패키지 안에서
	static void defaultMethod() {
		System.out.println("default method");
	}
	
	// 현재 클래스 안에서만 (-)
	private static void privateMethod() {
		System.out.println("private method");
	}
	
	public void NonStaticMethod() {
		System.out.println("non static method");
	}
	
	
}
