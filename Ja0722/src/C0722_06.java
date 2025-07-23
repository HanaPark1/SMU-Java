import java.util.Scanner;

public class C0722_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요: ");
		String input = scan.next();
		char ch = input.charAt(0);
		// 첫글자가 영문소문자인지 아닌지 출력하시오.
		// 영문자입니다. 영문자가 아닙니다.
		
		if (ch >= 'a' && ch <= 'z' ) {
			System.out.println("영문자입니다.");
		} else {
			System.out.println("영문자가 아닙니다.");
		}
		
		if (ch >= '0' && ch <= '9' ) {
			System.out.println("숫자입니다.");
			int num = ch-'0'; // 문자 > 숫자(int) 변경
		} else {
			System.out.println("숫자가 아닙니다.");
		}
		
		System.out.println("입력: "+input);
		System.out.println("입력1: "+ch);

	}

}
