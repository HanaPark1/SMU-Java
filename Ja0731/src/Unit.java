
public class Unit {
	int hitPoint;
	final int MAX_UP;
	Unit(){
		MAX_UP = 0;
	}
	
	Unit(int hitPoint) {
		MAX_UP = hitPoint;
		this.hitPoint = hitPoint;
	}
	
	void damage() {
		hitPoint -= 5;
	}
}
