
public class Pro {
	static int count;
	int serialNo;
	String productName;
	
	{this.serialNo = ++count;}
	
	Pro() {}
	
	Pro(String productName) {
		this.productName = productName;
	}

}
