import java.util.Arrays;
import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		// 소수점을 입력한 후 2자리에서 반올림 2자리에서 반올림된값 출력구현
		// 1.256 -> 2, 1.3
		
		Scanner scan = new Scanner(System.in);
		double[] number = new double[3];
		
		System.out.println("소수점을 입력하세요>>> ");
		double input = scan.nextDouble();
		System.out.println("자리수를 입력하세요>>>>>");
		// 1.334578 -> 5 1.3345
		int num = scan.nextInt();
		
		// Math.pow() : 제곱메소드 ex) Math.pow(10,4) -> 10000
		// Math.round() : 소수점 첫째자리 반올림
		// 반올림, 올림, 버림
		
		Cal c = new Cal();
		c.powProcess(input, num, number);
		System.out.println("결과: "+Arrays.toString(number));
		
	}

}
