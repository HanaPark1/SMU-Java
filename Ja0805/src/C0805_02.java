import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C0805_02 {

	public static void main(String[] args) throws Exception {
//		// 파일 복사 (읽고,저장)
//		
//		File f = new File("/Users/hana/downloads/aaa/img/");
//		if(!f.exists()) {
//			f.mkdirs(); // mkdir은 딱 한 단계 뎁스까지만 생성해 줌
//		}
//		
//		// 파일읽어오기
//		FileInputStream fis = new FileInputStream("/Users/hana/downloads/aaa/1.png");
//		
//		// 파일저장하기
//		FileOutputStream fos = new FileOutputStream("/Users/hana/downloads/aaa/img/1.png");
//		while(true) {
//			int read = fis.read();
//			System.out.println(read);
//			if(read == -1) break;
//			fos.write(read); //파일저장
//		}
//		fis.close();
//		fos.close();
		
		//// 글자출력
		// 파일에 있는 글자를 읽어와서 출력
//		byte[] b = new byte[1024];
//		
//		// 폴더 파일이 존재하는지
//		File f = new File("/Users/hana/downloads/a1.txt"); 
//		// try-catch 예외처리
//		try {
//			FileInputStream fis = new FileInputStream(f);
//			int read = 0;
//			while((read = fis.read()) != -1) {
//				break;
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		
		// 글자 저장
		File f = new File("/Users/hana/downloads/aaa/a0805_01.txt");
		String content = "1,홍길동,100,100,100,300,100.0";
		
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(content.getBytes()); // write - > byte단위로나눠서저장
		
		fos.close();
		System.out.println("글자를 저장합니다.");

	}

}
