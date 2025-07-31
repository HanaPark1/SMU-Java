
public class Card {
	private int number;
	private String kind;
	private String[] n_num = {
			"","A","2","3","4","5","6","7","8","9","10","J","Q","K"
	};
	
	Card(){}
	Card(int number, String kind){
		this.number = number;
		this.kind = kind;
	};
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String[] getN_num() {
		return n_num;
	}
	
//	@Override
//	public String toString() {
//		return String.format("%s,%s", kind,n_num[number]);
//	}
}
