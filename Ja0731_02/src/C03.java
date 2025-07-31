
public class C03 {

	public static void main(String[] args) {
		// 특별한 경우 예외처리 (프린트 디비 인터넷)
		while(true) {
			System.out.println(1);
			System.out.println(2);
			try {
				System.out.println(3);
				System.out.println(3/0);			
				System.out.println(4);	
				throw new Exception("고의로 에러발생"); //에러발생객체 throw
			} catch (Exception e) {
				e.printStackTrace(); // 에러의 원인을 설명
				System.out.println(5);
				System.out.println(6);		
			}
			System.out.println(7);
			System.out.println(8);
		}

	}

}
