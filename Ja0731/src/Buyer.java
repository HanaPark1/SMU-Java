
public class Buyer {
	String id;
	String pw;
	String address;
	String name;
	
	int money;
	int bonusPoint;
	Product[] cart = new Product[10];
	int i=0;
	
	Buyer(){}
	
	Buyer(String id, String name, int money, int bonusPoint){
		this.id = id;
		this.name = name;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
	}
	
//	void buy(Tv t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}

}
