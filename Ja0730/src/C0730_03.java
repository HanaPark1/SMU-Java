
public class C0730_03 {

	public static void main(String[] args) {
		Deck d = new Deck();
		d.deck_print();
		
		// 카드섞기
		d.shuffle();
		System.out.println("-----");
		d.deck_print();
		System.out.println("-----");
		Card c_one = d.pick(34);
		System.out.printf("1장: %s,%s\n",d.c_shape[c_one.number], c_one.kind);
		System.out.println("-----");
		c_one = d.pick();
		System.out.printf("1장: %s,%s\n",d.c_shape[c_one.number], c_one.kind);
		
		System.out.println("-----");
		System.out.println(c_one);
		

	}

}
