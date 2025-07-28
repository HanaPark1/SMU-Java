import java.util.Scanner;

public class C0725_06 {

	public static void main(String[] args) {
		// 배열
		// 퀴즈
		// 45개 배열을 생성해서 1-45까지 숫자를 입력하시오
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[45];
		int[] myNo = new int[6];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		int temp = 0;
		for (int i=0; i<300; i++) {
			int rnum = (int) (Math.random()*45);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		// 배열복사
		System.arraycopy(arr, 0, myNo, 0, 6);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
