public class Scv extends GroundUnit implements Repairable {

	Scv(){
		super(60);
	}
	
	void repair(Repairable r) { // Repairable - 아무것도 없음
		Unit u = (Unit)r;
		while(u.hitPoint !=u.MAX_UP) {
			//지연시간
			u.hitPoint++;
		}
	}
}