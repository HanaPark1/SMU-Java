
public class Cal {
	int add(int a, int b){
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	double divide(int a, int b) {
		return a/b;
	}
	
	void powProcess(double input, int n, double[] number) {
		
		// 반올림
		number[0] = Math.round(input * Math.pow(10, n-1))/Math.pow(10, n-1);
		
		// 올림
		number[1] = Math.ceil(input * Math.pow(10, n-1))/Math.pow(10, n-1);
		
		// 버림
		number[2] = Math.floor(input * Math.pow(10, n-1))/Math.pow(10, n-1);

	}
	
	

}
