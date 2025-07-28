import java.util.Scanner;

public class C0725_09 {

	public static void main(String[] args) {
		String[] num = new String[45];
		String[][] arr = new String[9][5];
		String[][] arr2 = new String[9][5];
		
		for (int i=0; i<num.length; i++) {
			num[i] = i+1+"";
		}
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		System.out.println("순차번호");
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%s\t",arr[i][j]);
			}
			System.out.println();
		}
		
		String temp;
		for (int i=0; i<300; i++) {
			int rnum = (int)(Math.random()*45);
			temp = num[0];
			num[0] = num[rnum]+"";
			num[rnum] = temp;
		}
		
		for (int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = num[5*i+j];
			}
		}
		
		System.out.println("랜덤번호");
		for (int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%s\t",arr2[i][j]);
			}
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);
		
		loop: while(true) {
			System.out.println("랜덤번호");
			for (int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					System.out.printf("%s\t",arr2[i][j]);
				}
				System.out.println();
			}
			
			System.out.println("번호를 입력하세요>>>> ");
			String choice = scan.next();
			
			if (choice == "0") {
				break loop;
			}
			
			for (int i=0; i<arr2.length; i++) {
				for(int j=0; j<arr2[i].length; j++) {
					if(arr2[i][j].equals(choice)) {
						arr2[i][j] = "X";
					}
				}
				System.out.println();
			}
			
		}
		
		
		
		

	}

}
