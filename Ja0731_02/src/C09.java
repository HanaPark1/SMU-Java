import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일이름을 입력하세요.");
		String fileName = scan.next();
		System.out.println("c:/down/"+fileName);
		
		File f = new File("c:/down/"+fileName);
		
		if(!f.exists()) {
			f.createNewFile(); // 파일 생성됨
			System.out.println("파일이 생성되었습니다. ");
		} else {
			System.out.println("파일이 존재합니다.");
		}
	}

}
