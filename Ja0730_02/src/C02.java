
public class C02 {

	public static void main(String[] args) {
		Deck d = new Deck();
		
		// 모양, 번호가 포함 카드 52장을 생성
		// 카드 섞기
		d.shuffle();
		// 카드 5장 출력
		System.out.println("카드 5장 출력");
		Card[] c_5 = d.select_5();
		for (int i=0; i<c_5.length; i++) {
			System.out.printf("%s,%d\n", c_5[i].getKind(), c_5[i].getNumber());
		}
		// 카드 31번째 카드 출력하시오.
		System.out.println("카드 31번째 출력");
		d.select_card(31);
		// 랜덤으로 카드 한장을 출력하시오.
		System.out.println("카드 랜덤 출력");   
		d.select_card();

	}

}
