package com.chap02_StringBuffer_StringBuilder;

public class Run {

	public static void main(String[] args) {
//		Run.method1();
		Run.method2();
	}

	public static void method1() {
		StringBuilder sb = new StringBuilder("화이팅");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("대박");
		System.out.println(sb1);
		System.out.println(sb1.length()); // 길이
		System.out.println(sb1.capacity()); //기본16 + 문자 용량
	}
	
	public static void method2() {
		String str = "하이 ";
		System.out.println("str 기존: " + str + ", 주소: " + str.hashCode());
		
		str += "난 String이라고 해";
		System.out.println("str 추가 후: " + str + ", 주소: " + str.hashCode());
		System.out.println();
		
		StringBuffer sbf = new StringBuffer("대박 ");
		System.out.println("sbf 기존: " + sbf + ", 주소: " + sbf.hashCode());
		sbf.append("난 String Buffe");
		System.out.println("str 추가 후: " + sbf + ", 주소: " + sbf.hashCode());
		System.out.println();
		
		//append
		sbf.append("나는 지금").append("힘들어");
		System.out.println(sbf);
		
		//insert
		sbf.insert(0, "모두들 ");
		System.out.println(sbf);
		//delete
		sbf.delete(0, 2);
		System.out.println(sbf);
		//reverse
		sbf.reverse();
		System.out.println(sbf);
		
		
	}
}
