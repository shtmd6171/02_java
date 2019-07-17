package lecture;

public class LectureTest {
	
	

	public static void main(String[] args) {
		
		
		Eraser leftEraser = new Eraser(3.5, 12.0, 5.5, 5, "흑","왼쪽");	
		Eraser rightEraser = new Eraser(3.5, 12.0, 5.5, 3, "백","오른쪽");
		
		Maker red = new Maker(100,true,true,"빨강");
		Maker blue = new Maker(100,true,true,"파랑");
		Maker green = new Maker(100,true,true,"초록");
		Maker black = new Maker(100,true,true,"검정");
		
		// 네 개의 마커를 한번씩 사용
		red.use();
		blue.use();
		green.use();
		black.use();
		
		// 오른쪽 지우개, 왼쪽 지우개로 사용한 내용 지우기
		rightEraser.erase();
		leftEraser.erase();
		
		// 오른쪽 지우개 한 겹 벗겨내기
		rightEraser.peel();
		
		// 오른쪽 지우개 상태 출력
		rightEraser.print();
	}

}
