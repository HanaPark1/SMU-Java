
public class Card {	
	int number;
	String kind;
	
	String[] c_shape = {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card() {}
	
	Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return "[ " +c_shape[number]+", "+ kind+" ]";
	}
 
}
