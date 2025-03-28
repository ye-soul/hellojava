package ch03.sec11;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	
	
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		//int a = x+y;
		System.out.println("z= " + z);  //31
		//System.out.println("z= " + a); //30
	}
}

