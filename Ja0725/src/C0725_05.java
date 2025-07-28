import java.util.Scanner;

public class C0725_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 반복문
		while (true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("번호를 입력하세요(0. 종료): ");
			int choice = scan.nextInt();
			if (choice==0) {
				break;
			}
		}
		
				
		
//		// 반복문
//		int sum = 0;
//		for (int i=1; i<=10; i++) {
//			sum = sum + i;
//		}

	}

}
