package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book2")
public class Book2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private int BookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_dec")
	private String bookDes;

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDes() {
		return bookDes;
	}

	public void setBookDes(String bookDes) {
		this.bookDes = bookDes;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", bookName=" + bookName + ", bookDes=" + bookDes + "]";
	}

	public Book2(int bookId, String bookName, String bookDes) {
		super();
		BookId = bookId;
		this.bookName = bookName;
		this.bookDes = bookDes;
	}

	public Book2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
