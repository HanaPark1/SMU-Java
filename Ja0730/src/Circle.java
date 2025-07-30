
public class Circle extends Shape {
	String sname = "Circle";
	// 원형그리기 - 원점,반지름
	Point center;
	int r;
	
	// 기본생성자
	Circle() {
		this(new Point(0,0),100);
	}
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}
