
public class Test2 {
	public static void main(String[] args) {
		// 다차원 배열 => 2차원 배열(행,열 구성/평면)
		
		// 정수형 배열 kor 크기 3, 점수 초기화 100, 80 ,95
		
		int[] kor = {100,80,95};
		// 정수형 배열 math 크기 3 , 점수 초기화 75 ,70 ,65
		int[] math = {75,70,65};
		
		
//		2차원 배열 [행][열]
		
		int arr[][] = new int[2][3];
		//국어점수
		arr[0][0]=100;
		arr[0][1]=80;
		arr[0][2]=95;
		
		// 수학점수
		arr[1][0]=75;
		arr[1][1]=70;
		arr[1][2]=65;
		
		int[][] arr2= {{100,85,95},{75,70,65}};
		
		System.out.println("과목개수(행) : "+arr.length);
		System.out.println("과목개수(행) : "+arr2.length);
		
		System.out.println("과목별 점수개수(열) : "+arr[0].length);
		System.out.println("과목별 점수개수(열) : "+arr2[0].length);
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("["+arr[i][j]+"]\t");
				
			}
			System.out.println();
		}
		
		
		int [][] grade= {{85,88,82,89,87},
						 {95,92,96,99,91},
						 {77,75,73,72,79}};
		
		
		
		System.out.println("과목개수 : " +grade.length);     // 행 개수 출력 
			
		for(int i=0;i<grade.length;i++) {
		
			int total=0;
			if(i==0) System.out.print("java과목: ");
			else if(i==1) System.out.print("web과목: ");
			else if(i==2) System.out.print("db과목: ");
			
			for(int j=0;j<grade[i].length;j++) {
				System.out.print("["+grade[i][j]+"]"); 
				total+=grade[i][j];
			}
			System.out.print(" 총합 : "+total);
			System.out.print(" 평균 : "+(double)total/grade[i].length);
			System.out.println();
		}
		
		
		// p221 알파벳 소문자 두글자씩 출력
		
		char[][] alpha =new char[13][2];
		char ch='a';
		
		for(int i=0;i<alpha.length;i++) {
			for(int j=0;j<alpha[i].length;j++) {
				alpha[i][j]=ch;
				ch++;
				System.out.print(alpha[i][j]+" ");	
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
