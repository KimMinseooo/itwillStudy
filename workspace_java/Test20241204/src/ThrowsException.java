import java.io.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {
//	p501 throws IOException
//	: 예외처리를 메서드 호출한 곳에서 예외처리를 하도록 미룸
	
	public void loadfile() throws IOException{
		System.out.println("예외 발생 메서드()");
		FileInputStream fis = null;
		fis = new FileInputStream("a.txt");
	}
	
//	public void loadfile() {
//		System.out.println("예외 발생 메서드()");
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	
}