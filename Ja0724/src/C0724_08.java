import java.util.Arrays;

public class C0724_08 {

	public static void main(String[] args) {
		int[] arr= {1,3,5,7,9};
		int[] arr2= new int[5];
		// 얕은 복사 - arr, arr2가 같은 주소를 가지게 됨
		arr2=arr;
		
		// 배열 복사 - 깊은 복사
		for(int i=0; i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		
		// 배열 복사 - 깊은 복사
		// (배열 이름, 첫시작, 배열이름, 첫시작, 개수)
		System.arraycopy(arr, 0, arr2, 0, 5); // 5개 복사
		// System.arraycopy(arr, 0, arr2, 0, 3); 3개 복사
		// System.arraycopy(arr, 1, arr2, 2, 3); 3개 복사 [1,3,5,7,9] -> [3,5,7] 부분부터 -> [0,0,3,5,7]
		
		System.out.println(Arrays.toString(arr2));
		

	}

}
