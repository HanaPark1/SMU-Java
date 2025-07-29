import java.util.Scanner;

public class C0728_09 {

	public static void main(String[] args) {
		// a,b 입력받아, 더하기, 빼기, 곱하기, 나누기 계산을 하는 프로그램
		Scanner scan = new Scanner(System.in);
		
		Cal cal = new Cal();
		
		System.out.println("첫번째 숫자를 입력하세요>>>>");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요>>>>");
		int b = scan.nextInt();

		System.out.println("[ 사칙연산 ]");
		System.out.println("1. 더하기");
		int result = cal.add(a, b);
		System.out.println(result);
		
		System.out.println("2.빼기");
		int result2 = cal.minus(a, b);
		System.out.println(result2);
		
		System.out.println("3. 곱하기");
		int result3 = cal.multi(a, b);
		System.out.println(result3);
		
		System.out.println("4. 나누기");
		double result4 = cal.divide(a, b);
		System.out.println(result4);

	}
}
