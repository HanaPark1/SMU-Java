import java.util.Scanner;

public class C0725_04 {

	public static void main(String[] args) {
		// 조건문, 반복문
		Scanner scan = new Scanner(System.in);
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("숫자를 입력하세요: ");
		int input = scan.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("[ 성적입력 ]");
			break;
		case 2:
			System.out.println("[ 성적출력 ]");
			break;
		case 3:
			System.out.println("[ 성적수정 ]");
			break;
		case 0:
			System.out.println("[ 프로그램종료 ]");
			break;
		}
		
//		// 양수, 0, 음수
//		if(input>0) System.out.println("양수");
//		else if(input==0) System.out.println("0입니다. ");
//		else System.out.println("음수");
		
		
	}

}
