
public class C0801_03 {
	public static void main(String[] args) {
		// java.lang패키지 중에 Object클래스 
		
		//getClass() - 자신이 속한 클래스 정보 반환
		Student s = new Student();
		System.out.println(s.getClass().getName());
		
//		Person p1 = new Person();
//		System.out.println(p1);
//		System.out.println();
		
		
		//toString() - 객체를 출력할때 원하는 형태로 출력하는 메소드
		//
		
//		Student s1 = new Student(1,"홍길동");
//		System.out.println(s1);
//		Student s2 = new Student(s1); //깊은복사
//		
//		Student s3 = null;
//		s3 = s1; //주소값만 복사 s1,s3 같은 공간을 바라봄. - 얕은복사
		
		
		// hashcode() - 데이터수정이 되었는지 확인, 암호화 설정할때
//		String str1 = "1111";
//		String str2 = "abcd";
//		String str1 = new String("도널드 트럼프 미국 대통령이 당초 1일(현지시간)로 예정됐던 새 관세 발효 시점을 오는 7일로 연기했다.\r\n"
//				+ " \r\n"
//				+ "31일 AP통신 등에 따르면 트럼프 대통령은 새 관세를 8월 7일 0시 1분부터 발효하도록 하는 행정명령에 서명했다.\r\n"
//				+ " \r\n"
//				+ "이번 조치는 한국, 일본을 포함해 총 68개국과 유럽연합(EU) 27개 회원국에 적용된다.\r\n"
//				+ " \r\n"
//				+ "백악관 고위 관계자는 AP통신에 \"국가별 세부 관세율 조정에 시간이 필요해 당초 예정됐던 1일보다 늦은 7일부터 관세를 적용하게 됐다\"고 밝혔다.");
//		String str2 = new String("도널드 트럼프 미국 대통령이 당초 1일(현지시간)로 예정됐던 새 관세 발효 시점을 오는 7일로 연기했다.\r\n"
//				+ " \r\n"
//				+ "31일 AP통신 등에 따르면 트럼프 대통령은 새 관세를 8월 7일 0시 1분부터 발효하도록 하는 행정명령에 서명했다.\r\n"
//				+ " \r\n"
//				+ "이번 조치는 한국, 중국을 포함해 총 68개국과 유럽연합(EU) 27개 회원국에 적용된다.\r\n"
//				+ " \r\n"
//				+ "백악관 고위 관계자는 AP통신에 \"국가별 세부 관세율 조정에 시간이 필요해 당초 예정됐던 1일보다 늦은 7일부터 관세를 적용하게 됐다\"고 밝혔다.");
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
		
		
//		String str1 = new String("abc");
//		String str2 = new String("ab1c");
//		String str2 = new String("aaaaaaaaabbbbbbbbbcccccccc");
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
		
		
		
		
		//equal() 메소드
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		if(str1.equals(str2)) {
//			System.out.println("같다");
//		}
		
		
//		Student s1 = new Student(1,"홍길동");
//		Student s2 = new Student(1,"홍길동");
//		if(s1.equals(s2)) { //다르다
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
//		if(s1 == s2) {  //다르다
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		Person p1 = new Person();
//		p1.id = 199901011101111L;
//		p1.name = "홍길동";
//		p1.address = "서울";
//		Person p2 = new Person(199901011101111L,"홍길동","서울");
//		if(p1.equals(p2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		System.out.println("p1 : "+p1);
//		System.out.println("p2 : "+p2);
//		
		
		
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		
//		if(str1==str2) { //객체변수,참조변수는 등가비교가 안됨.
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		if(str1.equals(str2)) { // Object 클래스 상속받아 사용
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		
//		int a1 = 100;
//		int a2 = 100;
//		if(a1==a2) { //기본타입 : boolean,char,byte,short,int,long,float,double
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}

	}

}