
public class Shape {
	String color = "blue";
	void draw(String sname, Point p) {
		System.out.println(sname + "으로 그립니다.");
		System.out.printf("[ 좌표: %d,%d ]\n",p.x,p.y);
		
	}
	// 오버로딩 - 메소드명같고, 매개변수타입이나개수가 다른것
	void draw(String sname, Point[] p) {
		System.out.println(sname + "으로 그립니다.");
		System.out.printf("[ 좌표: %d,%d ]\n",p[0]);
	}
}
