import java.util.Scanner;

public class C0724_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		
		// 1-25까지 숫자 입력, 랜덤으로 번호 섞어서 arr배열에 입력해서 출력하시오.
		// num배열 = int, arr배열 - String
		
		for (int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
		
		int temp = 0;
		for (int i=0; i<100; i++) {
			int rnum = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j] + "";
			}
		}
		
		while(true) {
			System.out.println("----------------------------------");
			for (int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf("%s\t",arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("----------------------------------");
			System.out.println("원하는 번호를 입력하세요 (0: 취소): ");
			String input = scan.next();
			
			if (input.equals("0")) {
				System.out.println("종료");
				break;
			}
			
			// 입력된 번호에 해당하는 위치 X
			for (int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					if (input.equals(arr[i][j])) {
						arr[i][j] = "X";
					}
				}
			}
		}
		
		

	}

}
