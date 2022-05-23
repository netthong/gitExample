package ch02;

import java.util.Scanner;
//Ctrl + Shift + O 키를 누르면 import 됨.

public class ScannerEx {
	//키보드로부터의 사용자 입력값을 처리하는 프로그램
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  //나는 Radeon 오류 창 뜨면서 안되길래 타이핑으로함.
		//스캐너객체 : 키보드로부터 값을 입력받게 해주는 객체
		System.out.println("첫번째 정수값?"); //안내문구
		int x = in.nextInt(); //정수값을 입력받도록하는 메소드 nextInt()
		System.out.println("두번째 정수값?");
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d 입니다.\n", x, y, x*y);
		
		
	}
	

}
