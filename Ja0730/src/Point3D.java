
public class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(); // super(); -> Point(); 조상의 기본생성자를 자동입력되어 호출,
		//super(x,y); // 기본생성자가 없을 경우 설정을 헤 줘야 함
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return String.format("x: %d, y: %d, z: %d \n",x,y,z);
	}
}
