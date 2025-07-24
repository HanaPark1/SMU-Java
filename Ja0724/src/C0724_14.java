
public class C0724_14 {

	public static void main(String[] args) {
		// 1차원배열 -> 1-25까지 순차번호 입력
		// 랜덤으로 번호 섞기
		// 2차원배열 -> [5][5] 랜덤번호를 입력해서 출력하시오
		
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
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
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}

	}

}
