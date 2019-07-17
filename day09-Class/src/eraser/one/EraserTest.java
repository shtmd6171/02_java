package eraser.one;

public class EraserTest {

	public static void main(String[] args) {

		Eraser leftEraser = new Eraser();
		Eraser rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "검정");

		leftEraser.print();
		rightEraser.print();

		rightEraser.peel();

		leftEraser.print();
		rightEraser.print();

		leftEraser.peel();
		rightEraser.peel();

		leftEraser.erase();

		leftEraser.print();
		rightEraser.print();

	}

}
