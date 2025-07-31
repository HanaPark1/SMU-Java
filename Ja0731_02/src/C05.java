import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05 {

	public static void main(String[] args) {
		//File f = new File("c:/down/a.txt");
		try {
			FileInputStream fis = new FileInputStream("c:/down/a.txt");
			int read = 0;
			try {
				while((read = fis.read()) != -1) {
					System.out.println((char)read);
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
