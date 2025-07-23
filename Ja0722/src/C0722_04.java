
public class C0722_04 {

	public static void main(String[] args) {
		double pi = 3.141592;
		double s_pi = pi * 1000 / 1000;
		System.out.println(pi);
		System.out.println(s_pi);
		
		double p = 123.5468777;
		double s_p = (int)(p*10000.0) / 10000.0;
		System.out.println(s_p);
		
		//round, floor, ceil
		Math.floor(p);
	}

}
