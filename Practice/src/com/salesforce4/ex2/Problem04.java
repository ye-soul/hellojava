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
			}
		}
	}
}
