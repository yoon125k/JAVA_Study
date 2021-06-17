package com.test;

import java.util.Scanner;

public class CastingSample {
	
	Scanner sc = new Scanner(System.in);
	
	public void calculatorScore(){
		
		
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<3; i++) {
			cnt = cnt + 1;
			if(cnt < 4) {
				System.out.print("점수 : ");
				double score = sc.nextDouble();
				sum = (int)(sum + score);
				
			}
			avg = sum / cnt;
			
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
