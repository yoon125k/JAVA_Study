package com.test04;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[3];
		
		System.out.println(a); // 주소값
		System.out.println(a.hashCode()); // 메모리의 주소값을 hashcode
		
		
		for(int i=0; i<a.length; i++) {
			a[i] = i;
			System.out.println(a[i]);
			
		}
		System.out.println("for문: " + a[2]);
		
		int b = 3;
		
		a[2] = b;
		
		System.out.println("b대입: " + a[2]);
		
		b = 5;
		
		System.out.println("b값바뀐이후: " + a[2]);
		
		int z[] =  new int[1];
		z[0] = 91;
		System.out.println(z[0]);
		
		a[2] = z[0];
		System.out.println(a[2]);

		if(z[0] == a[2]) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
