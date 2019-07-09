package control.ifstmt;

import java.util.Scanner;

/**
 * 입력된 정수에 대해서 2의 배수인지 판별하는 클래스
 * 
 * Scanner 를 사용하여 입력된 정수를 input 변수에 저장하고 
 * 입력된 값이 2의 배수인지 판단하는 조건을 작성하시오.
 * 2의 배수 판별 결과는 String result 에 저장하시오.
 * 
 * -- (1) ------------------------------------------------------
 * 2의 배수일 때 : "입력값 4 은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : "입력값 5 은(는) 2의 배수가 아닙니다."
 *  
 * -- (2) ------------------------------------------------------
 * 나머지는 int mod; 에 저장하여 사용하시오.
 * 
 * 2의 배수일 때 : "입력값 4 은(는) 2의 배수입니다."
 * 2의 배수가 아닐 때 : 
 *     "입력값 5 은(는) 2의 배수가 아닙니다."
 *     "나머지가 1 입니다."
 * --------------------------------------------------------    
 * 
 * @author 304
 *
 */
public class MultipleOfTwo {

	public static void main(String[] args) {
		// (1) -----------------------------------------
		// 1. 선언
		int input;
		int mod;
		String result;
		
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		input = scan.nextInt();
		
		System.out.println("===== (1) =====");
		
		// 입력 값이 0인 경우 : 0은 배수 판별할 수 없습니다.
		if (input % 2 == 0 && input > 0 ) { 
			// 위의 () 안의 연산은 연산자 우선순위에 의해 
			// input % 2 의 연산이 먼저 수행되고 난뒤
			// 그 결과가 0과 같은지 == 연산이 수행됩니다.
			result = "배수입니다.";
		} else if (input == 0){
			result = "배수 판별할 수 없습니다.";
		}
		else {
			result = "배수가 아닙니다.";
		}
		
		System.out.printf("입력값 %d (은)는 2의 %s%n", input, result);
		
		// (2) ---------------------------------------------
		System.out.println("===== (2) =====");
		mod = input % 2;
		if (input % 2 == 0) { 
			// 위의 () 안의 연산은 연산자 우선순위에 의해 
			// input % 2 의 연산이 먼저 수행되고 난뒤
			// 그 결과가 0과 같은지 == 연산산이 수행됩니다.
			System.out.printf("입력값 %d (은)는 2의 %s%n", input, result);
		} else {
			System.out.printf("입력값 %d (은)는 2의 %s%n", input, result);
			System.out.printf("나머지가 %d 입니다.", mod);
		}
		
		// 사용한 scan 객체 닫기
		scan.close();
		
	}

}