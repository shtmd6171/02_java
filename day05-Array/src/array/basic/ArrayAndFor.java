package array.basic;

public class ArrayAndFor {

	public static void main(String[] args) {
		
		int[] numbers = new int [10];

		for(int idx = 1; idx <=numbers.length ; idx++)
		{

			numbers[idx-1] = idx * 10;
		}
		
		for(int idx = 0; idx <=numbers.length-1 ; idx++)
		{

			System.out.printf("numbers[%d] = %d\n",idx, numbers[idx]);
		}

	}

}
