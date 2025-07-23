import java.util.Scanner;

public class C0723_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double [] avg = new double[2];

		for (int i=0; i<name.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요:\n",i+1);
			name[i] = scan.next();
			System.out.println();
			System.out.printf("%s의 국어 점수 입력하세요:\n",name[i]);
			kor[i] = scan.nextInt();
			System.out.printf("%s의 영어 점수 입력하세요:\n",name[i]);
			eng[i] = scan.nextInt();
			System.out.printf("%s의 수학 점수 입력하세요:\n",name[i]);
			math[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.println("=============================");
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], kor[i], eng[i], math[i], total[i], avg[i]);
		}
	}

}
