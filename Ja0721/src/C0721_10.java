import java.util.*;
public class C0721_10 {

	public static void main(String[] args) {
		// 이름, 국어, 영어, 합계 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요: ");
		String name = scan.nextLine();
		
		System.out.println("국어 점수를 입력하세요: ");
		int kor = scan.nextInt();
		scan.nextLine();
		
		
		System.out.println("영어 점수를 입력하세요: ");
		int eng = scan.nextInt();
		scan.nextLine();
		
		System.out.println("수 점수를 입력하세요: ");
		int math = scan.nextInt();
		scan.nextLine();
		
		int total = kor+eng+math;
		double avg = total/3;
		
		System.out.println("이름 | 국어 | 영어 | 수학 | 합계 | 평균 ");
		System.out.println(name+" | "+kor+" | "+eng+" | "+math + " | "+total+" | "+avg);
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\t");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n");
	
		
	}

}
