import java.io.BufferedReader;
import java.io.FileReader;

public class C07 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/down/aaa.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}

	}

}
