package statical.method;

/*
 * 산술 연산인
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하는 각각의 메소드
 * add, subtract, multiply, divide를 정의한다
 * 
 * 각 메소드마다 매개변수를 정수 2개, 실수 2개를 받는
 * 메소드 중복정의 기법을 사용하여 총 8개의 메소드를 정의하고
 * 연산 결과를 리턴하도록 작성한다.
 * 
 * 이 때 각 메소드는 모두 static으로 작성
 */

public class Calculator {
	
	public static int add (int a, int b) {
		
		return a+b;
	}
	
	public static int subtract (int a, int b) {
		
		return a-b;
	}
	
	public static int multiply (int a, int b) {
		
		return a*b;
	}
	
	public static int divide (int a, int b) {
		
		return a/b;
	}
	
	public static double add (double a, double b) {
		
		return a+b;
	}
	
	public static double subtract (double a, double b) {
		
		return a-b;
	}
	
	public static double multiply (double a, double b) {
		
		return a*b;
	}
	
	public static double divide (double a, double b) {
		
		return a/b;
	}
	
	

}
