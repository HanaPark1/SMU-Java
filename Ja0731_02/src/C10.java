import java.util.ArrayList;
import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Stuscore> list = new ArrayList<Stuscore>();
		StuDeck stuDeck = new StuDeck();
		
		while(true) {
			int choice = stuDeck.menu_print();
			
			switch(choice) {
			case 1:
				stuDeck.insert_stu(list);
				break;
				
			case 2:
				stuDeck.print_stu(list);
				break;
				
			case 4:
				System.out.println();
				System.out.println("[ 학생성적삭제 ]");
				System.out.println("삭제할 이름을 입력하세요.");
				String name = scan.next();
				int temp = 0;
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().contains(name)) {
						temp = 1;
						System.out.println("[ 학생검색이 되었습니다 ]");
						System.out.printf("[ %s 학생삭제 ]\n",list.get(i).getName());
						System.out.println("1. 삭제");
						System.out.println("2. 취소");
						choice = scan.nextInt();
						switch(choice) {
						case 1: 
							System.out.printf(" %s 학생을 삭제했습니다. \n", list.get(i).getName());
							list.remove(i);
							break;
						case 2:
							System.out.println("삭제가 취소되었습니다.");
							break;
						}
					}
					
				}
				if (temp == 0) {
					System.out.println(" [학생검색] ");
					System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요!");
					System.out.println();
				}
			}
		}
		

	}

}
