
public class C0729_02 {

	public static void main(String[] args) {
		long result = factorial(5);
		// 5 * 4 * 3 * 2 * 1 = 120
		System.out.println("결과: "+result);
		
		long num = 1;
		for (int i=1; i<=5; i++) {
			num *= 1;
		}

	}
	
	public static long factorial(int n) {
		long result = 1;
		for (int i=n; i>1; i--) {
			result = i * result;
		}
		return result;
	}

}
