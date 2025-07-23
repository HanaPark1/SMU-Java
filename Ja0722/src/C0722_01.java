
public class C0722_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean a = true;
		boolean a_2 = false;
		
		byte b = 1;
		
		short c = 1;
		
		char d = 'a';
		char d_2 = 65; // A
		char d_3 = 'A';
		char d_4 = ' '; // 빈공백 가능
		// char d_5 = ""; 에러
		// char d_6 = 'ab'; 에러 1개의 문자만 가능
		// char d_7 = "a"; 에러 작은 따옴표만 가
		
		int e = 1;
		
		long f = (long)1; 
		long f_2 = 1; // long 생략 가능 (높은 걸로 변환하니까)
		long f_3 = 1L;
		long f_4 = 1l;
		
		float g = 1.1F;
		float g_2 = 1.1f;
		
		double h = 1.1;
		double h_2 = 1.1D;
		double h_3 = 1.1d;
	
		String s = ""; // 객체 타입, 참조형 변수
		String s_2 = " ";
		String s_3 = "a";
		String s_4 = "ab";
		
		// 타입 변
		String k = "1"; // 타입 문자열타입 - String 타입, 문자열 변수, 
		String k_2 = "10.5";
		int num = Integer.parseInt(k); // 문자열 k가 정수형으로 바뀜
		double num2 = Double.parseDouble(k_2); // 문자열 k_2가 실수형변환
		
		double m = 1.2;
		int num3 = (int) m;
	}

}
