import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {
		
		// 1-100까지 랜덤숫자를 생성
		// 5번을 입력해서 정답, 오답-숫자가 큽니다, 오답-입력숫자가작습니다
		// 입력된 숫자 : 1 2 3 4 5
		// 정답 50
		int rnum = (int)((Math.random()*100) +1) ;
		int[] n = new int[100];
		Scanner scan = new Scanner(System.in);
		
//		for (int i=0;i<n.length;i++) {
//			System.out.printf("%d번째 숫자를 입력하세요: ", i+1);
//			n[i] = scan.nextInt();
//			if (rnum == n[i]) {
//				System.out.printf("정답 - %d\n", n[i]);
//				break;
//			} else if (rnum > n[i]) {
//				System.out.printf("오답 - 입력 숫자가 더 작습니다\n");
//			} else {
//				System.out.printf("오답 - 입력 숫자가 더 큽니다.\n");
//			}
//		}
//		System.out.printf("정답 - %d\n", rnum);
		
		int i = 0;
		while (true) {
			System.out.printf("%d번째 숫자를 입력하세요: ", i+1);
			n[i] = scan.nextInt();
			if (rnum == n[i]) {
				System.out.printf("정답 - %d\n", n[i]);
				break;
			} else if (rnum > n[i]) {
				System.out.printf("오답 - 입력 숫자가 더 작습니다\n");
			} else {
				System.out.printf("오답 - 입력 숫자가 더 큽니다.\n");
			}
			i++;
		}
		
//		
//		int[] score = {10,20,5,2,3};
//		
//		for (int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}

	}

}
