import java.util.Scanner;

public class C0722_02 {

	// 메소드 함수 = main() 함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받으려면
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어 점수 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("수학 점수 입력하세요.");
		int math = scan.nextInt();
		System.out.println("영어 점수 입력하세요.");
		int eng = scan.nextInt();
		
		int total = kor+math+eng;
		double avg = total/3.0;
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("수학: "+math);
		System.out.println("영어: "+eng);
		System.out.println("합계: "+total);
		System.out.printf("평균: %.3f \n",avg);
		System.out.printf("%s, %d, %d, %d, %d, $.2f \n",name,kor,math,eng,total,avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t$.2f \n",name,kor,math,eng,total,avg);
		
	}

}
