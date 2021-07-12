package com.chap03_StringTokenizer;

import java.util.StringTokenizer;

public class run {

	public static void main(String[] args) {
		String str = "이창진, 19, 서울시 강남구 역상동, 남";
		StringTokenizer st = new StringTokenizer(str,",");
		
		System.out.println(st.countTokens());

		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); // 커서 한칸씩 이동시켜 출력
		}
	}

}
