package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		char stars[][];

		stars = new char[6][];

		for (int fir = 0; fir < stars.length; fir++) {
			for (int sec = 0; sec <= fir+1; sec++) {
				stars[fir] = new char[sec];
			}
			for (int sec = 0; sec < stars[fir].length; sec++) {
				stars[fir][sec] = '★';
			}
		}
		for (char[] array : stars) {
			for (char num : array) {
				System.out.printf("%c\t", num);
			}
			System.out.println();
		}
	}
}
