import java.util.Scanner;

public class C0724_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 변수배열선언 - 번호, 이름, 점수, 합계, 평균, 타이틀, count
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int [10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계", "평균"};
		int count = 0;
		String nameTxt = "";
		int choice;
		
		// 2. 출력구문 - while(true), switch구문
		loop: while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("0. 프로그램종료");
			System.out.println("원하는 번호를 선택해 주세요: ");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				// 3. 입력부분
				System.out.println("[ 학생성적입력 ]");
				no[count] = count+1;
				System.out.printf("%d번째 학생의 이름을 입력해 주세요 (0.취소)>>> ", count+1);
				nameTxt = scan.next();
				
				// 4. 취소부분추가
				if (nameTxt.equals("0")) {
					break;
				} else {
					name[count] = nameTxt;
				}
				
				for (int i=0; i<score[i].length; i++) {
					System.out.printf("%d번째 학생의 %s성적을 입력해 주세요>>> ", count+1, title[i+2]);
					System.out.println();
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count]/3.0;
				System.out.printf("%d번째 학생이 등록되었습니다. \n",count+1);
				count++;
				break;
			case 2:
				// 5. 출력부분
				System.out.println("[ 학생성적출력 ]");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t ", title[i]);
				}
				System.out.println();
				System.out.println("============================================================");
				
				for (int i=0; i<count; i++) {
					System.out.printf("%d\t%s\t",no[i], name[i]);
					for (int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t%.2f\n",total[i], avg[i]);
				}
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				break;
			case 0:
				// 6. 프로그램종료 부분
				System.out.println("[ 프로그램종료 ]");
				break loop;
			}
		}
	}

}
