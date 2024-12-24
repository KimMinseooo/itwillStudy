import java.io.*;

public class Test5 {
	public static void main(String[] args) {
//		보조 스트림
//		입력 =>Buffered 스트림 모아서 사용
//		Buffered 스트림 모아서 => 출력
		
		long ms = 0;
		try {
			FileInputStream fileInputStream = new FileInputStream("Test20241224.zip");
			FileOutputStream fileOutputStream = new FileOutputStream("copy.zip");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//			현 시간 설정
			ms= System.currentTimeMillis();
			
			int i;
			while((i=fileInputStream.read()) != -1) {
				fileOutputStream.write(i);
			}
			
//			Buffered 스트림 사용
//			int i;
//			while((i=bufferedInputStream.read()) != -1) {
//				bufferedOutputStream.write(i);
//			}
//			동작 후 시간
			ms =System.currentTimeMillis() - ms;
		} catch (Exception e) {
			e.printStackTrace();
		}
//		기본 30 => Buffered 스트림 사용 3 => 속도 향상
		
		System.out.println("파일 복사 시간 : "+ ms);
	}
}
