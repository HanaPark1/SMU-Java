import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list =  new ArrayList();
		int count = 0;
		
		
		
		while(true) {
			StuDeck stuDeck = new StuDeck();
			int choice = stuDeck.menu_print();
			switch(choice) {
			case 1: // 성적입력 - 이름,국어,영어,수학 -> 번호,합계,평균
				stuDeck.stu_input(list);
				break;
				
				
			case 2:
				stuDeck.stu_ouput(list);
				break;
				
			}
		}
		

	}

}
