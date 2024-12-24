import java.io.*;

public class Test3 {
	public static void main(String[] args) {
//		import java.io.FileInputStream;
//		p521 바이트 단위 입력
		try {
			FileInputStream fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		바이트 단위로 출력 => 프로젝트 안에 output.txt 생성
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output.txt");
			fos.write(68);
			fos.write(69);
			fos.write(70);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
