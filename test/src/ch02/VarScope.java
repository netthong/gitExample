package ch02;

public class VarScope {
	
	static int x ; //전역 변수 설정  -> 전역 변수는 초기화하지 않아도 자동 초기화 값 할당 됨. int는 0 이 할당됨.
	
	public static void main(String[] args) {
		int y = 0 ; //지역 변수 설정 : 메소드 안에서만 적용
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
