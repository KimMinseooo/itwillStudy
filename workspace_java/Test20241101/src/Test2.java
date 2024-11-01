
public class Test2 {
	public static void main(String[] args) {
		
//		if else if else 다중 if 구문
		int num =0 ;
//		num 0 보다 작으면 "음수", 아니면 num 0보다 크면 "양수" ,나머지 "영" 
		
		if (num<0) {
			System.out.println(num + ": 음수");
		} else if (num>0) {
			System.out.println(num + ": 양수");
		} else {
			System.out.println(num + ": 영");
		}
		
		
		//놀이공원 입장료 계산
		// 취학 전 아동(8세 미만 ) 1000원
		
		int age=14;
		if (age<8) {
			System.out.println(age+"세의 입장료 : 1000원");
		} else if (age<14) {
			System.out.println(age+"세의 입장료 : 2000원");
		} else if (age <20){
			System.out.println(age+"세의 입장료 : 2500원");
		} else if(age<60){
			System.out.println(age+"세의 입장료 : 3000원");
		} else { 
			System.out.println(age+"세의 입장료 : 0원");
		}
		
		//정수형 변수 score 선언 초기값 점수 저장(0~100) 
//		=> 학점 100~90 A, 89 ~ 80 B, 79 ~70 C, 69~ 60 D, 나머지 F
		int score = 70 ; 
			if(score>=90) {
				System.out.println("학점 : A");
			} else if (score>=80) {
				System.out.println("학점 : B");
			} else if (score>=70) {
				System.out.println("학점 : C");
			} else if (score>=60) {
				System.out.println("학점 : D");
			} else {
				System.out.println("학점 : F");
			}
		
		
		
	}
}
