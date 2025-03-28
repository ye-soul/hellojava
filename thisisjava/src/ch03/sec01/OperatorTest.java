package ch03.sec01;

public class OperatorTest {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		double result;
		
		result = (double) b / a;
		
		System.out.println("result :" +  result);
		
		
		int c = 2;
		int d = 7;
		int result2;
		int result3;
		
		result2 = d % c;
		result3 = d / c;
		
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

	}

}
