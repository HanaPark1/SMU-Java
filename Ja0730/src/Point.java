
public class Point {
	int x; // 인스턴스변수 = 객체선언후, 개별, 참조변수명.변수명
	int y;
	
	Point() {
		this(0,0); // this() : 다른생성자
	}
	
	Point(int x, int y) {
		super();
		this.x = x; // this : 인스턴스변수
		this.y = y;
	}
	
	void add() {
		System.out.println(x+y);
	}
		
}
