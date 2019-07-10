package control.loop;

public class WhileTest {

	public static void main(String[] args) {
		int idx = 50;

		while (idx >= 0) {

			if (idx % 2 == 0) {
				System.out.printf("%2d ", idx);
			}
			idx--;
		}
		
		idx = 51;
		System.out.println();
		
		while (idx >= 0) {
			idx --;
			if (idx % 2 != 0) {
				continue;
			}
			System.out.printf("%2d ", idx);
		}
		
		System.out.println("\n");

		int fir = 1;
		while(fir <= 10) {
			System.out.printf("%2d x %2d = %3d\n", fir, fir, (int)Math.pow(fir, 2));
			fir++;
		}
	}

}
