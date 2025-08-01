import java.util.Arrays;

public class C0801_05 {

	public static void main(String[] args) {
		
		String[] strArr = {"a.txt","b.hwp","c.xls","d.txt","e.png","f.jpg"};
		
		// txt파일은 몇개있는지 출력하시오.
		int count = 0;
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].endsWith("png") || strArr[i].endsWith("jpg") ) {
				count++;
			}
		}
		System.out.println("개수 : "+ count);
		
		
		
//		String str = "aaa.txt";
//		System.out.println(str.endsWith("txt"));
		
		
		//split - 분리자를 통해 배열로 리턴
//		String str = "홍길동,유관순,이순신,강감찬,김구";
//		String[] name2 = str.split(",");
//		System.out.println(Arrays.toString(name2));
//		
//		
//		String str2 = "1,홍길동,100,100,100,300,100.0";
//		// split으로 분리한 다음 student 객체로 선언을 해보세요.
//		// String -> int타입,Str타입,int타입.... double타입으로 변경해서
//		// 객체선언해서 진행함.
//		
//		String[] strArr = str2.split(",");
//		int stuNo = Integer.parseInt(strArr[0]);
//		String name = strArr[1];
//		int kor = Integer.parseInt(strArr[2]);
//		int eng = Integer.parseInt(strArr[3]);
//		int math = Integer.parseInt(strArr[4]);
//		int total = Integer.parseInt(strArr[5]);
//		double avg = Double.parseDouble(strArr[6]);
//		
//		Student s = new Student(stuNo,name,kor,eng,math);
//		
//		System.out.println(s.getStuNo());
//		System.out.println(s.getName());
//		System.out.println(s.getKor());
//		System.out.println(s.getEng());
//		System.out.println(s.getMath());
//		System.out.println(s.getTotal());
//		System.out.println(s.getAvg());
//		
//		
//		
//		String[] title={"번호","이름","국어","영어","수학","합계","평균"};
//		
		//번호  이름  국어  영어  수학  합계  평균
		//----------------------------------
		//
		
		
		
		
//		String str = "    ab       c    ";
//		System.out.println(str);
//		
////		trim - 빈공백제거, 안에 있는 공백은 제거 안됨.
//		System.out.println(str.trim());
//		
//		//replace - 대체
//		System.out.println(str.replace("ab", "x"));
//		
//		//replace - " "을 ""대체, 전체공백제거 하는 형태
//		System.out.println(str.replace(" ", ""));
		
		
		
		
//		String str = "abcabcaaabbbbbbbchijkcaacaaaaaa";
		
		// c가 몇개있는지 출력하시오. indexOf("c",0);
		

	}

}