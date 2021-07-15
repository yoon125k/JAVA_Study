package com.collection.part01_list_arayListSort;

public class Score implements Comparable {
	private String name;
	private int score;
	
	public Score() {}

	public Score(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", score=" + score + "]";
	}

	//기본 정렬 기준 , 이 메소드를 기준으로 정렬
	@Override
	public int compareTo(Object o) {
		//name으로 기본 정렬
		String otherName = ((Score)o).getName();
		
		
		//비교를 할떄마다(.compareTo) 안 바꾸면 음수 리턴 , 바꾸면 양수 리턴
		return -name.compareTo(otherName); //정수값 리턴
		
	}
	
}
