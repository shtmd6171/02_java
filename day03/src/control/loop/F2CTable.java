package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		double fah = 0, cel = 0;

		for (int count = 0; count <= 10; count++) {
			fah = count * 10;
			cel = (fah - 32) / 1.8;
			System.out.printf("%5.1fF = %5.1fC\n", fah, cel);
		}
	}
}
