
public class C04 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println();
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(arr[10]);
			System.out.println(0/0);
			System.out.println(4);
			System.out.println(4.5);
//			throw new Exception("고의로 에러발생");
		} catch(ArithmeticException e2) {
//			해당되는 에러가 발생될 때 그에 맞는 대응을 하려면
			System.out.println("0으로 나눴을 때 에러 처리 코드");
		} catch(Exception e) { // 예외최상위 객체이기에 모든 예외처리 가능
			e.printStackTrace();
			System.out.println(5);
			System.out.println(6);
		} finally { // 예외 발생 시, 예외가 없을 때도 무조건 실행
			System.out.println(7);			
		}
		

	}

}
