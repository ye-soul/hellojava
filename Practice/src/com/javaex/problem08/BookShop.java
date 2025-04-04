package com.javaex.problem08;

import java.util.Scanner;


public class BookShop {
	public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new Book(1, "트와일라잇", "스테파니메이어",false);
        books[1] = new Book(2, "뉴문", "스테파니메이어",false);
        books[2] = new Book(3, "이클립스", "스테파니메이어",false);
        books[3] = new Book(4, "브레이킹던", "스테파니메이어",false);
        books[4] = new Book(5, "아리랑", "조정래",false);
        books[5] = new Book(6, "젊은그들", "김동인",false);
        books[6] = new Book(7, "아프니깐 청춘이다", "김난도",false);
        books[7] = new Book(8, "귀천", "천상병",false);
        books[8] = new Book(9, "태백산맥", "조정래",false);
        books[9] = new Book(10, "풀하우스", "원수연",false);

        
        
        

        System.out.println("*****도서 정보 출력하기******");
//        displayBookInfo(books);
            for (int i = 0; i < books.length; i++) {
                books[i].displayBookInfo();
            }

        Scanner scanner = new Scanner(System.in);
        System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
        int num = scanner.nextInt();
        
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNum() == num) {
                books[i].setBr(true); // 대여 상태로 바꾸기
                System.out.println(books[i].getName() + " 가 대여되었습니다.");
                break;
            }
        }
        System.out.println("*****도서 정보 출력하기******");
        for (int i = 0; i < books.length; i++) {
            books[i].displayBookInfo();
        }
        System.out.print("반납 하고 싶은 책의 번호를 입력하세요:");
        scanner.nextInt();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getNum() == num) {
                books[i].setBr(false); // 대여 상태로 바꾸기
                System.out.println(books[i].getName() + " 가 반납되었습니다.");
                break;
            }
        } 
        for (int i = 0; i < books.length; i++) {
            books[i].displayBookInfo();
        }
        scanner.close();
        
        
    }
    }


//        // (1) 입력된 번호에 맞는 책을 찾아 대여 되었음(상태코드=0)을 체크 합니다.
//        System.out.println("*****도서 정보 출력하기******");
////        displayBookInfo(books);
//        for (int i = 0; i < books.length; i++) {
//            books[i].displayBookInfo();
//        }
//        
//        System.out.print("반납 하고 싶은 책의 번호를 입력하세요:");
////        Scanner sc = new Scanner(System.in);
////        int num2 = sc.nextInt();
//////        
//        for (int i = 0; i < books.length; i++) {
//            if (books[i].getNum() == num) {
//                books[i].setBr(false); // 대여 상태로 바꾸기
//                System.out.println(books[i].getName() + " 가 반납되었습니다.");
//                break;
//            }
//        }
//        scanner.close();
//    //(2)전달받은 배열을 모두 출력하는 메소드
////        for (int i = 0; i < books.length; i++) {
////            books[i].displayBookInfo();
////        }
//        
//       
////    private static void displayBookInfo(Book[] books) {
//        //코드작성
//    }
//
//}
