package com.javaex.problem08;

import java.util.Scanner;

public class BookShop2 {
    public static void main(String[] args) {
        Book2[] books = new Book2[10];
        books[0] = new Book2(1, "트와일라잇", "스테파니메이어");
        books[1] = new Book2(2, "뉴문", "스테파니메이어");
        books[2] = new Book2(3, "이클립스", "스테파니메이어");
        books[3] = new Book2(4, "브레이킹던", "스테파니메이어");
        books[4] = new Book2(5, "아리랑", "조정래");
        books[5] = new Book2(6, "젊은그들", "김동인");
        books[6] = new Book2(7, "아프니깐 청춘이다", "김난도");
        books[7] = new Book2(8, "귀천", "천상병");
        books[8] = new Book2(9, "태백산맥", "조정래");
        books[9] = new Book2(10, "풀하우스", "원수연");
        Scanner scanner = new Scanner(System.in);
        
        
        while(true) {
        
        System.out.println("*****도서 정보 출력하기******");
        displayBookInfo(books);

        System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
        int num = scanner.nextInt();
        if (num == 0 ) {
        	System.out.println("프로그램 종료");
        	break;
        }

        // (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
        books [ num-1 ].rent();
        
        }
        
        scanner.close();
        
    }
//        System.out.println("*****도서 정보 출력하기******");
//        displayBookInfo(books);
    //(2)전달받은 배열을 모두 출력하는 메소드
    private static void displayBookInfo(Book2[] books) {
        //코드작성
		for (Book2 b :books) {
	    	b.print();
	    }
	}
}