import java.io.File;
import java.io.IOException;

public class C08 {

	public static void main(String[] args) throws Exception {
		File f = new File("c:/down/abc.txt"); 
		// 파일존재유무 확인
		if(!f.exists()) {
			f.createNewFile(); // 파일 생성됨
			System.out.println("파일이 생성되었습니다. ");
		} else {
			System.out.println("파일이 존재합니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
