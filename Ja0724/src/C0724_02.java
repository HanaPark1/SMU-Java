import java.util.Arrays;

public class C0724_02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int num = 5;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr); // 주소값 출력
		
		int num2 = 0;
		num2 = num;
		System.out.println(num2); // 5
		num = 10;
		System.out.println(num2); // 5
		
		int[] arr2 = {0,0,0,0,0};
		System.out.println(Arrays.toString(arr2));
		arr2 = arr; //  얕은 복사 (이렇게 복사하지 말길....)
		System.out.println(Arrays.toString(arr2));
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(Arrays.toString(arr2));
	}

}
