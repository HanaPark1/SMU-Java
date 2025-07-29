import java.util.Scanner;

public class C0729_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10;
		int b = 5;
		double[] num = new double[4];
		
		System.out.println("1. 더하기");
		System.out.println("2. 빼기");
		System.out.println("3. 곱하기");
		System.out.println("4. 나누기");
		System.out.println("5. 사칙연산");
		System.out.println("원하는 번호를 입력하세요>>>>>>>>>>>");
		int choice = scan.nextInt();
		int result = 0;
		
		Cal c = new Cal();
		switch(choice) {
		case 1:
			result = c.add(a, b);
			System.out.println("결과: "+result);
			break;
		case 2:
			result = c.minus(a, b);
			System.out.println("결과: "+result);
			break;
		case 3:
			result = c.multi(a, b);
			System.out.println("결과: "+result);
			break;
		case 4:
			c.divide(a, b);
			break;
		case 5: 
			c.calProcess(a, b, num);
			System.out.println("더하기: "+num[0]);
			System.out.println("빼기: "+num[1]);
			System.out.println("곱하기: "+num[2]);
			System.out.println("나누기: "+num[3]);
		}	

	}

}
