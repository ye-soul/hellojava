package ch06.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		
		Car myCar2 = new Car("검정", "소나타", 250);
		
		Car myCar3 = new Car("그랜저", 250, "검정");
		
		Car myCar4 = new Car("검정", 250, "그랜저");
		
		//Car myCar = new Car();  //기본 생성자 호출 못함
	}
}

