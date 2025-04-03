package ch06.sec08.exam03;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호떡갯수>>");
		FishBread[] fb = new FishBread[sc.nextInt()];
		for (int i=0; i<fb.length; i++) {
			fb[i] = new FishBread("호떡", 700);
		}
		
		System.out.print("씨앗호떡갯수>>");
		FishBread[] sb = new FishBread[sc.nextInt()];
		for (int i=0; i<sb.length; i++) {
			sb[i] = new FishBread("씨앗호떡", 900);
		}
		
		System.out.print("팥붕어빵갯수>>");
		PizzaBread[] rb = new PizzaBread[sc.nextInt()];
		for (int i=0; i<rb.length; i++) {
			rb[i] = new PizzaBread("팥붕어빵", 700);
		}
		
		System.out.print("크림붕어빵갯수>>");
		PizzaBread[] cb = new PizzaBread[sc.nextInt()];
		for (int i=0; i<cb.length; i++) {
			cb[i] = new PizzaBread("크림붕어빵", 1000);
		}

		//붕어빵 갯수 * 붕어빵 고유가격 = 붕어빵 3개 가격
		int fbPrice = fb.length * fb[0].price;
		int sbPrice = sb.length * sb[0].price;
		int rbPrice = rb.length * rb[0].price;
		int cbPrice = cb.length * cb[0].price;
		
		int total = fbPrice + sbPrice + rbPrice + cbPrice;
		
		System.out.println("팥붕어빵" + fb.length + "개");
		System.out.println("크림붕어빵" + cb.length + "개");
		System.out.println("호떡" + fb.length + "개");
		System.out.println("씨앗호떡" + sb.length + "개");
		System.out.println("총 금액: " + total);
	}

}
