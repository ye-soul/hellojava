package ch06.sec08.exam03;

public class BreadManager {

	public static void main(String[] args) {
		//붕어빵 3개 만들기
		FishBread[] fb = new FishBread[3];
		fb[0] = new FishBread("붕어빵");
		fb[1] = new FishBread("붕어빵");
		fb[2] = new FishBread("붕어빵");
		
		//호떡 5개 만들기
		PizzaBread[] pb = new PizzaBread[5];
		for (int i=0l i<pb.length; i++) {
			pb[i] = new PizzaBread("호떡")
		}

		//붕어빵 갯수 * 붕어빵 고유가격 = 붕어빵 3개 가격
		int fbPrice = fb.length * 500;
		int pbPrice = pb.length*1000;
		
		int total = fbPrice + pbPrice;
		
		System.out.println("붕어빵" + fb.length + "개");
		System.out.println("호떡" + pb.length + "개");
		System.out.println("총 금액: " + total);
	}

}
