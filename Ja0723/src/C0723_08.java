import java.util.Scanner;

public class C0723_08 {

	public static void main(String[] args) {
		// 배열
		
		int score0=0, score1=1, score2=2, score3=3, score4=4, score5=5;
		System.out.println(score0);
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		// 배열 선언 및 값 지정 1
		int[] s = new int[6];
		s[0] = 0;
		s[1] = 1;
		s[2] = 2;
		s[3] = 3;
		s[4] = 4;
		s[5] = 5;
		
		// 배열 선언 및 값 지정 2
		for (int i=0;i<6;i++) {
			s[i] = i;
			System.out.println(s[i]);
		}
		
		// 배열 선언 및 값 지정 3
		int[] m = {0,1,2,3,4,5};
		
		// 배열 선언 및 값 지정 4
		int[] n = new int[] {1,2,3,4,5,6};
		
		// 배열 100개를 만들고, 1-100까지 숫자를 입력해서 출력
		
		int[] h = new int[100];
		for (int i=0;i<h.length;i++) {
			h[i] = i;
			System.out.println(h[i]);
		}
		
		// 5개의 숫자 입력받아 배열에 넣어서 출력하시오
		Scanner scan = new Scanner(System.in);
		
		int[] f = new int[5];
		
//		System.out.println("숫자를 입력하세여>> ");
//		f[0] = scan.nextInt();
//		System.out.println("숫자를 입력하세여>> ");
//		f[1] = scan.nextInt();
//		System.out.println("숫자를 입력하세여>> ");
//		f[2] = scan.nextInt();
//		System.out.println("숫자를 입력하세여>> ");
//		f[3] = scan.nextInt();
//		System.out.println("숫자를 입력하세여>> ");
//		f[4] = scan.nextInt();
		
		for (int i=0;i<f.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세여>> ",i+1);
			f[i] = scan.nextInt();
		}
		for (int i=0;i<f.length;i++) {
			System.out.println(f[i]);
			
		}
		
		

	}

}
