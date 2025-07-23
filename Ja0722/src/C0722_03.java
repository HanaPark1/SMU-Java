
public class C0722_03 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println(c1);
		
		char c2 = 97;
		System.out.println(c2);
		
		// char c3 = c1 + 1; 에러 char + int = int이기 때문에 char로 형변환 필요
		char c3 = (char)(c1+1);
		System.out.println(c3);
		
		char c4 = ++c1; // 증감 연산자 사용 시 타입 변경 안해도 
		System.out.println(c4);
	
		int i = 'B' - 'A';
		System.out.println(i);
		int i2 = 'b'-'a';
		System.out.println(i2);
		int i3 = '1'-'0';
		System.out.println(i3);
		int i4 = '3'-'0';
		System.out.println(i4);
		int i5 = '9'-'0';
		System.out.println(i5);
		
		int n = 5;
		String s = n+"";
		
	}

}
