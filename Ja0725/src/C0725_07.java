
public class C0725_07 {

	public static void main(String[] args) {
		// 1차원 배열
		// 2차원 배열
		
		// 1차원배열 25개를 1-25까지 입력
		// 랜덤으로 섞어서 출력
		// 순차출력: 1,2,3,
		// 랜덤출력 21, 1,4
		
		int[] arr = new int[25];
		int[][] arr2 = new int[5][5];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = i+1;
		}
		
		System.out.println("순차출력");
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
		System.out.println();
		
		int temp = 0;
		for (int i=0; i<300; i++) {
			int rnum = (int)(Math.random()*25);
			temp = arr[0];
			arr[0] = arr[rnum];
			arr[rnum] = temp;
		}
		
		System.out.println("랜덤출력");
		for (int i=0;i<arr.length;i++) {
			System.out.printf("%d\t",arr[i]);
		}
		System.out.println();
		
		for (int i=0; i<arr2.length; i++) {
			for (int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[5*i+j];
			}
		}
		System.out.println("랜덤2차원배열출력");
		for (int i=0;i<arr2.length;i++) {
			for (int j=0; j<arr2[i].length; j++) {
				System.out.printf("%d\t",arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
