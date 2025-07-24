import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// 숫자 1-45까지 숫자 6개를 입력받고
		// 로또번호 6개를 생성해서 출력하시오
		// 입력번호 : 1 45 3 10 5 20
		// 로또번호 : 20 4 9 35 7 21
		
		int[] lottoNum = new int[45];
		int[] my = new int[6];
		int[] sNum = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		// 로또번호 삽입
		for (int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = i+1;
		}
		
		int rnum = 0 ;
		int temp = 0; // 임시 저장
		
		// 로또 번호 섞기
		for (int i=0; i<300; i++) {
			rnum = (int)(Math.random()*45);
			temp = lottoNum[0];
			lottoNum[0] = lottoNum[rnum];
			lottoNum[rnum] = temp; // 서로 값 교체
		}
		// 로또 숫자 입력받기
		for (int i=0; i<my.length; i++) {
			System.out.printf("%d번째 숫자를 입력해 주세요",i+1);
			my[i] = scan.nextInt();
		}
		
		// 내 로또 숫자 생성하기
		for (int i=0; i<my.length; i++) {
			rnum = (int)(Math.random()*45);
			sNum[i] = lottoNum[rnum];
		}
		
		// 결과 출력하기
		System.out.print("입력번호: ");
		for (int i=0; i<my.length; i++) {
			System.out.printf("%d\t", my[i]);
		}
		System.out.println();
		
		// 결과 출력하기
		System.out.print("로또번호: ");
		for (int i=0; i<sNum.length; i++) {
			System.out.printf("%d\t", sNum[i]);
		}
		System.out.println();	
		
		// 맞힌 개수 카운트하기
		int o = 0;
		for (int i=0; i<my.length; i++) {
			for (int j=0; j<sNum.length; j++) {
				if (my[i] == sNum[j]) {
					o++;
					break;
				}
			}
		}
		System.out.printf("맞힌 개수: %d\n", o);	
	}

}
