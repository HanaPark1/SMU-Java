
public class Cal {
	int result; // 인스턴스 변수 - 객체선언 후 사용, 객체 개별 사용, 참조변수명.변수명
	int add(int a, int b) {
		result = a+b;
		return result;
	}
	
	int minus(int a, int b) {
		result = a-b;
		return result;
	}
	
	int multi(int a, int b) {
		result = a*b;
		return result;
	}
	
	int divide(int a, int b) {
		int result = a/b;
		return result;
	}
	
	void calProcess(int a, int b, double[] num) {
		num[0] = add(a,b);
		num[1] = minus(a,b);
		num[2] = multi(a,b);
		num[3] = divide(a,b);
	}
	
	
}
