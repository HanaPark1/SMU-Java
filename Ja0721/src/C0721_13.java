
public class C0721_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1000000;
		int b = 2000000;
		
		long c = (long)a * b;
		System.out.println("c: "+c);
		
		int d = 1000000;
		int e = 1000000;
		int f = (int)((long)d * e);
		System.out.println("f: "+f);
		int g  = d / e * e;
		System.out.println("e: "+e);

	}

}
