package ch02;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner square = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double a = square.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double b = square.nextDouble();
		
		System.out.println("직사각형의 넓이는 "+ a*b +" 입니다.");
		System.out.println("=============================");
		
		
		

	}

}
