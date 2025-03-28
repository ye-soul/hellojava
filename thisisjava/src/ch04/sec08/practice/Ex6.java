package ch04.sec08.practice;

public class Ex6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) { // 1줄부터 6줄까지
            for (int j = 1; j <= i; j++) { // 각 줄마다 i개의 * 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}