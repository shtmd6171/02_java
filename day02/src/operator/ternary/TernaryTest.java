package operator.ternary;

import java.util.Scanner;

public class TernaryTest {

/*
 * 삼항 연산자 (조건식 ? 값1 : 값2 )를 테스트하는 클래스
 * 조건식 : 연산결과가 항상 true/false인
 *          boolean 타입의 데이터로 나와야 함
 * 값1 : 조건식의 결과가 true 일 때 선택
 * 값2 : 조건식의 결과가 false 일 때 선택
 * 
 * 값1, 값2의 데이터 타입이 일치해야 한다.
 * 
 * 절댓값 연산을 할 때를 활용 해보자.
 */
	

	public static void main(String[] args) {
		int x =10;
		int y = -10;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		
		System.out.printf("x=%d 일때, x의 절댓값은 %d%n", x, absX);
		System.out.printf("y=%d 일때, y의 절댓값은 %d%n", y, absY);
		
		Scanner sc;
		int z;
		int absZ;
		
		sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		z = sc.nextInt();
		absZ = (z>=0) ? z : -z;
		System.out.printf("z=%d 일때, z의 절댓값은 %d%n", z, absZ);
		

	}

	
}
