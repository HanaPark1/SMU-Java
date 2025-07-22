
public class C0721_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7000000;
		int result = 7000000 * 7000000 / 7000000; // 7000000
		//49,000,000,000,000 -> 21
		
		System.out.println("result: "+result);
		
		int result2 = 7000000 / 7000000 * 7000000;
		System.out.println("result2: "+result2);
		
		long result3 = 7000000 * 7000000 / 7000000; // 7000000
		System.out.println("result3: "+result3);
		
		int n = 65;
		System.out.println("n : "+n);
		char ch = (char) n; // 임시 처리, 진짜 문자가 되는 건 ㄴ
		System.out.println("ch: "+ch);
		
		float f = 1.6f;
		System.out.println("f : "+f);
		int num = (int) f;
		System.out.println("num: "+num);
	}

}
