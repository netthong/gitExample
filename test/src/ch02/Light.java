package ch02;

public class Light {
	public static void main(String[] args) {
		// long 은 64비트(8바이트) 정수를 저장
		long lightspeed ;
		long distance ;
		
		lightspeed = 300000L;
		distance = lightspeed * 365 * 24 * 60 * 60;
		
		System.out.println("빛이 1년 동안 가는 거리 : " + distance + "km");
		
	}

}
