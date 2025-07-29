import java.util.Scanner;

public class C0729_10 {

	public static void main(String[] args) {
		// 학생성적입력
		//no - 객체선언을 하면
		// 자동으로 번호가 증가되도록 구현
		// 이름, 국어, 영어, 수학
		// 합계, 평균까지 입력되도록 구현
		
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[10];
		int n = 0; // 배열에 사용하는 번호
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1.성적입력");
			System.out.println("원하는 번호를 입력하세여>>>>>>>.");
			
			int choice = scan.nextInt();
			switch(choice)  {
			case 1:
				System.out.printf("%d번째 이름을 입력하세요.\n", n+1);
				// 프로그램 구현
				// 이름 국어 영어 수학 입력받아
				// 매개변수가 있는 생성자를 사용 저장하시오.
				// Stuscore 클래스 -> 초기화 블럭 사용해서 번호 증가
				String name = scan.next();
				System.out.println("국어 성적을 입력하세요");
				int kor = scan.nextInt();
				System.out.println("영어 성적을 입력하세요");
				int eng = scan.nextInt();
				System.out.println("수학 성적을 입력하세요");
				int math = scan.nextInt();
				s[n] = new Stuscore(name,kor,eng,math);
				n++;
				
				for (int i=0; i<n; i++) {
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].no, s[i].name, s[i].kor, 
							s[i].eng, s[i].math, s[i].total, s[i].avg );
				}
				break;
			}
		}
	}

}
