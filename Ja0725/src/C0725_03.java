import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String d = "홍길동";
		double e = 1.12345678;
		System.out.println("a: "+a+"b: "+b);
		// %d: 정수 | %f: 실수 | %s: 문자열 | %c: 문자
		System.out.printf("이름: %s a: %d b: %d\n",d, a,b);

		System.out.printf("값 : %.2f \n", e);
		
		int h = 12;
		System.out.printf("%05d",h );
		
		// 콘솔에서 입력받을 때 
		Scanner scan = new Scanner(System.in);
		// 문자열 - nextLine(): enter키까지 입력받음, next()-enter키 입력안받음
		System.out.println("이름을 입력하세요: ");
		String i = scan.next();
		System.out.println("아이디를 입력하세요: ");
		String j = scan.next();
		System.out.println("이름: "+i);
		System.out.println("아이디: "+j);
	}

}
