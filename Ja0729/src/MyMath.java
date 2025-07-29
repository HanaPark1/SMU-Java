
public class MyMath { // 클래스변수 - static, 클래스내 선언
	static long c;
	long a,b; // 인스턴스변수 = 자동 초기화
	
	long add() { // 인스턴스 메소드  - static 없음
		int d = 0; // 지역변수, 값을 입력해야 함. 자동초기화 안됨.
		return a+b;
	}
	
	static long add(long a, long b) { // 클래스메소드 - static 있음
		return a+b;
	}
}
