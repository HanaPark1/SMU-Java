
public class C0728_12 {

	public static void main(String[] args) {
		//객체선언
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x: "+d.x);
		
		// 클래스변수 - 객체선언없이 사용, 공용사용, 클래스명.변수명
		// 클래스메소드 - 객체선언없이 사용 공용사용, 클래스명.메소드명
		
		C0728_12.change(d.x);
		
		System.out.println("change 메소드 호출후 d.x: "+d.x);
		
		
		

	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("x: "+x);
		
	}

}

class Data {
	int x; // 인스턴스변수 - 객체선언 후 사용, 객체 개별사용, 참조변수명.변수
}
