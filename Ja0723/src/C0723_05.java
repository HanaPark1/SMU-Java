import java.util.Scanner;

public class C0723_05 {

	public static void main(String[] args) {
		//두 수를 입력받아 2, 7 2에서 7까지의 합을 구하시오
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int input = scan.nextInt();
		
		System.out.println("숫자2를 입력하세요: ");
		int input2 = scan.nextInt();
	
		
		int sum = 0; 
		
		if (input > input2) {
			int temp = 0;
			temp = input2;
			input2 = input;
			input = temp;
		}
		
		for (int i=input; i<=input2; i++) {
			sum += i;
		}
		
		System.out.println("합계: "+sum);
		
		// 1-100 합을 출력
		
		int sum2 = 0;
		for (int i=1; i<=100; i++) {
			sum2 += i;
		}
		System.out.println(sum2);
	
		// 1에서 얼마까지 해야 합계가 100을 넘는 시점을 출력
		int sum3 = 0;
		int i = 0;
		for (i=1; sum3<100; i++) {
			sum3 += i;
		}
		System.out.println(sum3);
		System.out.println(i-1);
		
		// 500 넘는 시점 바로 전단계를 출력하시오.
		int sum4 = 0;
		int i4 = 0;
		for (i4=1; sum4<500; i4++) {
			sum4 += i4;
			System.out.printf("i: %d, sum: %d \n", i4, sum4);
			
		}
		System.out.println(i4-2);
	
	}

}
