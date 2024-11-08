package test;

public class Test6 {

	public static void main(String[] args) {
//		int형 jum 배열변수 선언
//		초기값 85,95 ,100 ,80 , 75
		int[] jum = {85,95,100,80,75};
		int sum=0;
		int sum1=0;
		for(int i =0; i<jum.length;i++) {
			sum1+=jum[i];
		}
		System.out.println("학생 점수의 합 : " +sum1);
		System.out.println("학생 점수의 평균 : " +sum1/jum.length);
		
		// 향상된 for문 
		for(int s : jum) {
			sum+=s;
		}
		
		System.out.println("학생 점수의 합 : " +sum);
		System.out.println("학생 점수의 평균 : " +(double)sum/jum.length);
		
	}

}
