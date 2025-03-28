package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("\n-----------------------");
		
		for(i=1; i<=10; i++); {
			System.out.print(i + " ");
		}
		
		System.out.println("\n-----------------------");
		
		
//		while (true) {
//			System.out.print(i + " ");
//			i++;
//		}
		
		for (;;) {
		System.out.print(i + " ");
	}
		
	}
}



//주석은 드래그하고 ctrl + /

