package eraser.one;

/*
 * 칠판 지우개를 정의하는 클래스
 * -----------------------
 * 칠판지우개 속성 정의
 * 가로 : width  : double
 * 세로 : height : double
 * 높이 : depth  : double
 * 겹   : layer  : int
 * 색상 : color  : String
 * -----------------------
 * 생성자 정의 : 중복정의
 * 기본생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * -----------------------
 * 기능 정의 : 메소드로 생성
 * 칠판 지우기 : erase() : void : "칠판을 지웠습니다" 문자열 출력
 * 한 겹씩 제거 : peel() : void : 현재 layer 값에서 1 감소 0까지 
 * 지우개 상태 출력 : print() : void : 현재지우개의 속성 출력
 */

public class Eraser {

	double width;
	double height;
	double depth;
	int layer;
	String color;
	String loc;

	public Eraser() {

	}

	public Eraser(double width, double height, double depth, int layer, String color, String loc) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.layer = layer;
		this.color = color;
		this.loc = loc;
		
		// alt + shift + a 전체 편집
	}

	public void erase() {
		System.out.println("\n칠판을 지웠습니다");
	}

	public void peel() {
		if (layer <= 0) {
		} else {
			layer -= 1;
		}
	}

	public void print() {
		System.out.printf("\n가로 : %4.2f\n세로 : %4.2f\n높이 : %4.2f\n겹:%d\n색상:%s\n", width, height, depth, layer, color);

	}

}
