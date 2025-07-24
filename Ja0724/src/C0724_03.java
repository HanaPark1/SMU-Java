
public class C0724_03 {

	public static void main(String[] args) {
		// int lotto = (int)(Math.random()*45)+1;
		
		// 1-45까지 숫자가 들어가 있는 배열 생성
		int[] num = new int[45];
		
		// 번호 입력
		for (int i=0; i<45;i++) {
			num[i]=i+1;
		}
		
		// 번호 섞기
		int rnum = 0 ;
		int temp = 0; // 임시 저장
		for (int i=0;i<300;i++) {
			rnum = (int)(Math.random()*45)+1;
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 번호 출력
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}

	}

}
