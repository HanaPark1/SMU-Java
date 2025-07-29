import java.util.Scanner;

public class C0729_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Product[] p = new Product[10];
		int no = 0;
		
		while(true) {
			System.out.println("[ 스마트폰 생산 ]");
			System.out.println("1. 수동생산");
			System.out.println("2. 자동생산");
			System.out.println("원하는 번호를 입력하세요>>>>>>>>>>>>");
			int choice = scan.nextInt();
		
			switch(choice) {
			case 1:
				// 객체 선언
				p[no] = new Product();
				p[no].serialNo = no+1;
				p[no].pName = "스마트폰";
				no++;
				System.out.println("생산이 완료되었습니다.");
				//System.out.println("생산정보: %d,%s\n", p[no].serialNo, p[no].pName);
				break;
			case 2:
				p[no] = new Product("스마트폰");

				break;
			}
			
			
		}

	}

}
