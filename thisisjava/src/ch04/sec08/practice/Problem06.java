package ch04.sec08.practice;

import java.util.Scanner;

public class Problem06 {

	  public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;

		//짝수
		if (num%2 == 0) {
			for (int i = 0; i <=num; i+=2) {
				sum +=1;
			//언니 합을 구해야 하니까 x+=y 이런 식이 있어야 해요
			}
		//홀수
		}else {
			for (int i = 1; i <=num; i+=2) {
			sum += i;
		}
	  }

System.out.println("결과값 :"+sum);
	  }
}
