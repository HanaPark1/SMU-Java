import java.util.ArrayList;

public class Stumain {

	public static void main(String[] args) throws Exception  {
		ArrayList<Student> list = new ArrayList<Student>();
		int choice;
		int count = 0, no=0, kor=0, eng=0, math=0, total=0, rank=0; 
		double avg = 0;
		String name;
		String[] title = {"번호","이름","국어","수학","영어","합계","평균","등수"};
		int[] score = new int[3];
		
		Studeck studeck = new Studeck();
		// 파일읽어오기 메소드
		studeck.stu_FileRead(list);
		
		loop:while(true) {
			// 상단메뉴출력메소드
			choice = studeck.stu_menuPrint();
			switch(choice) { 
			// 성적 입력
			case 1: 
				studeck.stu_input(list);
				break;
			// 성적 출력
			case 2:
				studeck.stu_output(list);
				break;
			// 성적수정
			case 3:
				break;
			// 성적삭제
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			// 파일저장
			case 7:
				studeck.stu_FileWrite(list);
				break;
			case 0:
				System.out.println("------- 프로그램을 종료합니다. ------");
				break loop;
			}
		}
	}

}
