package com.collection.part01_list_arayListSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(new Score("홍길동",89));
		list.add(new Score("가길동",12));
		list.add(new Score("나길동",56));

		list.add(new Score("라길동",56));
		list.add(new Score("차길동",18));
		list.add(new Score("바길동",39));
		
		System.out.println("list: " + list);
		
		//정렬
		//1.Comparable : 기본 정렬 기준
//		Collections.sort(list);
//		System.out.println("list: " + list);
		
//		list.sort(null); // null = 기본정렬
//		System.out.println("list: " + list);
//		
		//2.Comparator : 기본 정렬 기준 외에 다른 기준으로 정렬
		list.sort(new ScoreAsc()); //클래스로 기준
		System.out.println("list: " + list);
		
	}
}
