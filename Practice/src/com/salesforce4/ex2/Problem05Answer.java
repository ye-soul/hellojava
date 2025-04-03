package com.salesforce4.ex2;

public class Problem05Answer {

	public static void main(String[] args) {
		// 로또 배열
		int[] lotto = new int[6];

		// 로또 번호 생섣
		for (int i = 0; i < 6; i++) {
			//난수 발생
			lotto[i] = (int) (Math.random() * 45) + 1;

			//이전값과 비교
			for (int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) { //중복이 걸리면?
					i--;					// i--로 반복 인덱스를 하나 줄여서
					break;
					
				}
			}
		}

		// 로또 출력
		for (int num : lotto) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
