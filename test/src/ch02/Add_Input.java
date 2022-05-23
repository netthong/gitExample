package ch02;

import java.util.Scanner;

public class Add_Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
//		int x, y, sum ; 이렇게도 가능
		//ds
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		x = input.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		y = input.nextInt();
		
		sum = x + y ;
		System.out.println(sum);
		
		input.close();//스캐너 객체 닫기
		
		
		
	}
}
