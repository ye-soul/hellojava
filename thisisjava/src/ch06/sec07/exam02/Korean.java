package ch06.sec07.exam02;

public class Korean {
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자 선언
	public Korean(String n, String s) {
	  name = n;
	  ssn = s;
	}

	public Korean() {
		super();
		name = "홍길동";
		ssn = "771111-1111111";
	}

	public Korean() {
		super();
		name = "이자바";
		ssn = "987654-1234567";
	}

	public Korean(String n) {   //오버로딩 
		  name = n;
		}
	
	public Korean(int s) {   		// -는 못옴 int라서
		ssn = String.valueOf(s);
	}
	
	
}
