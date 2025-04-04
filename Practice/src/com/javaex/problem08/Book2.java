package com.javaex.problem08;

public class Book2 {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book2(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}

	public void rent() {
	    if (this.stateCode == 1) { // 책이 "재고 있음" 상태일 때만 대여 가능
	        this.stateCode = 0;     // 대여중으로 바꾸기
	        System.out.println(this.title + "이(가) 대여 됐습니다.");
	    } else {
	        System.out.println(this.title + "은(는) 이미 대여중입니다.");
	    }
	}

	public String toString() {
		String temp = (this.stateCode == 0) ? "대여중" : "재고있음";
		return bookNo + " 책 제목: " + title + " 저자 : " + author + " 대여유무: " + temp;
	}

	public void print() {
		System.out.println(this.toString());
	}



	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
}
