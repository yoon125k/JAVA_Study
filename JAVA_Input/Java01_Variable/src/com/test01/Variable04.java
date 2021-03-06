package com.test01;

public class Variable04 {
	public static void main(String[] args) {
		Variable04 va = new Variable04();
		
		va.printVarSize();
		va.testOverflow();
	}

	//변수의 사이즈(크기) 출력용 메소드
	public void printVarSize() {
		
		System.out.println("byte: " + Byte.BYTES + "byte");
		System.out.println("short: " + Short.BYTES + "byte");
		System.out.println("int: " + Integer.BYTES + "byte");
		System.out.println("long: " + Long.BYTES + "byte");

		System.out.println("float:" + Float.BYTES + "byte");
		System.out.println("double:" + Double.BYTES + "byte");
		
		System.out.println("char:" + Character.BYTES + "byte");
		
	}
	
	public void testOverflow() {
		//byte bnum = 128;
		
		byte bnum = 127;
		bnum = (byte)(bnum+1); // byte + int --> int
		
		System.out.println(("bnum:" + bnum));
	}
}


