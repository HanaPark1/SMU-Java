
public class RanNum {
	static int[] arr = new int[10]; // 클래스변수 - 객체선언 X, 공용 O, 클래스명.변수명
	int a ; // 인스턴스변수 - 객체선언O, 객체개별O,참조변수
	
	static { // 초기화 블럭 - 생성자가 생성되기 전에 실행됨
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}
