package com.collection.part01_list_arayListSort;

import java.util.Comparator;

public class ScoreAsc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// 비교할 객체 두개를 받아서 두개씩 비교
		// 점수 기본 정렬(오름차순)
		int other1 = ((Score) o1).getScore();
		int other2 = ((Score) o2).getScore();

		if (other1 > other2) {
			return 1;
		} else {
			return -1;
		}

	}

}
