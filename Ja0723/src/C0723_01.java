import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// 변수 선언하는 방법
		int a = 10;
		float f = 10.0f;
		double d = 10.0;
		
		// 숫자 입력받기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 덧셈 프로그램 ] ");
		System.out.println("1. 21억 이하 덧셈");
		System.out.println("2. 21억 이상 덧셈");
		System.out.println("=================");
		System.out.println("원하는 번호를 입력하세요 >> ");
		int choice = scan.nextInt();
		
		System.out.println("숫자1를 입력하세요: ");
		int input = scan.nextInt();
		System.out.println("숫자2를 입력하세요: ");
		int input2 = scan.nextInt();
		
		System.out.println("입력 숫자: "+input);
		System.out.println("입력 숫자: "+input2);
		
		switch(choice) {
		case 1 :
			System.out.println("합계: "+ (input+input2));
			break;
		case 2 :
			long total = (long)input+input2;
			System.out.println("합계: "+ total);
			break;
		}
		
		
		
	}

}
