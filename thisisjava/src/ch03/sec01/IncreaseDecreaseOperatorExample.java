package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x = x +1
		++x; // 1 + x+1
		System.out.println("x=" + x);		

		System.out.println("-----------------------");		
		y--; // y = y-1
		--y; // 1 - y-1
		System.out.println("y=" + y);		

		System.out.println("-----------------------");		
		z = x++;  // x (12) + 1
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");		
		z = ++x; // 1 + x+1(13)
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------");				
		z = ++x + y++; // 1 + 13 + 8 + 1
		System.out.println("z=" + z);
		System.out.println("x=" + x); //1 + 14
		System.out.println("y=" + y); //8 + 1
	}
}
