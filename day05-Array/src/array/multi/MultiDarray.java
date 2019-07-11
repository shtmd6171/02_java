package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		char stars[][];

		stars = new char[6][];

		for (int fir_idx = 0; fir_idx < stars.length; fir_idx++) {
			for (int sec_idx = 0; sec_idx <= fir_idx + 1; sec_idx++) {
				stars[fir_idx] = new char[sec_idx];
			}
			for (int sec_idx = 0; sec_idx < stars[fir_idx].length; sec_idx++) {
				stars[fir_idx][sec_idx] = '★';
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
