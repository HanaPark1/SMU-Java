import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 홍길동 100 100 100 300 100.0
		// 유관순 90 90 90 270 90.0
		// 이순신 80 80 80 140 80.0
		
		// 객체에 대한 배열 선언 후 객체 선언
		// 위 세 개의 정보를 입력 후 출력
		
		Stuscore[] s =  new Stuscore[3];
		for (int i=0; i<s.length; i++) {
			s[i] = new Stuscore();
			System.out.println("이름을 입력하세요: ");
			s[i].name = scan.next();
			System.out.println("국어 성적을 입력하세요: ");
			s[i].kor = scan.nextInt();
			System.out.println("영어 성적을 입력하세요: ");
			s[i].eng = scan.nextInt();
			System.out.println("수학 성적을 입력하세요: ");
			s[i].math = scan.nextInt();
			s[i].stuTotal();
			s[i].stuAvg();
		}
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		for(int i=0; i<s.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total, s[i].avg);
		}

	}

}
