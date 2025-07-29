import java.util.Scanner;

public class Process {
	int rnum;
	int result = 0;
	Scanner scan = new Scanner(System.in);
	
	int catchNumber (int a) {
		if (rnum == a) {
			System.out.println("정답입니다.");
			System.out.printf("입력숫자: %d\t정답숫자: %d\n", a, rnum);
			result = 1;
			
		} else if(rnum > a) {
			System.out.println("정답이 아닙니다.");
			System.out.printf("입력숫자: %d\n입력 숫자가 더 작습니다.\n",a);
		} else {
			System.out.println("정답이 아닙니다.");
			System.out.printf("입력숫자: %d\n입력 숫자가 더 큽니다.\n",a);
		}
		return result;
	}
	
	void gugudan() {
		System.out.println("2단에서부터 원하는 단을 입력하세요.");
		int number = scan.nextInt();
		System.out.println("[ 구구단 ]");
		System.out.println("--------------------------------");
		for(int i=2; i<=number; i++) {
			System.out.printf("[ %d단 ]\n",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	void resultProcess(int a, int b, double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
	}
}
