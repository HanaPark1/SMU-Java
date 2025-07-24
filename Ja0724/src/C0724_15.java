
public class C0724_15 {

	public static void main(String[] args) {
		int[] arr = new int[25]; // 선언과 동시에 0으로 채워짐
		// 0,1로 랜덤으로 숫자를 입력하시오.
		// 1 -> 7개만 넣어서 출력하시오.
		// 0을 모두 채우고, 1을 7개 넣고, 랜덤으로 섞기
		
		for(int i=0; i<7; i++) {
			arr[i] = 7;
		}
		
		int temp;
		for (int i=0; i<100; i++) {
			int rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
