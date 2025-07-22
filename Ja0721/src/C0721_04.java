
public class C0721_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean power = true;
		char ch = 'A';
		char ch2 = '\u0041'; // u:16진수를 의미, 16*4+1*1 = 65
		char ch3 = 55;
		char tab = '\t';
		char enter = '\n';
		System.out.println("power: "+ power);
		System.out.println("ch: "+ ch);
		System.out.println("ch2: "+ ch2);
		System.out.println("ch3: "+ ch3);
		System.out.println("aaa"+tab+"bbb");
		System.out.println("aaa"+enter+"bbb");
		
		
		byte b = 127;
		System.out.println("byte: "+b);
		
		int hex = 0x100; // 16진수 16*16*1
		System.out.println("hex: " +hex);
		
		int oct = 0100; // 8진수 의미 64*1*1
		System.out.println("oct: " + oct);
		
		long l = 100000000000L;
		float f = 3.14F;
		double d = 3.14;
		double d2 = 3.14D;
		double d3 = 3.14d;
		
		double d4 = 100;
		System.out.println("d4: "+d4);

	}

}
