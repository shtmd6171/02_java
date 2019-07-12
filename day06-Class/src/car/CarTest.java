package car;

public class CarTest {

	/*
	 * Car라는 타입의 실체 객체를 생성하여 사용하는 클래스
	 */

	public static void main(String[] args) {
		// Car라는 타입의 객체를 사용하기 위한 참조 변수가 필요함

		// 초기화
		Car mycar = new Car(70);
		
		// 사용 : car 라는 타입에 정의돈 메소드 호출
		System.out.print("1. myCar의 초기화 후 속도\n");
		mycar.print();
		
		System.out.print("2. 60만큼 가속 후 속도\n");
		mycar.accelerate(60);
		mycar.print();
		
		System.out.print("3. 20만큼 추가 가속 후 속도\n");
		mycar.accelerate(20);
		mycar.print();
		
		System.out.print("4. 정지 후 속도\n");
		mycar.stop();
		mycar.print();
		

	}

}