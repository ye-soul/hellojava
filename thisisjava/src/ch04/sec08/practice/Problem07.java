package ch04.sec08.practice;

import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            int num = (int) (Math.random() * 100) + 1; // 새로운 숫자 생성
            int input;

            System.out.println("=============================");
            System.out.println("      [숫자 맞추기 게임 시작]      ");
            System.out.println("=============================");

            while (true) {
                System.out.print(">> ");
                input = sc.nextInt();

                if (num < input) {
                    System.out.println("더 낮게");
                } else if (num > input) {
                    System.out.println("더 높게");
                } else {
                    System.out.println("맞았습니다.");
                    sc.nextLine(); // 숫자 입력 후 남은 개행 문자 제거
                    System.out.print("게임을 종료하시겠습니까? (y/n) >> ");
                    answer = sc.nextLine();

                    if (answer.equals("y")) {
                        System.out.println("=============================");
                        System.out.println("      [숫자 맞추기 게임 종료]      ");
                        System.out.println("=============================");
                        sc.close();
                        return; // 프로그램 종료
                    } else {
                        break; // 내부 while문 탈출 → do-while로 돌아감
                    }
                }
            }

        } while (true);
    }
}