package ch04.sec08.practice;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		//예금, 출금, 조회, 종료 기능을 제공하는 프로그램 작성
		
		int balance = 0; //잔액
		int request = 0; //요청금액
		String temp = ""; //임시저장 숫자
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("------------------------------");
		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
		System.out.println("------------------------------");
		System.out.println("선택>");
	
		//메뉴 선택 입력
		temp = sc.nextLine();
				
		if("1".equals(temp)) {
			//잔액 변수에 요청값 누적
			System.out.println("예금액>");
			request = Integer.parseInt(sc.nextLine());
			balance += request;
		}else if("2".equals(temp)) {//출금
			// 잔액 변수에서 요청값 차감
			System.out.println("출금액>");
			request = Integer.parseInt(sc.nextLine());
			
			//잔액이 부족한 경우
			if(balance < request) {
				System.out.println("잔액이 부족합니다.");
			}else {balance -= request;
			}
			}else if("3".equals(temp)) {//잔액
			System.out.println("잔액>" + balance);
		}else if("4".equals(temp)) {//종료
			break;
		}
		//해당 메뉴에 대한 일 처리
		//해당 메뉴에서 필요한 데이터 입력받기
		
		} //탈출
		
		
		
	}

}
