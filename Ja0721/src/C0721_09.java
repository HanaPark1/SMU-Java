import java.util.*;
public class C0721_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 숫자를 입력받아 더한 값을 출력하시오
		// 100 + 5  = 105
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요 ");
		String str1 = scan.nextLine();
		System.out.println("숫자 2를 입력하세요 ");
		String str2 = scan.nextLine();
		
		int a = Integer.parseInt(str1);
		int b= Integer.parseInt(str2);
		System.out.println("a+b: "+ (a+b));
		
	}

}
