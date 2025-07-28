
public class C0725_01 {

	public static void main(String[] args) {
		// 자바 기본 8개 타입 
		boolean a = true;
		boolean a_2 = false;
		
		// char b = ''; 에러
		char b_2 = ' '; // 가능 (스페이스바 인식)
		char b_3 = 'a'; // 1개 문자만 가능 
		// char b_4 = 'ab'; 에러 2개 이상은 안 됨
		char b_5 = 97; // 97: a | 65: A | 48: '0'
		char b_6 = 42;
		
		char b_7 = 52; //'4'
		int b_8 = b_7-48; // '4'-'0' = 4 (숫자)
		
		byte c = 127; // 사칙연산 안 됨 -> 무조건 int에 넣거나 (byte)로 형변환
		// byte,short,char -> 사칙연산 -> int타입으로 변경되어 계산
		
		System.out.println(b_5);
		System.out.println(b_6);
		
		int d = 2147483647; //2147483648은 안 됨
		long d_2 = 2147483648L;
		
		if(a) {
			System.out.println("true입니다.");
		} else {
			System.out.println("false입니다.");
		}
		
		float f_2 = 1.1234567123f; // 소수점 8자리까지 유효성 인정
		System.out.println(f_2);
		
		double g = 1.0d; // 접미사 d,D를 생략 가능
		double g_2 = 1.0; // 접미사 생략 가능
		
		double g_3 = 1.12344566711223; // 소수점 16자리까지 유효성 인정
				
		float g_4 = 0.1f;
		double g_5 = 0.1;
		
		double g_6 = (double)g_4;
		
		float g_7 = (float)g_5;
		
		// float -> double 타입변경하지 않음
		// double -> float 타입변경해서 비교
		
		String s = "";
		String s_2 = " ";
		String s_3 = new String("abc");
		String s_4 = "abc";
		
		int s_5 = 10;
		String s_6 = ""+s_5;
		String s_7 = "5";
		String s_8 = "100";
		// 문자열 + 문자열  = 뒤에 문자열이 붙이는 방법 계산됨
		// -,*,/ 안됨
		System.out.println(s_7 + s_8); // "5"+"100" = "5100"
		int s_9 = Integer.parseInt(s_7); // 문자열->int타입변경
		double s_10 = Double.parseDouble(s_8); // 문자열 ->double타입변경
		
		// 문자열에서 1개 문자를 분리
		String s_11 = "홍길동";
		char s_12 = s_11.charAt(0);
		
		// 문자열 비교 - equals()
		String s_13 = "10";
		String s_14 = "10";
		
		// 문자열 + 7가지 연산 => 문자열로 변경
		
		System.out.println(""+1);
		System.out.println(""+'a');
		System.out.println(""+1.12345);
		

	}

}
