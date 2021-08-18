package com.inherit.par02_override.model;

public class Book {

	private String title;
	private String writer;
	private int price;

	public Book() {
	}

	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 1. toString
	@Override
	public String toString() {
		return title + "," + writer + "," + price;
	}

	// 2. equals()
	@Override
	public boolean equals(Object obj) {
		// obj실행할떄 넘겨주는 매개변수 ex b1.equals(매개변수)
		// 객체의 주소가 같으면 같은 객체
		if (this == obj) {
			// b1.equals(b4); .. this 는 실행하는 객체 b1 주소값
			// b1의 주소값과 obj의 주소값 비교
			return true;
		}
		// 전달받은 객체가 null인 경우 무조건 다른 객체
		if (obj == null) {
			return false;
		}

		////////////////
		// 각 필드별로 비교
		Book other = (Book) obj;

		// 제목
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			// "가나다".equals("가") String 비교 = false
			// 다를 경우에 실행되게 title !을 붙여서 true로 바꿈
			return false;
		}

		// 작가
		if (writer == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!writer.equals(other.writer)) {
			return false;
		}

		// 가격
		if (price != other.price) {
			return false;
		}
		return true;
	}
	
	//3.hashcode
	@Override
	public int hashCode() {
		
		return (writer + price + title).hashCode(); 
		//b1 (홍 .... ) b4 (홍 ..... ) 안의 String의 해쉬코드를 똑같이 맞춘다.
	}
}
