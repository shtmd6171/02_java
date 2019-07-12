package car;

/*
 * Car라는 타입을 정의(선언)하는 클래스
 * 
 * Car는 자바가 기본 제공하는 타입이 아님
 * (기본 제공 타입은? : String, Scanner ...)
 * 
 * 클래스 디자인 할 때는 추상화 작업이 필요
 *
 * 속성 : 현재의 속도 (변수)_
 * 기능 : 가속, 정지 (메소드)
 * 
 */

public class Car {
	// 1. 멤버 변수 : 상태(현재 속도) 저장을 위한 선언
	int velocity;
	
	// 2. 생성자 선언 : 초기화를 위한 선언
	// 생략 가능
	
	Car(){}
	
	Car(int velocity) {
		this.velocity = velocity;
	}
	
	// 3. 메소드 선언 : 사용을 위한 선언
	// (1) 가속 기능 : 가속된 결과 현재 속도가 얼마인지 리턴
	public int accelerate(int value) {
		velocity += value;
		return velocity;
	}
	
	// (2) 정지 기능 : 속도를 완전히 0으로 설정
	public void stop() {
		velocity = 0;
	}
	
	// (3) 차의 상태(속도)를 알기 위한 출력
	public void print() {
		System.out.printf("이 차의 현재 속도: %d km/h \n",velocity);
	}

}








