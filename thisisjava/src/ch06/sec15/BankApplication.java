package ch06.sec15;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
        Account[] acc = new Account[100];
		
		Scanner sc = new Scanner(System.in);
		
		String accountNum = "";
		String accountOwner = "";
		int balance = 0;


		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());


			if (selectNo == 1) {
				
				System.out.println("------");
				System.out.println("계좌생성");
				System.out.println("------");
				System.out.print("계좌번호: ");
				accountNum = sc.nextLine();
				System.out.print("계좌주: ");
				accountOwner = sc.nextLine();
				System.out.print("초기입금액: ");
				balance = Integer.parseInt(sc.nextLine());
				
				Account newAccount = new Account(accountNum, accountOwner, balance);
				
				// 먼저 계좌번호 중복 확인
				boolean isDup = false;
				for (int i = 0; i < acc.length; i++) {
				    if (acc[i] != null && acc[i].getAccountNum().equals(accountNum)) {
				        isDup = true;
				        break;
				    }
				}

				if (isDup) {
				    System.out.println("⚠ 이미 존재하는 계좌번호입니다.");
				} else {
				    // 비어 있는 칸에 저장
				    for (int i = 0; i < acc.length; i++) {
				        if (acc[i] == null) {
				            acc[i] = newAccount;
				            System.out.println("✅ 계좌가 생성되었습니다.");
				            break;
				        }
				    }
				}
			}

				
				else if (selectNo == 2) {
				System.out.println("------");
				System.out.println("계좌목록");
				System.out.println("------");
				
				for (int i = 0; i < acc.length; i++) {
			        if (acc[i] != null) {
			            System.out.println(acc[i].getAccountNum() + "\t" +
			                               acc[i].getAccountOwner() + "\t" +
			                               acc[i].getBalance());
			        }
			    }
			}

				
				else if (selectNo == 3) {
				System.out.println("------");
				System.out.println("예금");
				System.out.println("------");

				System.out.print("계좌번호: ");
				accountNum = sc.nextLine();
				System.out.print("예금액:");
				balance = Integer.parseInt(sc.nextLine());
				
				
				boolean isCorrect = false;
				for (int i = 0; i < acc.length; i++) {
				    if (acc[i] != null && acc[i].getAccountNum().equals(accountNum)) {
				        acc[i].setBalance(acc[i].getBalance() + balance);
				        isCorrect = true;
				        System.out.println("결과: 예금이 성공되었습니다.");
				        break;
				    }
				}
				if (!isCorrect) {
				    System.out.println("계좌가 존재하지 않습니다.");
				}
			}

	
			else if (selectNo == 4) {
				System.out.println("------");
				System.out.println("출금");
				System.out.println("------");

				System.out.print("계좌번호: ");
				accountNum = sc.nextLine();
				System.out.print("출금액:");
				balance = Integer.parseInt(sc.nextLine());

				boolean isCorrect = false;
				for (int i = 0; i < acc.length; i++) {
				    if (acc[i] != null && acc[i].getAccountNum().equals(accountNum)) {
				        acc[i].setBalance(acc[i].getBalance() - balance);
				        isCorrect = true;
				        System.out.println("결과: 출금이 성공되었습니다.");
				        break;
				    }
				}
				if (!isCorrect) {
				    System.out.println("계좌가 존재하지 않습니다.");
				}
			}



			else if (selectNo == 5) {
				System.out.println("------");
				System.out.println("종료");
				System.out.println("------");

				System.out.println("결과: 프로그램 종료");
			}
			
			else {
				System.out.println("1~5 까지 입력하세요");
			}
				}
	}
}