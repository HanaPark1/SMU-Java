
public class Person {
	long id;
	String name;
	String address;
	
	Person(){}
	
	Person(long id){
		this.id = id;
	}
	
	Person(long id, String name){
		this.id = id;
		this.name = name;
	}
	
	Person(long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 두 객체의 아이디를 비교해서 같은지 확인
		boolean temp = false;
		if (this.id == ((Person)obj).id && this.name.equals(((Person)obj).name)) {
			temp = true;
			
		}
		return temp;
	}
	
	@Override // 상속에서 메소드를 재정의
	public String toString() {
		getClass().getName();
		return ""+id+","+getClass();
	}
	
	
}
