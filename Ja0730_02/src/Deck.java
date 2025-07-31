
public class Deck {

	Card[] c = new Card[52];
	String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
	
	Deck() {
		// 모양, 번호 부여
		for (int i=0; i<c.length; i++) {
			c[i] = new Card((i%13)+1, shape[i/13]);
		}
		
	}
	
	// 카드 섞기 메소드
	
	public void shuffle() {
		Card temp;
		for (int i=0; i<300; i++) {
			int rnum = (int)(Math.random()*51);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	// 카드 5장 출력메소드

	public Card[] select_5() {
		Card[] c_5 = new Card[5];
		for (int i=0; i<5; i++) {
			c_5[i] = c[i];
		}
		return c_5;
	}
	
	
	// 카드 1장 뽑기 메소드
	public void select_card(int number) {
		System.out.printf("[ %s, %d ]\n",c[number].getKind(), c[number].getN_num()[c[number].getNumber()]);
	}
	
	//랜덤 카드 1장 뽑기 메소드
	public void select_card() {
		int rnum = (int)(Math.random()*51);
		System.out.printf("[ %s, %d ]\n",c[rnum].getKind(), c[rnum].getNumber());
	}
}
