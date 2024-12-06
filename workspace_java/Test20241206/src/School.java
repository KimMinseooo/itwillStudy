
public class School {

//	메서드 정의 : 리턴값 없음 draw(원,삼각형,사각형...)
//	출력 "모든 도형 그리기", prn() 메서드 호출
	
//	public void cirDraw(Circle circle) {
//		System.out.println("모든 도형 그리기");
//		circle.prn();
//	}

	public void draw(Shape shape) { 
		System.out.println("모든 도형 그리기");
		
		if(shape instanceof Circle) {
			Circle circle = (Circle)shape;
			circle.prn();
		}
		if(shape instanceof Triangle) {
			Triangle tri = (Triangle)shape;
			tri.prn();
		}
		if(shape instanceof Rectangle) {
			Rectangle rec = (Rectangle)shape;
			rec.prn();
		}
		
		
//		
//		shape.prn();
	}
	
	
}
