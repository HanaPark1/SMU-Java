import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	String name;
	int kor,eng,math,total,rank;
	int count = 0;
	double avg;
	Stuscore stu = null;
	
	String[] title = {
			"번호", "이름", "국어", "영어", "수학", "합계", "평균", "등수"
	};
	
	int menu_print() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램 종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		
		return choice;
	}
	
	void insert_stu(ArrayList<Stuscore> list) {
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
	}
	
	void print_stu(ArrayList<Stuscore> list) {
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
	}
}
