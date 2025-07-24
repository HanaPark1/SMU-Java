import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
//		int[][] score = new int[5][3];
//		for (int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				score[i][j] = 3*i+j;
//			}
//		}
//		for (int i=0; i<score.length; i++) {
//			for(int j=0; j<score[i].length; j++) {
//				System.out.println(score[i][j]);
//			}
//		}
//		
//		int[][] score2 = new int[5][5];
//		for (int i=0; i<score2.length; i++) {
//			for(int j=0; j<score2[i].length; j++) {
//				score2[i][j] = 5*i+j+1;
//			}
//		}
//		for (int i=0; i<score2.length; i++) {
//			for(int j=0; j<score2[i].length; j++) {
//				System.out.println(score2[i][j]);
//			}
//		}
		
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double [] avg = new double[3];
		String[] title = {"국어", "영어", "수학"};
		
		System.out.println();
		
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요>> ",i+1);
			name[i] = scan.next();
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d번째 %s점수를 입력하세요>> ", i+1, title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		
		//출력
		//이름 국어 영어 수학
		
		System.out.println("이름\t국어\t영어\t수학\t");
		System.out.println("=====================");
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t", name[i]);
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
			}
			System.out.printf("%d\t%.2f\n",total[i],avg[i] );
		}
	}

}
