package com.collection.part02_set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;



public class HashSetTest {
	public void test() {
		
		HashSet hset = new HashSet();
		
		hset.add("java");
		hset.add(123);
		hset.add(123.456);
		hset.add(new Date());
		
		System.out.println("hset: " + hset);
		
		hset.add("java");
		hset.add(123);
		System.out.println("hsetL " + hset);
		System.out.println("저장된 객체수: " + hset.size());
		System.out.println("포함확인: " + hset.contains("java"));
		
		//저장된 객체를 하나씩 꺼내는 기능이없음 , 인덱스 X
		//해결
		//1. Iterator()
		Iterator iter = hset.iterator();
		
		//하나씩 접근해서 꺼내기
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//2.toArray()
		Object[] arr = hset.toArray();
		// 오브젝트 arr 에 toArray()의 결과값을 담아줌.
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}
		//비어있는지 확인
		System.out.println("empty? :" + hset.isEmpty());
		hset.clear();
		System.out.println("empty? :" + hset.isEmpty());
	}
}
