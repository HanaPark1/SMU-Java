import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C0804_05 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("aaa", "1111"); //add추가 - put추가명령어
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		
		Iterator iterator = map.entrySet().iterator();
		
		//key입력하면, value리턴
		System.out.println(map.get("aaa"));
		
		//키 있는지 확인
		if(map.containsKey("bbb")) {
			System.out.println("있습니다.");
		}else {
			System.out.println("없습니다.");
		}
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}