import java.util.*;
import java.util.stream.*;

public class Test5 {
	public static void main(String[] args) {
//		p473 스트림(stream) : 배열, 컬렉션 반복 => for 미리 구현
//		                  : 프로그램 코드 간결, 일관성
//		미리 배열, 컬렉션 작업을 구현해 놓고
//		데이터(자료 상관없이)를 메서드 호출할때 전달
//		=> 자료를 추상화 
		
		int[] arr= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------");
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("-----------------------");
//		import java.util.Arrays;
		Arrays.stream(arr).forEach(n -> System.out.println(n));
//		배열 내용 합 
		int sum = Arrays.stream(arr).sum();
		System.out.println("배열 합 : " + sum);
//		배열 개수 
		long count =Arrays.stream(arr).count();
		System.out.println("배열 개수 : "+count);
		System.out.println("-----------------------");
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("jsp");
		list.add("html");
//		Stream<String> stream = list.stream();
//		stream.forEach(n->System.out.println(n));
		
		list.stream().forEach(n->System.out.println(n));
		System.out.println("-----------------------");
//		정렬
		list.stream().sorted().forEach(n->System.out.println(n));
		System.out.println("-----------------------");
//		조건
		list.stream()
		.filter(s -> s.equals("html"))
		.forEach(s->System.out.println(s));
		
	}
}
