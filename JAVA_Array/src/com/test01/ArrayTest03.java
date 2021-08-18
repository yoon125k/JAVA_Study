package com.test01;

public class ArrayTest03 {

	public void shallowCopy() {
		
		//얕은 복사
		//주소값 스택까지만 접근
		int[] orginArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = orginArr;

		String str = "";

		for (int i = 0; i < orginArr.length; i++) {
			str += orginArr[i] + " ";
		}

		System.out.println("1.orginArr: " + str);

		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";

		}

		System.out.println("2.copyArr: " + str);
		
		//원본배열 값 변경
		orginArr[0] = 99;
		
		str = "";
		for(int i=0; i<orginArr.length; i++) {
			str += orginArr[i] + " " ;
		}
		
		System.out.println("3.orginArr: " +str);
		
		str = "";

		for (int i = 0; i < copyArr.length; i++) {
			str += copyArr[i] + " ";
		}

		System.out.println("4.copyArr: " + str);
		
		System.out.println(orginArr.hashCode());
		System.out.println(copyArr.hashCode());
	}
	
	public void deepCopy1() {
		
		int[]orginArr = {1,2,3,4,5};
		int[]copyArr = new int[5];
		
		for(int i=0; i<orginArr.length; i++) {
			copyArr[i] = orginArr[i];
		}
		
		String oStr = "";
		String cStr= "";
		
		for(int i=0; i<5; i++) {
			oStr += orginArr[i] + " ";
			cStr += copyArr[i] + " ";
		}
		
		System.out.println("oStr: " + oStr);
		System.out.println("cStr: " + cStr);
		
		//원본배열 값 변경
		orginArr[0] = 99;
		
		
		oStr = "";
		cStr= "";
		
		for(int i=0; i<5; i++) {
			oStr += orginArr[i] + " ";
			cStr += copyArr[i] + " ";
		}
		
		System.out.println("oStr: " + oStr);
		System.out.println("cStr: " + cStr);
		
		System.out.println(orginArr.hashCode());
		System.out.println(copyArr.hashCode());
		
	}
	
	public void deepCopy2() {
//		2.arraycopy();
		
		
		int orginArr[] = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy("src , srcpos , dest, destpos, length)
		//src: 원본배열 srcpos복사시작위치
		//dest : 카피배열 destpos : 붙여넣기시작위치
		//length : 복사할길이
		
		System.arraycopy(orginArr, 0, copyArr, 0,orginArr.length);
		String oStr = "";
		String cStr= "";
		
		for(int i=0; i<orginArr.length; i++) {
			oStr += orginArr[i] + " ";
		}
		
		for(int i=0; i<copyArr.length; i++) {
			cStr += copyArr[i] + " ";
		}
		System.out.println("oStr: " + oStr);
		System.out.println("cStr: " + cStr);
		
		System.out.println(orginArr.hashCode());
		System.out.println(copyArr.hashCode());
	}
	
	public void deepCopy3() {
		//3.clone
		// 원본 배열을 복사 
		// 배열 한 복사의 주소를 가르킴
		//
		
		int[] orginArr = {1,2,3,4,5};
		int[] copyArr = new int[5];
		
		copyArr = orginArr.clone();
		
		String oStr = "";
		String cStr= "";
		
		for(int i=0; i<orginArr.length; i++) {
			oStr += orginArr[i] + " ";
			cStr += copyArr[i] + " ";
		}
		System.out.println("oStr: " + oStr);
		System.out.println("cStr: " + cStr);
		
		System.out.println(orginArr.hashCode());
		System.out.println(copyArr.hashCode());
	}

}
