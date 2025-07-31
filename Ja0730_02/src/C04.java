
public class C04 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.id = "aaa";
		b.pw = "1111";
		b.buyerName = "홍길동";
		
		Tv t = new Tv();
		b.buy(t);
		System.out.println("현재 잔액: "+b.money);

	}

}
