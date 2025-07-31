import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	private String name;
	private int no, kor, eng, math, total;
	private double avg;
	
	private Stuscore s;
	
	private String[] title = {
			"번호", "이름","국어","영어","수학","합계","평균","랭크"
		};
	
	int menu_print() {
		System.out.println(" [ 학생 성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("0. 프로그램종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세여>>>>>>>>>>>>>>");
		int choice = scan.nextInt();
		return choice;
	}
	
	void stu_input(ArrayList list) {
		// 성적입력 - 이름,국어,영어,수학 -> 번호,합계,평균
		System.out.printf("%d번째 학생이름을 입력하세요. ",list.size()+1);
		name = scan.next();
		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();
		
		list.add(new Stuscore(name,kor,eng,math)); // 컬렉션 저장
	}
	
	void stu_ouput(ArrayList list) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("----------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			s = (Stuscore)list.get(i); // 오브젝트 >스튜스코어로 형변환
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
					s.getNo(),s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
	}
}
