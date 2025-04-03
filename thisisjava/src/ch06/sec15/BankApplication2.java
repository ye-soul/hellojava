package ch06.sec15;

import java.util.Scanner;

public class BankApplication2 {

  private static Account[] accArr = new Account[100];
  private static int index = 0;
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean run = true;
    String menu = "";

    while (run) {
      System.out.println("----------------------------------");
      System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
      System.out.println("----------------------------------");
      System.out.print("선택>");
      menu = sc.nextLine();
      switch (menu) {
      case "1":
        // 계좌 생성
        System.out.println("계좌 생성");
        createAccount();
        break;
      case "2":
        // 계좌목록
        System.out.println("계좌목록");
        printAccountList();
        break;
      case "3":
        // 예금
        System.out.println("예금");
        deposit();
        break;
      case "4":
        // 출금
        System.out.println("출금");
        withdraw();
        break;
      case "5":
        // 종료
        System.out.println("종료");
        run = false;
        break;
      default:
        // 그외에
        System.out.println("잘못된 메뉴번호 입니다");
        break;
      }
    }
  }

  public static void createAccount() {
    // 계좌 생성 ( String accNum, String owner, int balance )
    String accNum = "";
    String owner = "";
    int balance = 0;

    System.out.println("------");
    System.out.println("계좌생성");
    System.out.println("------");

    if (index < 99) {
      System.out.print("계좌번호:");
      accNum = sc.nextLine();
      System.out.print("계좌주:");
      owner = sc.nextLine();
      System.out.print("초기금액:");
      balance = Integer.parseInt(sc.nextLine());

      Account acc = new Account(accNum, owner, balance);
      accArr[index] = acc;
      index++;
    } else {
      System.out.println("계좌생성이 불가능 합니다");
    }
  }

  public static void printAccountList() {
    System.out.println("------");
    System.out.println("계좌목록");
    System.out.println("------");

    for (int i = 0; i < index; i++) {
      System.out.println(accArr[i].showInfo());
    }
  }

  //예금 기능 수행 
  public static void deposit() {
    System.out.println("------");
    System.out.println("예   금");
    System.out.println("------");
    System.out.print("계좌번호:");
    String accNum = sc.nextLine();
    System.out.print("예금액:");
    int balance = Integer.parseInt(sc.nextLine());

    // 계좌 번호에 해당 하는 Account 객체를 accArr 배열에서 찾는다
    for (Account acc : accArr) {
      if (accNum.equals(acc.getAccNum())) {
        acc.deposit(balance);
        break;
      }
    }
  }

  //출금 기능 수행 
  public static void withdraw() {
    System.out.println("------");
    System.out.println("출   금");
    System.out.println("------");
    System.out.print("계좌번호:");
    String accNum = sc.nextLine();
    System.out.print("출금액:");
    int balance = Integer.parseInt(sc.nextLine());

    // 계좌 번호에 해당 하는 Account 객체를 accArr 배열에서 찾는다
    for (Account acc : accArr) {
      if (accNum.equals(acc.getAccNum())) {
        acc.withdraw(balance);
        break;
      }
    }
  }
}