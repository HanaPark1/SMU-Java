import java.util.Scanner;

public class C0721_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// next(), nextLine(): 문자열 
		System.out.println("숫자를 입력하세요");
		double num = scan.nextDouble();
		scan.nextLine();
		System.out.println("입력한 숫자: "+num);
		System.out.println("이름을 입력하세요. ");
		String str = scan.nextLine();
		System.out.println("이름: "+str);
		
		int num2 = Integer.parseInt(str);
		System.out.println("숫자 더하기: "+(num+num2));
		
		
	}

}
