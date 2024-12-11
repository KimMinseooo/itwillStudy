
public class Test1 {
	public static void main(String[] args) {
//		p369 String 클래스
//		내장객체 java.lang.String
		
//		객체생성 방법
//		1) String s= "안녕";
//		  : 상수값으로 저장(상수 풀)
		String s= "안녕";
		String s1 = "안녕";
		System.out.println(s==s1);   // true
		System.out.println(s.equals(s1));   // true
//		2) String s2 = new String("안녕");
		String s2= new String("안녕"); 
		String s3= new String("안녕"); 
		System.out.println(s2==s3);   //false
		System.out.println(s2.equals(s3)); // true
		
		System.out.println("=========================");
//		public final class String
//		String => char value[] => char 배열
		
//		문자열 연결
		String str1= new String("java");
		String str2= new String("jsp");
		System.out.println(str1);
		System.out.println("기억장소 주소 : "+System.identityHashCode(str1));
		
//		문자열 합차기 
		String str = str1.concat(str2);
		System.out.println(str);
		
//		문자열 뽑아내기
		str="Java Programming";
//		시작위치 5부터 끝까지 
		System.out.println(str.substring(5));
//		str 변수의 값은 변경 안됨
//		str = str.substring(5);
//		System.out.println(str);
//		0부터 시작해서 시작위치 5부터 끝위치 8앞에 까지
//		System.out.println(str.substring(5,8)); // Pro
		
//		문자열 => 한자 뽑아오기
		System.out.println(str.charAt(5)); // P
//		문자열 비교 => true/false
		System.out.println(str.equals("jsp")); // false
//		특정문자 위치
		System.out.println(str.indexOf("P")); // 5위치
//		찾는 문자가 없을때 => -1
		System.out.println(str.indexOf("z")); // -1위치
//		특정문자를 뒤에서부터 찾아서 위치 표시
		System.out.println(str.indexOf("a")); // 10위치
//		문자열 길이 
		System.out.println(str.length()); // 16개
//		문자열 변경 => Jsp Programming
		System.out.println(str.replace("Java", "JSP"));
//		문자열 분리 1.jpg,2.jpg,3.jpg => , 배열 분리
		String strSplit[] = str.split(" ");
		System.out.println(strSplit[0]);
		System.out.println(strSplit[1]);
		
		String img ="1.jpg,2.jpg,3.jpg";
		String imgSplit[]  = img.split(",");
		
		System.out.println(imgSplit[0]);
		System.out.println(imgSplit[1]);
		System.out.println(imgSplit[2]);
		
		String jumin = "961205-1234567";
//		주민번호 뒷자리 첫번쨰 => 성별 나타냄 => 뽑기 
		String[] juminArr = jumin.split("-");
		
		
		char c = juminArr[1].charAt(0);
		if(c=='1' ||c=='3') {
			System.out.println("남");
		} else { 
			System.out.println("여");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
