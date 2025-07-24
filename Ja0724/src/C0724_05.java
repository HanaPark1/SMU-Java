import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		Integer[] input2 = {1,2,3,4,5}; // 객체 타입
		for (int i=0; i<6; i++) {
			System.out.printf("%d번째 입력: \n", i+1);
			input[i] = scan.nextInt();
		}
		Arrays.sort(input); // 순차정렬 - input 배열 바로 수정
		Arrays.sort(input2, Collections.reverseOrder()); // 기본타입은 정렬이 안 됨. 객체 타입만 가능(Integer)
		System.out.println("입력번호: "+Arrays.toString(input));
		
	}

}
