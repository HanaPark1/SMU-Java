import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		// 이름 5명을 입력받아,
		// 입력이름: 홍길동, 유관순, 이순신, 강감찬, 김구
		
		Scanner scan = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] kors = new int[5];
		int[] engs = new int[5];
		
		for (int i=0; i<names.length; i++) {
			System.out.printf("%d번째 이름을 입력하세요:\n",i+1);
			names[i] = scan.next();
			System.out.println();
			System.out.printf("%s의 국어 점수 입력하세요:\n",names[i]);
			kors[i] = scan.nextInt();
			System.out.printf("%s의 영어 점수 입력하세요:\n",names[i]);
			engs[i] = scan.nextInt();
		}
		
		for (int i=0; i<names.length; i++) {
			System.out.printf("%s : %d, %d\t", names[i], kors[i], engs[i]);
		}
	}

}
