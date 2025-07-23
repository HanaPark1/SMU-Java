import java.util.Scanner;

public class C0723_07 {

	public static void main(String[] args) {
		
		// for
		int sum = 0;
		int i = 1;
		for (i=1;i<=10;i++) {
			sum += i;
		}
		
		// while
		sum = 0;
		i = 1;
		while (i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("합계: " + sum);
		
		// 1~100까지 합을 구하시오
		// 500을 넘는 시점의 i, sum을 출력하시오
		
		sum = 0;
		i = 1;
		while(i<100) {
			sum += i;
			if (sum > 500) {
				break;
			}
			i ++;
		}
		System.out.println(sum-i);
		System.out.println(i-1);
		
		// 구구단 2단~9단
		i = 2;
		
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
		}
		
		// 10번을 입력받아,
		// 입력: 5 정답, 오답 -  입력된 숫자가 큽니다. 오답 - 입력된 숫자가 작습니다
		// 정답:  값
		
		Scanner scan = new Scanner(System.in);
		
		int rnum = (int)(Math.random()*100)+1;
		
		i=1;
		while (i<=5) {
			System.out.println("숫자를 입력해 주세요:");
			System.out.printf("%d번째 숫자>>\n",i);
			int input = scan.nextInt();
			
			if (rnum == input ) {
				System.out.printf("정답\n");
				System.out.println(rnum);
				break;
				
			} else if (rnum > input) {
				System.out.printf("오답 - 입력된 값이 더 작습니다.\n");
			} else {
				System.out.printf("오답 - 입력된 값이 더 큽니다.\n");
			}
			i++;
		}
		System.out.println(rnum);
		
		// 입력된 숫자에서 멈춤하는 프로그램을 구현
		System.out.println("출력하려는 숫자를 입력해 주세요:");
		System.out.println("1) 짝수 2) 홀수 3) 모두");
		int choice = scan.nextInt();
		System.out.println("숫자를 입력해 주세요:");
		int input = scan.nextInt();
		i = 1;
		while (i<100) {
			if (choice == 1) {
				if (i%2!=0) {
					System.out.println(i);
				}
			} else if (choice == 2) {
				if (i%2==0) {
					System.out.println(i);
				}
			} else {
				System.out.println(i);
			}
			if (i == input) {
				break;
			}
			i++;
		}

	}

}
