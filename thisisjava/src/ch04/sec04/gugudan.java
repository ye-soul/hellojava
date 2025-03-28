package ch04.sec04;

public class gugudan {

    public static void main(String[] args) {
        // 단 제목 출력
        for (int m = 2; m <= 9; m++) {
            System.out.print("=== " + m + "단 ===\t");
        }
        System.out.println(); // 줄 바꿈

        // 각 줄(1~9)마다 출력
        for (int n = 1; n <= 9; n++) {
            for (int m = 2; m <= 9; m++) {
                System.out.print(m + " x " + n + " = " + (m * n) + "\t");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
