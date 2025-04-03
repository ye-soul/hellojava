package ch06.sec08.exam03;

public class PizzaBread {
    int price = 700;
    String name;

    // 기본 생성자
    PizzaBread(String name) {
        this.name = name;
    }

    // 오버로딩 생성자
    PizzaBread(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    // 특별한 메뉴용 생성자 (정해진 값으로)
//    PizzaBread() {
//        this("씨앗호떡", 900); // 기본값 생성
//    }
}