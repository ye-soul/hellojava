package ch06.sec08.exam03;

public class Hello {
	String text = "";

	Hello(String s) {
		text = s;
	}

	void print() {
		// "안녕하세요 세일즈 포스 CRM101 4기 입니다"
		// 한 문자씩 아래로 출력하도록 메소드 완성
		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i));
		}
	}
}
