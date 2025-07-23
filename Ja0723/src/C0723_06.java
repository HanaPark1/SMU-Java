import java.util.Scanner;

public class C0723_06 {

	public static void main(String[] args) {
		System.out.printf("[%5d]", 5);
		System.out.printf("[%05d]", 5);
		
		for (int i=1;i<=100;i++) {
			System.out.printf("[%03d]\n", i);
		}
		// 중첩 for문 구구단
		// 중첩 for문 구구단
		for (int i=2; i<=9; i++) {
			System.out.printf(" [ %d단 ] \n",i);
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));	
			}
		}
		
		// 2개의 숫자를 입력받아 3 7  3~7단까지 출력하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("숫자1 입력하세요: ");
		int input = scan.nextInt();
		System.out.printf("숫자2 입력하세요: ");
		int input2 = scan.nextInt();
		
		if (input > input2) {
			int temp = 0;
			temp = input;
			input = input2;
			input2 = temp;
		}
		
		for (int i=input; i<=input2; i++) {
			System.out.printf(" [ %d단 ] \n",i);
			for (int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,(i*j));	
			}
		}
		
		// 구구단 가로로 출력 
		for (int j=1; j<=9; j++) {
			for (int i=2; i<=9; i++) {
				System.out.printf("%d * %d = %d\t",i,j,(i*j));	
			}
			System.out.println();
		}
		// 별 찍기
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=1;j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
		
		// 별 반대로 찍기
		for (int i=5;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		


	}

}
