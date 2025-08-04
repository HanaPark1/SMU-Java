import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class C0804_01 {

	public static void main(String[] args) {
		// 순서X, 중복X
		HashSet set = new HashSet();
		set.add(7);
		set.add(6);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(4);
		set.add(4);
		set.add(5);
		
		//set 순서가 없어서 무조건 Iterator 사용해야 함.
		Iterator list = set.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
		
		
		
//		ArrayList list = new ArrayList(); //컬렉션
//		for(int i=0;i<10;i++) {
//			list.add(i+1); //1,2,3....10
//		}
//		list.add(100);
//		list.add(1);
//		list.add(5);
//		list.add(2);
//		
//		//컬렉션 출력은 Iterator사용해야 함.
//		Iterator list2 = list.iterator(); 
//		while(list2.hasNext()) {
//			System.out.println(list2.next());
//		}
		
		// 출력
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		
		
		
		// 인터페이스 - 미완성클래스보다 더 추상이다.
		// 추상클래스 - 완성된것도 있고, 완성안된것도 있는것을 추상클래스
		// 인터페이스 객체선언(X)
//		List list2 = new ArrayList(); //다형성 
//		int[] list3 = new int[10];
//		list3[0] = 1;
//		list3[1] = 2;
//		list3[2] = 3;
//		list3[3] = 4;
	}

}