
public abstract class Player {
	int num;
	int pos;
	
	// 미완성 메소드가 1개라도 있으면
	// class 앞에 abstract 무조건 붙여야 함
	abstract void play(int pos);
	abstract void stop(int pos);
	abstract void jump(int pos);
	abstract void goAndStop(int pos);
	
}
