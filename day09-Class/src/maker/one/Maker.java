package maker.one;

public class Maker {

	int ink = 100;
	boolean isNew;
	boolean isOpened;
	String color;

	Maker() {
	}

	Maker(int ink) {
		this();
		this.ink = ink;
	}

	Maker(int ink, boolean isNew) {
		this(ink);
		this.isNew = isNew;
	}

	Maker(int ink, boolean isNew, boolean isOpened) {
		this(ink, isNew);
		this.isOpened = isOpened;
	}

	Maker(int ink, boolean isNew, boolean isOpened, String color) {
		this(ink, isNew, isOpened);
		this.color = color;
	}

	public void print() {
		System.out.printf("잉크상태: %d\n", ink);
		if (isNew) {
			System.out.println("마커가 새것");
		} else {
			System.out.println("마커가 헌것");
		}
		if (isOpened) {
			System.out.println("뚜껑 열림");
		} else {
			System.out.println("뚜껑 닫힘");
		}
		System.out.printf("색상 : %s\n", color);

	}

	public void use() {
		System.out.printf("%s색 마커를 사용중\n", color);
	}
	

	public void newStatus() {
		if (ink == 100) {
			isNew = true;
		} else {
			isNew = false;
		}
	}

	public void write() {
		if (ink > 0) {
			System.out.println("쓰윽");
			ink -= 100;
		} else if (ink <= 0) {
			System.out.println("다씀");
		}
	}

	public void lidopen() {
		isOpened = true;
	}

	public void lidclose() {
		isOpened = false;
	}

	
	
}
