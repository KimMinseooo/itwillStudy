import java.io.*;
import java.util.*;

public class Test2 {
	public static void main(String[] args) {
//		p512 자바 입출력
//		자바 : 외부 장치에 따라 독립적이고 효율적인 입출력 기능 제공
//			: 입출력은 스트(stream)을 통해서 이루어짐
//			: 입출력 장치와 무관하고 일관성있게 프로그램을 구현
//			: 가상 통로 => 스트림 제공
//			: 키보드 , 모니터, 파일 디스크, 메모리 입출력, 네트워크
//			=> 스트림 클래스 제공
//		1) 입력스트림, 출력스트림 
//		=> FileInputStream, FileReader , BufferedInputStream
//		   BufferedReader,.
//		=> FileOutputStream, FileWriter, BufferedOutputStream
//		   BufferedWriter,.
		
//		2) 바이트 단위 스트림, 문자 단위 스트림
//		=> 바이트 단위 FileInputStream, FileOutputStream
//				BufferedInputStream, BufferedOutputStream
//		=> 문자 단위 FileReader, FileWriter, 
//				BufferedReader, BufferedWriter
		
//		3) 기반 스트림, 보조 스트림 
//		=> 기반 : 직접 읽거나 쓰는 기능
//				FileInputStream, FileOutputStream
//				FileReader, FileWriter
//		=> 보조 : 부가 기능 제공
//		InputStreamReader, OutputStreamReader
//		BufferedInputStream, BufferedOutputStream
		
//		p515 1. 표준 입출력
//		PrintStream out 표준출력 스트림
//		InputStream in 표준입력 스트림
//		OutputStream err 표준오류출력 스트림
		
//		바이트입력
//		try {
//			System.out.println("입력 : ");
//			int i = System.in.read();
//			System.out.println("출력 : " +(char)i);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		while 반복하면서 문자 여러개 입력 => Enter키를 누르면 false 종료 
//		int i;
//		System.out.println("입력 : ");
//		try {
//			while((i=System.in.read()) != '\n') {
//				System.out.print((char)i);
//			}
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Scanner 클래스 => java.util 입력클래스 
//		문자, 정수, 실수 ..자료형 읽을 수 있음
//		콘솔 화면, 파일, 문자열 생성자 자료를 읽어 옴 
//		nextBoolean(), nextInt() , nextDouble()...
//		문자열 String 읽어 옴 
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("직업 : ");
		String job = sc.nextLine();
		System.out.println("사번 : ");
		String num = sc.nextLine();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(num);
	}
}
