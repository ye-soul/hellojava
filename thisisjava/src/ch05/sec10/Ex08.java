package ch05.sec10;

public class Ex08 {
	
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
				
		};
		int tot = 0;
		double avg = 0;
		int count = 0;
		
//		for (int[] row : array) {          // 각 줄(row) 꺼내기
//			for (int value : row) {
//		tot += value;
//		count ++;
				
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i].length);
			for (int j=0; j < array[i].length; j++) {
				tot += array[i][j];
				System.out.println("tot=" + tot);
				count ++;
			}
			avg = (double)tot / count;
		}

		System.out.println( "총합 :" + tot);
		System.out.println( "합계 :" + avg);
	} 
}


