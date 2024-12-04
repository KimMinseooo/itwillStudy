import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		
//		자바에서 제공하는 예외클래스
//		Throwable -> Error (java,lang.Error) 에러
//				  -> Exception (java.lang.Exception) 예외
//		Exception -> IOException -> FileNotFoundException
//		          -> RuntimeException -> ArithmeticException
//								    IndexOutofBoundException
		
		int arr[] = new int[5];
		try {
			// 예외가 발생할 가능성이 높은 명령
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// 예외 발생 했을때 잡아서 처리 IOException 파일
			System.out.println("예외처리");
		} catch (Exception e) {
			e.printStackTrace();
			// Exception 파일
		} finally { 
			// 예외 발생 상관없이 마무리 작업하는 명령 
			System.out.println("마무리 작업");
		}
		
		FileInputStream fis = null;
		try {
			System.out.println("오류 앞 ");
			fis = new FileInputStream("a.txt");
			System.out.println("오류 뒤");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("마무리 작업2");
//			기억장소 해제
			try { 
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
