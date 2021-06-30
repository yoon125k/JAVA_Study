package com.test04;

public class gugu {
	public static void main(String[] args) {

		int k = 3;

		for (int i = 0; i < 3; i++) {
			System.out.print(1 + (i * k) + "단\t");
			System.out.print(2 + (i * k) + "단\t");
			
			
			System.out.print(3 + (i * k) + "단\t");
			System.out.println();

			for (int j = 1; j < 10; j++) {
				System.out.print((1 + (i * k)) + "X" + j + "=" + (1 + (i * k)) * j + "\t");
				System.out.print((2 + (i * k)) + "X" + j + "=" + (2 + (i * k)) * j + "\t");
				System.out.print((3 + (i * k)) + "X" + j + "=" + (3 + (i * k)) * j + "\t");
				System.out.println();
			}
		}
		System.out.println();
	}

}
