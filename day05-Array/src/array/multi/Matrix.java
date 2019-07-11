package array.multi;

public class Matrix {

	/*
	 * 수학의 행렬을 나탈낼 수 있는
	 * 2차원 배열을 선언하고 초기화 후
	 * 출력해보는 클래스
	 */
	public static void main(String[] args) {
		
		int[][] matrix = {{0, 1, 0},{1, 1, 1},{0, 0, 0}};
		
		for(int idx = 0; idx < matrix.length; idx++)
		{
			for(int idx2 = 0; idx2 < matrix[idx].length; idx2++)
			{
				System.out.printf("matrix[%d][%d] = %d\n",idx,idx2,matrix[idx][idx2]);
			}
		}
		
		System.out.println();
		
		// foreach
		
		for (int[] numbers : matrix ) 
		{
			for (int num : numbers ) 
			{
				System.out.printf("%d\t",num);
				
			}
		}

	}

}
 