
public class Test5 {
	public static void main(String[] args) {
		
//		sum(여러명의 점수를 전달받아서 저장하는 배열 변수) 함수 정의 
//		for 배열 변수 안에 저장된 점수의 합 구하기  
//		점수의 합 리턴 (리턴할 형 정수형 ) 
		
//		배열변수 선언 = 5개 점수 초기값 저장
//		sum(배열변수 전달) 함수 호출 => 리턴받은 배열 점수의 합 출력
		int[] score= new int[] {100,80,20,40,50} ;  // 배열 변수명
		System.out.println("score배열 점수의 합 : " +sum(score));

//		배열변수 선언 = 7개 몸무게(float)  초기값으로 저장 
//		sum2(배열변수 전달) 함수 호출 => 리턴받은 배열 몸무게의 평균을 리턴 
		
		float[] weight = new float[] {63.8f ,80.1f ,75.0f ,77.8f ,90.4f, 50.4f};
		
		System.out.println("몸무게의 평균 : " + sum2(weight)+"입니다.");
	}
	
	// sum 합의 기능을 구현해놓은 함수 이름이 sum() 
	public static int sum(int[] score) {
		int total =0;
		for(int i=0;i<score.length;i++) {
			total+=score[i];
		}
		return total;
	}
	
	public static float sum2(float[] weight) {
		float total =0;
		
		for(int i=0;i<weight.length;i++) {
			total+=weight[i];
		}
		System.out.println("몸무게의 총합 : " +total+"입니다.");
		
		return total/weight.length;
	}
	
}
