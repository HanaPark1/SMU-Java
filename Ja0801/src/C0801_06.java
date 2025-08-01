import java.util.ArrayList;

public class C0801_06 {
	public static void main(String[] args) {
//		System.out.println("확인");
		
		// wrapper 클래스 - 8가지 기본타입의 객체타입을 말함
		// 자바 - 객체지향언어
		// boolean, char, byte, short, int, long, float, double - 객체가 아님
		
		ArrayList list = new ArrayList();
		int a = 10;
		list.add(a); // 가능 -> 자동으로 객체형변환 int -> Integer형변환
		System.out.println(list.get(0));
		
		Student s = new Student(1,"홍길동");
		System.out.println(s.getName());
		list.add(s);
		System.out.println(((Student)list.get(1)).getName());
		
//		// 최대값 출력
//		int a = 100;
//		int b = 50;
//		int c = 90;
//		
//		System.out.println(Math.max(a, Math.max(b, c)));
//		System.out.println(Math.min(a, Math.min(b, c)));
		
//		StringBuffer sb = new StringBuffer("abc");
//		System.out.println(sb);
//		
//		sb.append("123");
//		System.out.println(sb);
//		
//		StringBuffer str = new StringBuffer("가");
//		for(int i=0; i<100; i++) {
//			System.out.println(str.append(i));
//		}
		
		// 
//		
//		String a = "a";
//		for(int i=0; i<100; i++) {
//			a = a + i;
//		}
		
//		// subString 부분으로 가져오기
//		String str = "16조 12345";
//		System.out.println(str.substring(3,6));
//		System.out.println(str.substring(0,2));
//		System.out.println(str.substring(3));
//		
//		String[] strArr = {"abc123", "a12", "bc23456"};
//		// 처음부터 제일뒤에서 1칸 앞까지 출력하시오.
//		for(int i=0; i<strArr.length; i++) {
//			System.out.println(strArr[i].substring(0,strArr[i].length()-1));
//		}
	}
}
