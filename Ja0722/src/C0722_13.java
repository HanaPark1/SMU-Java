import java.util.Scanner;

public class C0722_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 가위-1, 바위-2, 보-3
		// 1-3, 2-1, 3-2 - 승리
		// 1-1, 2-2, 3-3 - 무승부
		// 1-2, 2-3, 3-1 - 패배
		System.out.println("[ 가위바위보 게임 ]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		
		int choice = scan.nextInt();
		int rnum = (int)(Math.random()*3)+1;
		String my = "";
		String you =  "";
		
		switch (choice-rnum) {
		case 0:
			System.out.println("무승");
			break;
		case -2: case 1 :
			System.out.println("승");
			break;
		case 2: case -1:
			System.out.println("패");
			break;
		}
		
		switch (choice) {
		case 1:
			my = "가위";
			break;
		case 2:
			my = "바위";
			break;
		case 3:
			my = "보";
			break;
		}
		
		switch (rnum) {
		case 1:
			you = "가위";
			break;
		case 2:
			you = "바위";
			break;
		case 3:
			you = "보";
			break;
		}
		
		
		System.out.println("나: "+my);
		System.out.println("상대: "+you);
	}

}
