
public class Deck {
	final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
	String[] c_shape = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	// 기본생성자
	Deck() {
		for(int i=0; i<52; i++) {
			c[i] = new Card(i%13+1, shape[i/13]);
		}
	}
	
	// 카드 섞기
	void shuffle() {
		Card temp = null;
		int rnum = 0;
		for(int i=0; i<300; i++) {
			rnum = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[rnum];
			c[rnum] = temp;
		}
	}
	
	// 전체카드출력
	void deck_print(){
		for(int i=0; i<52; i++) {
			System.out.printf("[ %s,%s ]\n",c_shape[c[i].number], c[i].kind);
		}
	}	
	
	//카드한장뽑기
	Card pick(int index) {
		if (index>52) {
			return c[0];
		} else {			
			return c[index]; // 100
		}
	}
	
	Card pick() {
		int rnum = (int)(Math.random()*52);
		return c[rnum];
	}
}
