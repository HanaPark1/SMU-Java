import java.util.ArrayList;

public class C0801_07 {

	public static void main(String[] args) {
		// 컬렉션
		// ArrayList -> 컬렉션 (여러 객체를 담음)
		// List 순서가 있고 중복을 허용
		// Set 순서는 없고 중복을허용하지않음
		// Map 키와 값 상으로이르어짐 , 순서 없고 중복 허용
		
		// 커멘드 + t -> 상속 관계
		// sort(desc)
//		ArrayList list = new ArrayList();
//		List list2 = new ArrayList();
		
//		ArrayList list = new ArrayList();
//		list.add(1); // 추가 - Integer 객체
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		list.add(6);
//		list.add(7);
//		
//		//크기 - size()
//		for(int i=0; i<list.size(); i++) {
//			//읽기 get()
//			System.out.println(list.get(i));
//		}
//		
//		// 삭제 - remove()
//		list.remove(3);
//		
//		// clear
//		list.clear();
		 
		// 제너릭 -  특정 객체만 입력가능하도록 제어
		ArrayList<Student> list2 = new ArrayList<Student>();
		Student s = new Student(1,"홍길동",100,100,100);
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person(10000);
		
		
		list.add(p1);
		list.add(new Person(10001 ,"홍길동"));
		list.add(new Person(10007, "유관순"));
		list.add(new Person(10005, "강감찬"));
		list.add(new Person(10006, "김구"));
//		list.add(s); // 가능
		list.add(new Person(10008, "홍길동"));
		list.add(new Person(10002, "유관순"));
		list.add(new Person(10003, "이순신"));
		
		// id를 전체출력하시오.
	
		// 리스트 내 객체 요소에 접근하기 위해서는 형변환 거치기
		for(int i=0; i<list.size(); i++) {
			System.out.println(((Person) list.get(i)).id);
		}
		System.out.println();
		
		// 아이디와 이름 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println("아이디: "+((Person) list.get(i)).id);
			System.out.println("이름: "+((Person) list.get(i)).name);
		}
		System.out.println();
		
		// 10006 삭제
		for(int i=0; i<list.size(); i++) {
			if (((Person)list.get(i)).id == (long)(10006)) {
				System.out.println("삭제: "+((Person) list.get(i)).id);
				list.remove(i);
			}
		}
		System.out.println();
		
		// 아이디와 이름 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println("아이디: "+((Person) list.get(i)).id);
			System.out.println("이름: "+((Person) list.get(i)).name);
		}
		
		

	}

}
