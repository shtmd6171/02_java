package array.basic;

public class ArrayAndFor {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		int sum = 0;


		for (int idx = 0; idx < numbers.length; idx++) {

			numbers[idx] = (idx+1) * 10;
			sum += numbers[idx];
		}

		for (int idx : numbers) {
			
			System.out.println("num = "+ idx);
		}
		System.out.println(sum);
	}

}
