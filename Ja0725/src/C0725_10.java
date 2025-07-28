import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		// 학생성적프로그램 입력 출력 수정 
		
		Scanner scan = new Scanner(System.in);
		
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score =  new int[10][3];
		int[] total = new int[10];
		double[] avg = new double[10];
		int count = 0;
		int choice;
		int temp = 0;
		String nameTxt ="";
		
		while (true) {
			System.out.println(" [ 학생성적프로그램 ] ");
			System.out.println("----------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("원하는 번호를 선택하세요>>>>>>>");
			String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
			choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println(" [ 학생성적입력 ] ");
				System.out.println("----------------------");
				System.out.printf("%d번째 학생의 이름을 입력하세요. ", count+1);
				name[count] = scan.next();
				for (int i=0; i<score[count].length; i++) {
					System.out.printf("%d번째 학생의 %s 성적을 입력하세요. \n", count+1, title[i+2]);
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count] / 3.0;
				no[count] = count+1;
				System.out.printf("%s 학생이 등록되었습니다.", name[count]);
				count += 1;
				
				break;
			case 2: 
				System.out.println(" [ 학생성적출력 ] ");
				System.out.println("----------------------");
				
				for(int i=0; i<title.length; i++) {
					System.out.printf("%s\t", title[i]);
				}
				System.out.println();
				for(int i=0; i<count; i++) {
					System.out.printf("%d\t%s\t", no[i], name[i]);
					for (int j=0; j<score[i].length; j++) {
						System.out.printf("%d\t", score[i][j]);
					}
					System.out.printf("%d\t%.2f\n", total[i], avg[i]);
				}
				break;
			case 3:
				System.out.println(" [ 학생성적수정 ] ");
				System.out.println("----------------------");
				System.out.print("수정할 학생의 이름을 입력하세요. ");
				nameTxt= scan.next();
				temp = 0;
				for (int i=0; i<name.length; i++) {
					if(name[i].equals(nameTxt)) {
						System.out.printf("%s 학생을 찾았습니다. \n", name[i]);
						System.out.println("[ 수정할 과목 ]");
						System.out.println("----------------------");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("원하는 번호를 선택하세요>>>>>>>");
						choice = scan.nextInt();
						switch(choice) {
						case 1: case 2: case 3:
							total[i] = total[i]-score[i][choice-1];
							System.out.printf("현재 %s 점수 %d\n", title[choice+1], score[i][choice-1]);
							System.out.printf("수정할 %s 성적을 입력하세요: ", title[choice+1]);
							score[i][choice-1] = scan.nextInt();
							total[i] += score[i][choice-1];
							avg[i] = total[i]/3.0;
							System.out.printf("%s 학생의 %s 점수가 수정되었습니다.\n", name[i], title[choice+1]);
						}
						temp = 1;
						break;
					}
					if (temp == 0) {
						System.out.println("학생을 찾을 수 없습니다.");
						break;
					}
				}
				break;
			}
		}
		
	}

}
