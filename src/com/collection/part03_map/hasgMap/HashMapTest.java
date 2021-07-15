package com.collection.part03_map.hasgMap;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public void test() {
		HashMap hmap = new HashMap();
		
		hmap.put("one", new Date());
		hmap.put(12,"apple");
		hmap.put(33,123);
		System.out.println("hmap: " + hmap);
		
		//키는 중복을 덮어씌움 , 값이 바뀜
		hmap.put(12, "banana");
		System.out.println("hmap: " + hmap);
		
		//값은 중복가능
		hmap.put(11, "banana");
		hmap.put(10, "banana");
		System.out.println("hamp: " + hmap);
		
		//키 값을 가져와서 value 값에 접근
		System.out.println("키 10에 대한 값:" + hmap.get(10));
		
		//삭제
		hmap.remove(10);
		System.out.println("hamp : " + hmap);
		
		
		System.out.println("hmap에 저장된 객체수: " + hmap.size());
		
	}
	
	public void test2() {
		
		HashMap hmap = new HashMap();
		
		hmap.put("one","java11");
		hmap.put("two","oracle");
		hmap.put("three","jdbc");
		hmap.put("four","html5");
		hmap.put("five","css5");
		
		System.out.println("hmap: "+ hmap);
		
		//1.keySet() 키값만 정렬
		Set keys = hmap.keySet();
		Iterator keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key =(String)keyIter.next();
			String value = (String)hmap.get(key);
			System.out.println(key + "=" + value);
		}
		
		System.out.println("---------------");
		//2.Map 내부 클래스 Entry 이용 : entrySet()
		Set set = hmap.entrySet();
		Iterator entryIter = set.iterator();
		
		while(entryIter.hasNext()) {
			//커서를 이동하며 하나씩 가져오기
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println((entry.getKey()+ "=" + entry.getValue()));
			

		}

	}
}
