import java.util.Scanner;

public class C0724_09 {

	public static void main(String[] args) {
		int[] no = new int [3];
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int [3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0; // 입력된 학생 수
		String[] title = {"번호", "이름", "국어", "영어", "수학", "합계","평균"};
		String nameTxt = "";
		int choice;
		
	
		loop:while (true) {
			
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("===========================");
			System.out.println("1. 학생성적입력: ");
			System.out.println("2. 학생성적출력: ");
			System.out.println("3. 학생성적수정: ");
			System.out.println("0. 프로그램종료: ");
			System.out.println("===========================");
			System.out.println("원하는 번호를 입력하세요>>>>>");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				// 이름 입력
				System.out.printf("%d번 학생이름을 입력하세요. (0.취소)>>", count+1);
				name[count] = scan.next(); // 이름 입력
				// 취소
				if(name[count].equals("0")) {
					System.out.println("이전화면으로 이동합니다.");
					System.out.println();
					break;
				}
				// 점수 입력
				for (int i=0; i<score.length;i++) {
					System.out.printf("%s 점수를 입력하세요. >>>>>>.", title[i+2]);
					score[count][i] = scan.nextInt();
				}
				no[count] = count+1; //번호 입력
				total[count] = score[count][0] + score[count][1] + score[count][2]; 
				avg[count] = total[count]/3.0;
				System.out.printf("%d번 학생 성적이 저장되었습니다.\n",count+1);
				count++;
				break;
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				for (int i=0; i<count; i++) {
					System.out.printf("%d\t",no[i]);
					System.out.printf("%s\t",name[i]);
					for (int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t%.2f\n",total[i],avg[i]);
				}
				break;
			case 3:
				System.out.println("[ 학생성적수정 ]");
				System.out.println("수정할 학생의 이름을 입력해 주세요 (0.취소)>>> ");
				nameTxt = scan.next();
				int temp = 0;
				for (int i=0; i<count; i++) {
					if(name[i].equals(nameTxt)) {
						System.out.printf("%s 학생을 찾았습니다 \n", name[i]);
						
						System.out.println("[ 점수수정 ]");
						System.out.println("----------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("0. 취소 - 이전화면 이동");
						System.out.println("----------------");
						System.out.println("원하는 번호를 선택해 주세요: ");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1: case 2: case 3:
							total[i] = total[i]-score[i][choice-1];
							System.out.printf("현재 %s 점수: %d\n", title[choice+1], score[i][choice-1]);
							System.out.println("수정할 성적을 입력해 주세요>>> ");
							score[i][choice-1] = scan.nextInt();
							
							total[i] += score[i][choice-1];
							avg[i] = total[i]/3.0;
							
							System.out.printf("%d으로 점수를 변경했습니다.\n", score[i][choice-1]);
							break;
						
						case 0:
							System.out.println("이전으로 이동합니다.");
							break;
						}
						
						temp = 1; //학생이 있을 시
						break;
					}
				}
				if (temp == 0) {
					System.out.printf("%s 학생이 존재하지 않습니다. \n", nameTxt);
				}
				break;
			case 0:
				System.out.println("[ 프로그램종료 ]");
				break loop;
			}
		}
		
		

	}

}
