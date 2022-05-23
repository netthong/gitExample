package ch02;

public class NameUnicode {
	//\uD64D = 홍, \uBBFC = 민, \uAE30 = 기
	public static void main(String[] args) {
		String name = "홍 민 기";
		char h = '\uD64D';
		char m = '\uBBFC';
		char g = '\uAE30';
		
		
		System.out.println("=====================");
		System.out.println(name);
		System.out.println("---------------------");
		System.out.println("char형(\'\\u0D64D'): " + h );
		System.out.println("char형(\'\\u0BBFC\'): " + m );
		System.out.println("char형(\'\\u0AE30\'): " + g );
		
		System.out.println("=====================");
		
		
	}
	
	
	
}
