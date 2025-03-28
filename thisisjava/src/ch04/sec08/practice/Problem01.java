package ch04.sec08.practice;

public class Problem01 {

	public static void main(String[] args) {
		//1 ~100 정수에서 5의 배수이면서 7의 배수인것만 출력
		
		  for (int x = 1; x <= 100; x++) {
	            if (x % 5 == 0 && x % 7 == 0) {
	                System.out.println(x);
			}
		}


	}

}
