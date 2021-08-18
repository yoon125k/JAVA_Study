package com.silsub1.book.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book() {
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return title + "," + author + "," + price;
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}

		if (author == null) {
			if (other.author != null) {
				return false;
			}
		} else if (!author.equals(other.author)) {
			return false;
		}

		if (price != other.price) {
			return false;
		}

		return true;
	}
	
	@Override
	public int hashCode() {
		return (title + author + price).hashCode();
	}
}
