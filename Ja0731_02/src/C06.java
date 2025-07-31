import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) throws IOException {
		// 파일을 읽어와서 문자로 변환해서 출력하는 방식
		// 문자를 읽어와서 출력하는 방식
		try {
			FileReader fr = new FileReader("c:/down/a.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine(); // 1줄을 읽어옴 (통채로)
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
