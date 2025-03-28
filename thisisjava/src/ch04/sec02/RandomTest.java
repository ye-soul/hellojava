package ch04.sec02;

public class RandomTest {

	public static void main(String[] args) {
		int a = (int) (Math.random()*45)+1;
		int b = (int) (Math.random()*45)+1;
		int c = (int) (Math.random()*45)+1;
		int d = (int) (Math.random()*45)+1;
		int e = (int) (Math.random()*45)+1;
		int f = (int) (Math.random()*45)+1;
		
		System.out.println("로또번호 :" + a + "," + b +"," + c +"," + d+ "," + e + "," +f);

	}

}
