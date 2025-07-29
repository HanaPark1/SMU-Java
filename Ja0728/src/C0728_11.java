import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// 숫자 맞히기 프로그램
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 숫자맞히기");
		System.out.println("2. 로또맞히기");
		System.out.println("3. 구구단");
		System.out.println("4. 사칙연산");
		System.out.println("원하는 번호를 선택>>>>>>>>>");
		int choice = scan.nextInt();
		Process p =  new Process();
		
		switch(choice) {
		case 1:
			//숫자맞히기 프로그램 구현
			// 1-100까지 중 10 번 입력받아 10 이후 정답 출력
			p.rnum = (int)(Math.random()*100)+1; // 타겟 랜덤 숫자
			for (int i=0; i<10; i++) {
				System.out.print("숫자를 입력하세요(1-100)>>>>>>");
				int a  = scan.nextInt();
				int result = p.catchNumber(a);
				if (result == 1) break;
			}
			
			break;
			
		case 2:
			int[] num = new int[45];
			int[] myNo = new int[6];
			int[] lotto = new int[6];
			int[] okNo = new int[6];
			int count = 0; // 맞춘 개수 - 기본변수
			
			// process.java에 메소드를 구현해서 입력번호, 로또번호, 맞춘번호를 출력하시오.
			// 매개변수 전달 - myNo, lotto, okNo, count
			
			for (int i=0; i<myNo.length; i++) {
				System.out.printf("%d번째 번호를 입력하세요>>>>>> ",i+1);
				myNo[i] = scan.nextInt();
			}
			
			for (int i=0; i<lotto.length; i++) {
				int rnum = (int)(Math.random()*44)+1;
				for (int j=0; j<lotto.length; j++) {
					if(lotto[j] == rnum) {
						break;
					}
				}
			}
			System.out.println("입력번호: " + Arrays.toString(myNo));
			System.out.println("로또번호: " + Arrays.toString(lotto));
			System.out.print("맞힌번호: ");
			for (int i=0; i<count; i++) {
				System.out.print(okNo[i]+" ");
			}
			
			break;
		case 3:
			// 구구단
			p.gugudan();
			break;
		case 4:
			double[] result = {0,0,0,0}; // 참조형 매개변수
			int a = 10;
			int b = 5;
			
			p.resultProcess(a, b, result);
			System.out.println(Arrays.toString(result));
			break;
		
		}
	}
}
