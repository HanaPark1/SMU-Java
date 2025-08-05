import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class C0805_main {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		int no=0, kor=0, eng=0, math=0, total=0, rank=0;
		double avg =0;
		String name = "";
		
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
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 파일저장");
			System.out.println("-----------------------");
			System.out.println("원하는 번호를 입력하세요>>>>>>>>>>>>>>");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				break;
			case 2:
				for(int i=0; i<list.size(); i++) {
					Student s = list.get(i);
					System.out.printf("%d,%s,%d,%d,%d,%d,%.2f,%d\n",
							s.getNo(), s.getName(), s.getKor(), s.getEng(), 
							s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
				}
				System.out.println();
				break;
			case 3: 
				list.add(new Student("김구",100,100,100));
				
				// 파일 저장 - true: 이어쓰기, false:덮어쓰기
				FileWriter fw = new FileWriter("/Users/hana/downloads/aaa/student.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				for(int i=0; i<list.size(); i++) {
					Student s = list.get(i);
					String st = String.format("%d,%s,%d,%d,%d,%d,%f,%d\r\n", s.getNo(), s.getName(), s.getKor(), 
							s.getEng(), s.getMath(), s.getTotal(), s.getAvg(), s.getRank());
					bw.write(st);
				}
				bw.close();
				fw.close();
				System.out.println("파일 저장 완료");
				System.out.println();
				break;
			}// switch
		}
	}

}
