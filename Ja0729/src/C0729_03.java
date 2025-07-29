
public class C0729_03 {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		
		m.add(); // 인스턴스메소드 - 객체선언후 사용
		m.a = 100; // 인스턴스변수 - 객체선언후 사용
		m.b = 50;
		System.out.println(m.add());
		
		// 클래스메소드 - 객체선언없이 사용, 클래스명.메소드명으로 사용
		long result = MyMath.add(100, 50);
		System.out.println(result);
		
		Card c = new Card();

	}

}
