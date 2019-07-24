package clock;

public class ClockTest {
	/*
	 * Clock 인터페이스,
	 * SmartWatch, GarminActive3, GalaxyGear4 클래스를 테스트
	 * 
	 */
	public static void main(String[] args) {
		
		// 1. 선언, 2.초기화
		// (1)SmartWatch 추상클래스 타입의 배열 선언
		SmartWatch[] watches = new SmartWatch[2];
		
		// (2)각 인덱스 위치에 GarminActive3, GalaxyGear4 인스턴스 저장
		watches[0] = new GarminActive3();
		watches[0].setWatchName("가민 액티브3");
		watches[1] = new GalaxyGear4();
		watches[1].setWatchName("갤럭시 기어4");
		
		// 3. 사용
		for(SmartWatch watch : watches) {
			watch.displayTime();
		}
		
		// 4. 인터페이스 타입의 변수선언
		Clock myWatch;
		// myWatch = new Clock();
		// 인터페이스는 생성자가 없어서(추상 메소드만 지님) 생성자 호출이 불가능
		myWatch = new GarminActive3();
		
		Clock yourWatch;

		yourWatch = new GalaxyGear4();
		
		// 인터페이스 타입의 배열
		Clock[] clocks = new Clock[2];
		clocks[0] =  new GarminActive3();
		clocks[1] =  new GalaxyGear4();
		
		for(Clock clock : clocks) {
			clock.displayTime();
		}

	}

}
