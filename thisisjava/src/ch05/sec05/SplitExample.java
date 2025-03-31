package ch05.sec05;

public class SplitExample {
	public static void main(String[] args) {
		String board = "번호,제목,내용,글쓴이";
		
		//문자열 분리
		String[] arr = board.split(",");
		
		//인덱스별로 읽기
		System.out.println("arr[0] " + arr[0]);
		System.out.println("arr[1] " + arr[1]);
		System.out.println("arr[2] " + arr[2]);
		System.out.println("arr[3] " + arr[3]);
		System.out.println();
		
		//for문을 이용한 읽기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

