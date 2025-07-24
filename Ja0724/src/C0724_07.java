import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 수학 점수를 입력받아 출력하세요
		
		// 배열 선언
		String [] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어", "영어", "수학"}; 
		
		Scanner scan = new Scanner(System.in);
		// 값 입력 - 이름, 국어, 영어, 수학
		
		for (int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요>>", i+1);
			name[i] = scan.next();
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d번째 %s 점수를 입력하세요>>", i+1, title[i]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		
		// 값 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("==================================================");
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t", name[i]);
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.printf("%d\t%.2f\n", total[i], avg[i]);
		}

	}

}
