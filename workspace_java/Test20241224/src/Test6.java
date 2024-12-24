import java.io.*;

public class Test6 {
	public static void main(String[] args) {
//		File 클래스 => File 생성, 정보확인, 삭제 
//		import java.io.File;
		try {
//			File file = new File("C:\\Users\\ITWILL\\Documents\\GitHub\\itwillStudy\\workspace_java\\newfile.txt"); // 원하는 폴더에 파일 만들기 
			File file = new File("newfile.txt"); // 프로젝트 폴더
//			파일생성
			file.createNewFile();
			System.out.println("파일 : " +file.isFile());
			System.out.println("디렉토리 : "+ file.isDirectory());
			System.out.println("파일이름 : "+ file.getName());
			System.out.println("파일절대경로 : "+file.getAbsolutePath());
			System.out.println("파일경로 : "+file.getPath());
			System.out.println("파일읽기가능 : "+file.canRead());
			System.out.println("파일쓰기가능 : "+file.canWrite());
			
			System.out.println("파일존재 : "+file.exists());
			
//			파일삭제
			file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
