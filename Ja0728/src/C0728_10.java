import java.util.Scanner;

public class C0728_10 {

	public static void main(String[] args) {
		// 세 개의 숫자를 입력받아 더하기, 빼기, 곱하기, 나누기를 구성하시오.
		// Cal.java를 만들어서 구성
		
		Scanner scan = new Scanner(System.in);
		Cal2 cal = new Cal2();
		
		System.out.println("1번째 숫자를 입력하세요>>>>>>>>> ");
		int a  = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요>>>>>>>>> ");
		int b  = scan.nextInt();
		System.out.println("3번째 숫자를 입력하세요>>>>>>>>> ");
		int c  = scan.nextInt();
		while (true) {
			System.out.println("[ 사칙연산 ]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("숫자를 선택하세요 (0.프로그램종료)>>>>>>>>>>>>>");
			int choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("1. 더하기");
				int add = cal.add(a, b, c);
				System.out.println(add);
				break;
			case 2:
				System.out.println("2. 빼기");
				int minus = cal.minus(a, b, c);
				cal.minus(a, b, c);
				System.out.println(minus);
				break;
			case 3:
				System.out.println("3. 곱하기");
				int multi = cal.multi(a, b, c);
				cal.multi(a, b, c);
				System.out.println(multi);
				break;
			case 4:
				System.out.println("4. 나누기");
				double  divide = cal.divide(a, b, c);
				cal.divide(a, b, c);
				System.out.println(divide);
				break;
			case 0:
				System.out.println("0. 프로그램 종료");
				break;
			}
			
		}

	}

}
