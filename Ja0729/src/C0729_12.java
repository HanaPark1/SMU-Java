
public class C0729_12 {

	public static void main(String[] args) {
		// 배열 선언
		Pro[] p = new Pro[10];
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Pro("스마트폰");
		}
		
		for(int i=0; i<p.length; i++) {
			System.out.printf("%d\t%s\n",p[i].serialNo, p[i].productName);
		}
		

	}

}
