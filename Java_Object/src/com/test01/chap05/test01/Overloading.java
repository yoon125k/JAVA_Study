package com.test01.chap05.test01;

public class Overloading {
	public int test() {
		return 0;
	}	
	public int test(int a) {
		return 0;
	}
	public int test(int a, int b) { // 아래와 같음
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
//	public int test(int b, int a) { // 매개변수명은 상관없음 , 같은타입의 같은개수 에러
//		return 0;
//	}
	
	public int test(String s, int a) { // 타입 구분이 가능
		return 0;
	}
	
	public String test(int a, int b, String str) {
		return null;
	}
	
	//리턴타입이 다르다고 오버로딩이 적용 되는 건 아니다.
//	public int test(int a, int b String str) {
//		return 0;
//	}
	
	//접근 제한자가 다르다고 오버로딩이 적용 되는 건 아니다.
//	private String test(int a, int b, String str) {
//		return null;
//	}
}
