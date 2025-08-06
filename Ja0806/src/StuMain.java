import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) throws Exception {
		// 파일 읽어오기 - aaa/student.txt 읽어오기
		// 2 학생성적출력, 6 이름정렬, 5 등수처리, 9 파일저장 1 입력, 3 수정 
		
		Scanner scan = new Scanner(System.in);
		StuDeck studeck = new StuDeck();
		int choice = 0;
		
		// 파일 읽어오기
		studeck.stu_fileRead();
		
		loop: while(true) {
			choice = studeck.stu_menu();
			switch(choice) {
			// 학생 성적 입력
			case 1:
				studeck.stu_input();
				break;
			// 학생 성적 출력
			case 2:
				studeck.stu_output();
				break;
			// 학생 성적 수정
			case 3:
				studeck.stu_update();
				break;
			// 학생 성적 삭제
			case 4:
				studeck.stu_delete();
				break;
			// 학생 이름 정렬
			case 5:
				studeck.sort_name();
				break;
			// 학생 합계 정렬
			case 6:
				studeck.sort_total();
				break;
			// 학생 번호 정렬
			case 7:
				studeck.sort_no();
				break;
			// 학생 등수 처리
			case 8:
				studeck.stu_rank();
				break;
			// 파일 저장
			case 9:
				studeck.stu_fileWrite();
				break;
			// 프로그램종료
			case 0:
				System.out.println(" [ 프로그램종료 ] ");
				break loop;
			} // switch
		} // while
		
	}// main

} // class
