package ch02.sec13;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String inputData = scanner.nextLine();
		
		System.out.println("입력한 내용 : " + inputData);

		scanner.close();
	}

}
