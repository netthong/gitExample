package ch02;

public class HelloExam {
	
	public static int sum(int n, int m) {
		return n + m; // return은 결과값을 호출한 쪽으로 반환한다.		
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s; //지역변수를 선언한 상태
		char a;
		
		s = sum(i, 10);    // n -> 20  . m -> 10
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
