
public class C0728_07 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		Card.width = 100;
		Card.height = 250;
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		
		System.out.printf("%s,%d,%d,%d \n",c1.kind, c1.number, c1.width, c1.height);

	}

}
