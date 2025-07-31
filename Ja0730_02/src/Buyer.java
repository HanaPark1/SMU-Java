
public class Buyer {
	String id;
	String pw;
	String buyerName;
	String address;
	String tel;
	int money = 10000000;
	int bonusPoint = 0;
	
	void buy(Tv t) {
		money -= t.price;
		bonusPoint += t.bonusPoint;
	}

}
