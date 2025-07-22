
public class C0721_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요.");
		System.out.println("자바 시");
		
		// ---------------------
		// 변수 타입 - 8개 (byte, int, short, long), char, boolean, (float, *double)
		// char - 홑따옴표만 가능, 문자 1개만 가능
		
		// boolean - true, false만 올 수 있음
		boolean b = true;
		boolean b2 = false;
		// boolean b3 = 'a'; error - true, false만 올 수 있음
		
		char c = 'A';
		// char a = "A" error 문자형은 ''로 입력
		// char a = "AB" error  1개 문자만 가능
		
		char c2 = 'B';
		System.out.print(c);
		System.out.println(c2);
		
		String str = "AB"; // 문자열타입(변수)
		System.out.println(str);
		
		// 정수형 - byte, short, int, long 4개
		// int - 21억까지 가능
		// byte - 256가지 가능 (-128~127) 거의 사용 X
		// short - 32000 정도까지 숫자표현 거의 사용 X
		long h = 22000000000L;
		long h2 = 5L;
		long h3 = -222222222222222L;
		
		
		int i = 10;
		int i2 = 2000;
		int i3 = -2000000;
		// int i = 2200000000000; error 21억까지만 가능
		
		// 실수형 - float, double
		// 소수점의 유효성, float - 8자리, double - 15자리
		// float 1.1234567 890 (뒷자리는 정확도가 보장되지 X
		// double 1.123456789012345 6789 6000 (뒷자리 정확도 보장x, 6789와 6000 같다고 볼 수도 있
		float f  = 1.1F; // float 타입 - 접미사 F, f
		double d = 1.1D; // (D 생략 가능)
	}

}
