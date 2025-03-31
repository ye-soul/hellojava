package ch05.sec10;

public class Ex07 {
	
	public static void main(String[] args) {
		int[] array = {1,5,3,8,2};
		int max = 0;
		
		for (int temp : array) {
			System.out.println (index + "번째 값은 =>" + temp);
			index++;
			if (temp > max) {
				max = temp; // 더 큰 값이 나타나면 max를 바꿔줌
			}
		}

		System.out.println("최대값: " + max);
		
		System.out.println("---------------");
		for int(i=0; i<array.lenght; i++) {
			System.out.println("n번째 값은" + i);
		}
	}
}