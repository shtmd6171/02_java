package array.multi;

import java.util.Scanner;

public class DynamicInputArray {
	
	/* 정수를 저장하는 동적 2차 배열을 numbers2nd 생성
	 * 
	 * numbers의 사이즈 : 4
	 * numbers[0] = 5
	 * numbers[1] = 3
	 * numbers[2] = 2
	 * numbers[3] = 7
	 * 
	 * 각각의 사이즈를 Scanner로 입력 받아서 생성
	 * 
	 * 생성된 배열 안에는 10, 20, ~ 170까지의 숫자를 저장
	 * 출력을 해본다.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] numbers2nd;
		int input;
		int value= 0;
		
		System.out.println("2차 배열의 크기를 입력(4)");
		input = sc.nextInt();
		
		numbers2nd = new int[input][];
		
		// 생성
		for(int idx = 0; idx < numbers2nd.length; idx++)
		{
			System.out.printf("인덱스[%d] 1차 배열 크기 입력 : %n",idx);
			input = sc.nextInt();
			
			numbers2nd[idx] = new int[input];
			
			// 저장
			for(int ind = 0; ind < numbers2nd[idx].length; ind++)
			{
				numbers2nd[idx][ind] = (value += 10);
			}
		}
		
		// 출력
		for (int[] array : numbers2nd) {
			for (int num : array) {
				System.out.printf("%3d\t", num);
			}
			System.out.println();
		}
	
		
		
		

	}

}
