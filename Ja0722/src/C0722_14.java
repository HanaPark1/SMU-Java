import java.util.Scanner;

public class C0722_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요: ");
		int input = scan.nextInt();
		// 12,1,2 겨울 3,4,5 봄 6,7,8, 여름 9,10,11 가을
		
		if (input >= 9 && input <12) {
			System.out.println("가을");
		} else if (input >=3 && input <6) {
			System.out.println("봄");
		} else if (input >= 6 && input <9) {
			System.out.println("여름");
		}else {
			System.out.println("겨울");
		}
		
		switch (input) {
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		}
		

	}

}
