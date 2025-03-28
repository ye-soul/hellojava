package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);  //println이랑 print랑 다름
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다..";
		System.out.println(str);

		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.print("나는 ");
		System.out.print("자바를 ");
		System.out.print("배웁니다.");
		
		System.out.print("\n나는 \n자바를 \n배웁니다.");
	}
}
