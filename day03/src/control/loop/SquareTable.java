package control.loop;

public class SquareTable {

	public static void main(String[] args) {
		int [] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int n : numberArray)
			System.out.printf("%5d x %5d = %5d\n", n, n, n*n);

	}

}
