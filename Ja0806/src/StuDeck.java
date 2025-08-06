import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in); // 스캐너
	ArrayList<Student> students = new ArrayList<Student>(); // 배열리스트 선언
	int no=0, kor=0, eng=0, math=0, total=0, rank=0; // 번호, 국어, 영어, 수학, 합계, 등수
	double avg = 0; // 평균
	String name =""; // 이름
	String[] title = {"번호","이름","국어","영어","수학","합계","평균","등수"}; // 타이틀
	Student stu; // stu 객체 선언
	int choice = 0;
	
	// 파일 읽어오기
	public void stu_fileRead() throws Exception {
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
			rank = Integer.parseInt(str[7]);
		
			students.add(new Student(no, name, kor, eng, math, total, avg, rank));
		}
		br.close();
		fr.close();
		System.out.println("파일 읽어오기 완료"); 
		System.out.println();
	} // 파일읽기완료
	
	public int stu_menu() {
		System.out.println(" [ 학생성적프로그램 ] ");
		System.out.println(" ------------------------ ");
		System.out.println(" 1. 학생성적입력 ");
		System.out.println(" 2. 학생성적출력 ");
		System.out.println(" 3. 학생성적수정 ");
		System.out.println(" 4. 학생성적삭제 ");
		System.out.println(" 5. 학생이름정렬 ");
		System.out.println(" 6. 학생합계정렬 ");
		System.out.println(" 7. 학생번호정렬 ");
		System.out.println(" 8. 학생등수처리 ");
		System.out.println(" 9. 성적파일저장 ");
		System.out.println(" 0. 프로그램종료 ");
		System.out.println(" 원하는 번호를 입력하세요.>>>>>>>>>>> ");
		choice = scan.nextInt();
		return choice;
	}
	
	// 학생성적출력
	public void stu_output() {
		System.out.println(" [ 학생성적출력 ] ");
		for(int i=0; i<title.length; i++) {
			System.out.printf("%s\t", title[i]);			
		}
		System.out.println();
		System.out.println(" ------------------------------------------------------------- ");
		
		for(int i=0; i<students.size(); i++) {
			stu = students.get(i);
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", 
					stu.getNo(),stu.getName(),stu.getKor(),stu.getEng(),
					stu.getMath(),stu.getTotal(),stu.getAvg(),stu.getRank());
		}
		System.out.println();
	} // 학생성적출력완료
	
	// 학생이름정렬
	public void sort_name() {
		System.out.println("[ 학생이름정렬 ]");
		System.out.println("1. 이름순차정렬");
		System.out.println("2. 이름역순정렬");
		System.out.println("0. 정렬취소");
		int choice = scan.nextInt();
		switch(choice) {
			case 1 :
				System.out.println("[ 이름순차정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				break;
			case 2:
				System.out.println("[ 이름역순정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getName().compareTo(o1.getName());
					}
				});
				break;
			case 0:
				System.out.println("[ 정렬취소 ]");
				break;
		} // switch
		stu_output();
	} // 학생이름정렬완료
	
	public void sort_total() {
		System.out.println("[ 학생합계정렬 ]");
		System.out.println("1. 합계순차정렬");
		System.out.println("2. 합계역순정렬");
		System.out.println("0. 정렬취소");
		int choice = scan.nextInt();
		switch(choice) {
			case 1 :
				System.out.println("[ 합계순차정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.getTotal() - o2.getTotal();
					}
				});
				break;
			case 2:
				System.out.println("[ 합계역순정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return  o2.getTotal() - o1.getTotal();
					}
				});
				break;
			case 0:
				System.out.println("[ 정렬취소 ]");
				break;
		} // switch
		stu_output();
	} // 학생이름정렬완료
	
	public void sort_no() {
		System.out.println("[ 학생번호정렬 ]");
		System.out.println("1. 번호순차정렬");
		System.out.println("2. 번호역순정렬");
		System.out.println("0. 정렬취소");
		int choice = scan.nextInt();
		switch(choice) {
			case 1 :
				System.out.println("[ 번호순차정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						 return o1.getNo() - o2.getNo();
					}
				});
				break;
			case 2:
				System.out.println("[ 번호역순정렬 ]");
				students.sort(new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o2.getNo() - o1.getNo();
					}
				});
				break;
			case 0:
				System.out.println("[ 정렬취소 ]");
				break;
		} // switch
		stu_output();
	} // 학생이름정렬완료
	
	// 학생등수처리
	public void stu_rank() {
		System.out.println("[ 학생등수처리 ]");
		for (int i=0; i<students.size(); i++) {
			int count = 1;
			stu = students.get(i);
			for(int j=0; j<students.size(); j++) {
				if(stu.getTotal()<students.get(j).getTotal()) {
					count++;
				}
			}
			stu.setRank(count);
		}
		stu_output();
	}  //학생등수처리완료
	
	public void stu_fileWrite() throws Exception {
		FileWriter fw = new FileWriter("/Users/hana/downloads/aaa/student.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i=0; i<students.size(); i++) {
			stu = students.get(i);
			String str = String.format("%d,%s,%d,%d,%d,%d,%.2f,%d\n", 
					stu.getNo(),stu.getName(), stu.getKor(), stu.getEng(), 
					stu.getMath(), stu.getTotal(), stu.getAvg(), stu.getRank());
			bw.write(str);
		}
		bw.close();
		fw.close();
	} // 파일저장완료
	
	// 학생 성적 입력
	public void stu_input() {
		System.out.println("[ 학생성적입력 ]");
		System.out.printf("%d번째 학생을 입력하세요: ",Student.getCount()+1);
		name = scan.next();
		int[] score = new int[3];
		for(int i=0; i<score.length; i++) {
			System.out.printf("%s 성적을 입력하세요: ",title[i+2]);
			score[i] = scan.nextInt();
		}
		students.add(new Student(name, score[0], score[1], score[2])); 
	}// 학생성적입력완료
	
	public void stu_update() {
		// 학생성적수정
		System.out.println("[ 학생성적수정 ]");
		System.out.println("수정할 학생을 입력하세요: ");
		name = scan.next();
		int temp = 0;
		for(int i=0; i<students.size(); i++) {
			stu = students.get(i);
			if(stu.getName().equals(name)) {
				temp = 1;
				System.out.printf("%s 학생을 찾았습니다. \n", stu.getName());
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.println("수정할 과목을 입력해 주세요: ");
				choice = scan.nextInt();
				switch(choice) {
					case 1: case 2: case 3:
						System.out.printf("수정할 %s 성적: \n", title[choice+1]);
						if(choice == 1) {
							stu.setKor(scan.nextInt());
							break;
						} else if (choice == 2) {
							stu.setEng(scan.nextInt());
							break;
						} else {
							stu.setMath(scan.nextInt());
							break;
						}
					}
				stu.setTotal(stu.getKor()+stu.getEng()+stu.getMath());
				stu.setAvg(stu.getTotal() / 3.0);
				System.out.printf(" %s 성적을 수정하였습니다. \n", title[choice+1]);
				break;
			}
		}// for
		if (temp == 0) {
			System.out.println("검색한 학생을 찾을 수 없습니다.");
		}
	}

	public void stu_delete() {
		System.out.println("[ 학생성적삭제 ]");
		System.out.println("삭제할 학생을 입력하세요: ");
		name = scan.next();
		int temp = 0;
		for(int i=0; i<students.size(); i++) {
			stu = students.get(i);
			if(stu.getName().equals(name)) {
				temp = 1;
				no = i;
				System.out.printf("%s 학생을 찾았습니다. 삭제하시겠습니까? (1.예 2.아니오)\n", stu.getName());
				choice = scan.nextInt();
			}
		}// for
		if (temp == 1) {
			switch (choice) {
			case 1:
				students.remove(no);
				System.out.printf("%s 학생 성적을 삭제하였습니다.\n", name);
				break;
			case 2:
				System.out.println("성적 삭제를 취소하였습니다.\n");
				break;
			}
		} else{
			System.out.println("검색한 학생을 찾을 수 없습니다.\n");
		}
		
	}
}
