package ch06.sec08.exam03;

public class Store2 {

	public static void main(String[] args) {
		
		//팥 붕어빵 3개, 크림붕어빵 4개, 호떡 2개, 씨앗호떡 4개
		
		//붕어빵 (팥 붕어빵 + 크림 붕어빵)
		FishBread[] fb = new FishBread[7];
		
		//호떡 (호떡 + 씨앗 호떡)
		PizzaBread[] pb = new PizzaBread[6];
		
		
		fb[0] = new FishBread("팥붕어빵", 700);	     
		fb[1] = new FishBread("팥붕어빵", 700);
		fb[2] = new FishBread("팥붕어빵", 700);
		
		fb[3] = new FishBread("크림붕어빵", 1000);
		fb[4] = new FishBread("크림붕어빵", 1000);
		fb[5] = new FishBread("크림붕어빵", 1000);
		fb[6] = new FishBread("크림붕어빵", 1000);
		
		
		pb[0] = new PizzaBread("호떡",700);	
		pb[1] = new PizzaBread("호떡",700);	
		
		pb[2] = new PizzaBread("씨앗호떡",900);
		pb[3] = new PizzaBread("씨앗호떡",900);	
		pb[4] = new PizzaBread("씨앗호떡",900);	
		pb[5] = new PizzaBread("씨앗호떡",900);	

	
			//붕어빵 7개 가격
	        int fbPrice = 0;
	        for (FishBread fishBread : fb) {
	        	fbPrice += fishBread.price;
	        }
	        
	        //호떢 6개 가격
	        int pbPrice = 0;
	        for (PizzaBread pizzaBread : pb) {
	        	pbPrice += pizzaBread.price;
	        }
	        		
	        int total = fbPrice + pbPrice;
	        

	        System.out.println(total);
	}
		}


