package ch06.sec08.exam03;

public class FishBread {
  int price = 700;
  String name;
  
  FishBread(String name){
	this.name = name;
  }
  FishBread(String name, int price) {
      this.name = name;
      this.price = price;
  }

//  // 특별한 메뉴용 생성자 (정해진 값으로)
//  FishBread() {
//      this("슈크림붕어빵", 1000); // 기본값 생성
//  }
}
  
