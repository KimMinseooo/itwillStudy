
//함수형 인터페이스(추상 메서드 1개만 있음)
//@FunctionalInterface => 컴파일에게 함수형 인터페이스 알려줌
@FunctionalInterface
public interface MyFunction {
//	추상메서드
	int calc(int x, int y);
//	int getMax(int num1, int num2);
}
