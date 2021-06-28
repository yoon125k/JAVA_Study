package com.test01;

import java.util.Scanner;

public class ArrayTest01 {

	public void test1() {
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//
		int sum = 0;
//
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
//		
		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}
		System.out.println(sum);
	}

	public void test2() {
		//배열 사용 방법
		//선언
		//자료형[] 변수명;
		//자료형 변수명;
		//stack 영역안에 배열의 주소를 저장할 수 있는 공간
		//일반적으론 stack안에 값을 저장할 수 있는 공간
		
		//stack 영역안에 공간을 할당.
		//공간 안에는 주소값 저장.
		int[] iarr;
		char carr[];
		
		//할당
		// new int[5] << 주소값 
		// iarr 에 new int[5]의 주소값을 대입
		
		// new char[10] << 주소값
		// carr 의 공간에 new char[10]의 주소값을 대입
		// new 새롭게 흰 영역을 만들고 새로이 주소값을 가져옴
		// 
		
		iarr = new int[5];
		carr = new char[10];
		
		//선언과 할당을 동시에
		int[] jarr = new int[5];
		char barr[] = new char[10];
		
		System.out.println("jarr: "+ jarr);
		System.out.println("barr: "+ barr);

		//실질적인 주소값
		System.out.println("jarr hascode: "+ jarr.hashCode());
		System.out.println("barr hascode: "+ barr.hashCode());
		
		System.out.println("jarr hascode: "+ jarr.length);
		System.out.println("barr hascode: "+ barr.length);

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("새로 할당할 배열의 길이");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode: " + darr.hashCode());
		System.out.println("darr의 길이: " + darr.length);
		
		darr = null;
		
		System.out.println("darr: " + darr);
		System.out.println("darr의 length: " + darr.length);
		
		/*
		 * MotorCycle m = new MotorCycle(); 
		 * 
		 * 
		    MotorCycle: 새로운 사용자 정의 데이터 타입 
		    m: MotorCycle 데이터 타입으로 선언한 참조변수(객체변수) 
		    new: 메모리를 생성하는 연산자, 참조값을 리턴합니다. 
		    MotorCycle(): 메모리 생성 후 해당 메모리의 초기화 작업을 담당하는 생성자 

		 */
	}

	public void test3() {
		
		int[] iarr = new int[5];
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr["+i+"]의 값:" + iarr[i]);
			
		}
		
		int[] iarr2 = new int[] {11,22,33};
		System.out.println("iarr2의 길이: " + iarr2.length);
		
		String[] sarr = {"apple","banana","grape","orange"};
		
		for(int i = 0 ; i< sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		

	}

	public void test4() {

	}
}
