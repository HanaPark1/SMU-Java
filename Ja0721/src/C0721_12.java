import java.util.*;
public class C0721_12 {

	public static void main(String[] args) {
		System.out.printf("[%5d] \n", 12);
		System.out.printf("[%05d] \n", 12);
		
		int a = 5;
		System.out.printf("a: ", +(++a)); // 6
		System.out.printf("a: ", +(a++)); // 5
		
	}

}
