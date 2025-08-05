import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Studeck {
	Scanner scan = new Scanner(System.in);
	private int choice = 0, no=0, kor=0, eng=0, math=0, total=0, rank=0; 
	private double avg = 0;
	private String name;
	Student s;
	String[] title = {"번호","이름","국어","수학","영어","합계","평균","등수"};
	int[] score = new int[3];
	
	// 파일읽어오기 메소드
	public void stu_FileRead(ArrayList<Student> list) throws Exception {
		// 저장된 파일 읽기 - 4명의학생성적을 객체에 담아서 출력
		FileReader fr = new FileReader("/Users/hana/downloads/aaa/student.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			String[] str = line.split(",");
			no = Integer.parseInt(str[0]);
			name = str[1];
			kor = Integer.parseInt(str[2]);
			eng = Integer.parseInt(str[3]);
			math = Integer.parseInt(str[4]);
			total = Integer.parseInt(str[5]);
			avg = Double.parseDouble(str[6]);
			list.add(new Student(no,name,kor,eng,math,total,avg));
		}
		br.close();
		fr.close();
		System.out.println("파일 읽어오기 성공");
		System.out.println();
	} //stuFileRead
	
	//상단메뉴 출력메소드
	int stu_menuPrint() {
		System.out.println(" [ 학생 성적 프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 등수처리");
		System.out.println("6. 이름정렬");
		System.out.println("7. 파일저장");
		System.out.println("0. 프로그램종료");
		System.out.println("-------------------");
		System.out.println("원하는 번호를 입력하세여>>>>>>>>>>>>>>");
		choice = scan.nextInt();
		return choice;
	}//stu_menuPrint
	
	void stu_input(ArrayList<Student> list) {
		System.out.println();
		System.out.println(" [ 학생 성적 입력 ]");
		System.out.printf("%d번째 학생 이름을 입력하세요.(0: 이전페이지이동)>>>>>",Student.getCount()+1);
		name = scan.next();
		if(name.equals("0")) return;
		for(int i=0; i<3; i++) {
			System.out.printf("%s 성적을 입력하세요.>>>>>>>>",title[i+2]);
			score[i] = scan.nextInt();
		}
		list.add(new Student(name, score[0], score[1], score[2]));
		System.out.printf("%s 학생 성적이 저장되었습니다.\n", name);
		System.out.println();
	}// stu_input
	
	void stu_output(ArrayList<Student> list) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n", title[0],title[1],title[2],title[3],title[4],title[5],title[6],title[7]);
		System.out.println("----------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			s = (Student)list.get(i); // 오브젝트 >스튜스코어로 형변환
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
					s.getNo(),s.getName(), s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
		}
		System.out.println();
	}//stu_ouput
	
	// 파일 저장
	void stu_FileWrite(ArrayList<Student> list) throws Exception {
		FileWriter fw = new FileWriter("/Users/hana/downloads/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			String st = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
					s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());
			bw.write(st);
		}
		bw.close();
		fw.close();
		System.out.println("파일 저장하기 성공");
	}//stu_FileWrite

}
