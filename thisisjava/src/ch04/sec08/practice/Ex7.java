package ch04.sec08.practice;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean bank = true;		
		int account = 0;
		
        while(bank) {
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")) {
                System.out.print("예금액> ");
                int deposit = Integer.parseInt(scanner.nextLine());
                account += deposit;
            } else if(strNum.equals("2")) {
                System.out.print("출금액> ");
                int withdraw = Integer.parseInt(scanner.nextLine());
                if (withdraw <= account) {
                    account -= withdraw;
                } else {
                    System.out.println("잔고가 부족합니다.");
                }
            } else if(strNum.equals("3")) {
                System.out.println("잔고> " + account);
            } else if(strNum.equals("4")) {
                bank = false;
            } 
                else {
                System.out.println("잘못된 입력입니다. 1~4 중에서 선택해주세요.");
            }
        }	

        System.out.println("프로그램 종료");
    }
	}

