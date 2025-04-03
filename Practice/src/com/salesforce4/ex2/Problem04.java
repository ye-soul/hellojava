package com.salesforce4.ex2;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// 키보드에서 정수로 된 돈의 액수를 입력받아 
		
		System.out.println("금액:");
		Scanner sc = new Scanner(System.in);
		int[] cash = {50000,10000,5000,1000,500,100,50,10,5,1};
		int money = sc.nextInt();
		
		for (int temp : cash) {
			int count = money / temp;         // 해당 화폐가 몇 장/개 필요한지
			if (count > 0) {
				System.out.println(temp + "원: " + count + "개");
				money = money % temp;         // 남은 돈 계산
				
				
				
//			    // 키보드에서 정수로 된 돈의 액수를 입력받아 
//			    // 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 
//			    // 각 몇 개로 변환 되는지 작성 
//			    int[] cash = {50000,10000,5000,1000,500,100,50,10,5,1};
//			    Scanner sc = new Scanner(System.in);
//			    System.out.print("금액:");
//			    int change = sc.nextInt();
//			    
//			    // 반환할 거스름돈 계산
//			    for(int i=0; i<cash.length; i++) {
//			      System.out.println( cash[i] + "원:" + change / cash[i] + "개");
//			      change %= cash[i];
//			    }
//
//
//			  }
//
//			}
			}
		}
	}
}
