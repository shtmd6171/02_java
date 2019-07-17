package lecture;

import eraser.one.Eraser;

public class LectureTestByArray {
	
	/*
	 *  2개의 지우개와 4개의 마커를
	 *  배열을 사용하여 사용/관리 하는 테스트 클래스
	 *  
	 *  1. 마커의 배열을 선언
	 *     지우개의 배열을 선언
	 *     
	 *  2. 마커배열은 길이   4
	 *     지우개배열은 길이 2
	 *     
	 *     
	 */

	public static void main(String[] args) {
		
		Maker[] makers = new Maker[4];
		String[] colors = {"빨강","파랑","초록","검정"};
		
		makers[0] = new Maker(100,true,true,"빨강");
		makers[1] = new Maker(100,true,true,"파랑");
		makers[2] = new Maker(100,true,true,"초록");
		makers[3] = new Maker(100,true,true,"검정");
		
		
		Eraser[] erasers = new Eraser[2];

		
		erasers[0] = new Eraser(3.5, 12.0, 5.5, 3, "검정", "왼쪽");
		erasers[1] = new Eraser(3.5, 12.0, 5.5, 3, "검정", "오른쪽");
		
		/*for(int count = 0; count <makers.length; count++) {
			makers[count] = new Maker(100,true,true,colors[count]);
		}*/
		
		/*for(int count = 0; count <erasers.length; count++) {
			erasers[count] = new Eraser(3.5, 12.0, 5.5, 3, eraserColors[count],eraserLoc[count]);
		}*/
		
		for(Maker count: makers) {
			count.use();
		}
		
		for(Eraser count: erasers) {
			count.erase();
		}
		
		for(Eraser count: erasers) {
			count.peel();
		}
		
		for(Eraser count: erasers) {
			count.print();
		}
		for(Maker count: makers) {
			count.print();
		}
		
		
		
		
		
		
		
		

	}

}
