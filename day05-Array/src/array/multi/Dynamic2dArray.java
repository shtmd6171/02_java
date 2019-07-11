package array.multi;

public class Dynamic2dArray {

	public static void main(String[] args) {
		int[][] twoDArray;
		int count = 0;

		twoDArray = new int[4][];

		// 초기화
		for (int[] array : twoDArray) {
			System.out.println("array=" + array);
		}
		System.out.println();
		twoDArray[0] = new int[3];
		twoDArray[1] = new int[4];
		twoDArray[2] = new int[1];
		twoDArray[3] = new int[5];

		for (int[] array : twoDArray) {
			System.out.println("array=" + array);
		}
		System.out.println();

		// 저장
		for (int idx = 0; idx < twoDArray.length; idx++) {
			for (int ind = 0; ind < twoDArray[idx].length; ind++) {
				twoDArray[idx][ind] = ++count;
			}
		}
		//출력
		for (int[] array : twoDArray) {
			for (int num : array) {
				System.out.printf("%d\t", num);
			}
			System.out.println();
		}

	}

}
