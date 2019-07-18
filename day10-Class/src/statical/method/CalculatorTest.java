package statical.method;

import static statical.method.Calculator.subtract;

public class CalculatorTest {

	public static void main(String[] args) {
		// static 메소드는 클래스이름.메소드이름();
		
		int num = Calculator.add(1, 2);
		System.out.println(num);
		double num2 = Calculator.add(1.5, 2.6);
		System.out.println(num2);
		
		// 자바에서는 클래스의 static필드들 (변수, 메소드)에 대해서
		// static import를 지원
		// static import 구문을 클래스 선언 위쪽에서 작성한 경우
		// 메소드 이름만으로 호출할 수 있다.
		
		int subnum = subtract(20, 6);
		System.out.println(subnum);

	}

}
