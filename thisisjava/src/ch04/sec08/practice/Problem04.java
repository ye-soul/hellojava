package ch04.sec08.practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
	
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int max = 0;
		
        for (int i = 1; i <= 5; i++) {
        	System.out.println("숫자:");
        	int num = sc.nextInt();
        	if (num > max) {
            max = num;
        	}
        }
        
        
        System.out.println("최대값은: " + max + "입니다" );
        
}
}
