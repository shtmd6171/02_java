package control.loop;


public class ForTest {

	public static void main(String[] args) {

		for (int idx = 50; idx >= 0; idx--) {

			if (idx % 2 == 0) {
				System.out.printf("%2d ", idx);
			}
		}
		
		System.out.println();

		for (int idx = 50; idx >= 0; idx--) {

			if (idx % 2 != 0) {
				continue;
			}
			System.out.printf("%2d ", idx);
		}
		
		System.out.println("\n");

		for (int fir = 1; fir <= 10; fir++) {
			System.out.printf("%2d x %2d = %3d\n", fir, fir, (int)Math.pow(fir, 2));

		}

	}

}
