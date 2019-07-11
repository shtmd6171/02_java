package array.basic;

public class SquareTest {

	/*
	 * 1. 정수를 원소로가지는 배열 numbers를 선언한 후 for (index 사용하는 전통적인 for)구문을 사용하여 1~10까지 정수를 저장한다.
	 * 
	 * 2. foreach 구문을 사용하여 1에서 저장된 값의 제곱표를 출력한다.
	 */

	public static void main(String[] args) {

		int[] numbers = new int[10];
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}

		for (int idx : numbers) {
			System.out.printf("%3d^2 = %3d\n", idx, (int) Math.pow(idx, 2));
		}

	}

}
