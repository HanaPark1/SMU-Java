import java.util.Scanner;

public class C0723_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		// 반복문 - for, while
//		
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		
//		int j=0;
//		while (j<10) {
//			System.out.println(j);
//			j++;
//		}
//		
//		int k=0;
//		do {
//			System.out.println(k);
//			k++;
//		} while(k<10);
		
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=10; i++) {
//			System.out.println(i);
//			sum += i;
//		}
//		// 정수 %d, 실수 %f, 문자열 %s, 문자 %c 
//		System.out.printf("1 ~%d 까지 합\n%d", (i-1), sum);
//		
//		while(true) {
//			System.out.println("무한");
//		}

		System.out.println("[ 랜덤 숫자 맞히기 ]");
		System.out.println("1-10까지 숫자를 입력하세요 ");
		int rnum = (int)(Math.random()*10)+1;
		
		for (int i=1;i<6;i++) {
			
			System.out.printf("%d번째 숫자: ",i);
			int input = scan.nextInt();
			
			if (input == rnum) {
				System.out.println("[ 정답 ]");
				System.out.printf("[ 정답 숫자: %d ]", rnum);
				break;
			} else if (input > rnum) {
				System.out.println("[ 오답 - 입력 숫자가 더 큽니다. ]");
			} else {
				System.out.println("[ 오답 - 입력 숫자가 더 작습니다. ]");
			}
		}

	}

}
