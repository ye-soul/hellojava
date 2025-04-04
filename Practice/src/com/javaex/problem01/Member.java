package com.javaex.problem01;

public class Member {
	private String id;   //회원아이디
	private String name; //회원이름
	private int point;   //회원포인트
	
	//source -> getters and setters
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//source -> field
	
	public Member() {
		super();
	}
	
	public Member(String id, String name, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	

	
}
