import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
//		// 베열 선언1
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		
//		for(int i=0;i<5;i++) {
//			arr[i] = i+1;
//		}
//		
//		// 배열선언2
//		int[] arr2 = {1,2,3,4,5};
//		// 배열선언3
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		// 출력
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		// 이름 5개를 입력받아 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		String [] name = new String[5];
		int [] kor = new int[5];
		int [] eng = new int[5];
		int [] math = new int[5];
		int [] total = new int[5];
		double [] avg = new double[5];
		
		for (int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요",i+1);
			name[i] = scan.next();
			System.out.println();
			
			System.out.printf("%s의 국어 성적 입력하세요", name[i]);
			kor[i] = scan.nextInt();
			
			System.out.printf("%s의 영어 성적 입력하세요", name[i]);
			eng[i] = scan.nextInt();
			
			System.out.printf("%s의 수학 성적 입력하세요", name[i]);
			math[i] = scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("============================");
		for (int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}

	}

}
