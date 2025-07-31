import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck studect = new StuDeck();
		ArrayList list = new ArrayList();
		String name;
		int kor,eng,math,total,rank;
		int count = 0;
		double avg;
		
		Stuscore stu = null;
		
		String[] title = {
				"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"
		};
		
		while(true) {
			int choice = studect.menu_print();
			
			switch(choice) {
			case 1:
				System.out.println("[ 학생성적입력 ]");
				System.out.printf("%d번째 학생의 이름을 입력하세요>>>>>.\n",count+1);
				name = scan.next();
				System.out.println("국어 성적을 입력하세요>>>>>.");
				kor = scan.nextInt();
				System.out.println("영어 성적을 입력하세요>>>>>.");
				eng= scan.nextInt();
				System.out.println("수학 성적을 입력하세요>>>>>.");
				math = scan.nextInt();
				
				list.add(new  Stuscore(name,kor,eng,math));
				count++;
				
				System.out.printf("%s 학생 성적을 등록하였습니다.\n", name);
				System.out.println();
					
				break;
				
			case 2:
				System.out.println("[ 학생성적출력 ]");
				System.out.println("-----------------------------------------------------------");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
						title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
				for(int i=0; i<list.size(); i++) {
					stu = (Stuscore) list.get(i);
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							stu.getNo(),stu.getName(), stu.getKor(), stu.getEng(), stu.getMath(), stu.getTotal(), stu.getAvg(), stu.getRank());
				}
				System.out.println();
				break;
			}
		}
		

	}

}
