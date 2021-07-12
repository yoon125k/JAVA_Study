package com.chap04_WrapperClass;


public class Run {

	public static void main(String[] args) {

		//Boxing, UnBoxing
		
		//AutoBoxing
		
		Short i  =10;
		Integer i2 = 5;
		Double d = 5.0;
		
		int pi = i2.intValue();
		double pd = d.doubleValue();
		
		//AutoBoxing
		int a = i;
		int b = i2;
		System.out.println(a + b);
		abox(a+b); // int >> (autoBoxing) >> Intger >> (다형성) >> Object
		
		byte bi = Byte.valueOf("1");
		String bs = Byte.valueOf(bi).toString();
		
		int ii = Integer.valueOf("1");
		ii = Integer.parseInt("3");
		String is = Integer.valueOf(ii).toString();
		is = ii + "";
	}
	
	public static void abox(Object obj) {
		System.out.println(((int)obj));
	}


}
