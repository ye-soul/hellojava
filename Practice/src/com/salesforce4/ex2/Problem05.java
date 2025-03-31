package com.salesforce4.ex2;

public class Problem05 {

	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개 숫자를 출력하세요 - 미니로또

		int[] lottery = new int[6];
		int count = 0;

		while (count < lottery.length) {
			int num = (int) (Math.random() * 45) + 1;
			boolean isDup = false;

			for (int i = 0; i < count; i++) {
				if (lottery[i] == num) {
					isDup = true;
					break;
				}
			}

			if (isDup) {
				continue;
			}

			lottery[count] = num;
			count++;

		}

		System.out.print("오늘의 로또 번호 :");
		for (int i = 0; i < lottery.length; i++) {
			System.out.print(lottery[i] + " ");
		}

	}

}
