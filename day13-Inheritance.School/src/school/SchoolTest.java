package school;

/*
 * 학교 시스템을 테스트하는 클래스
 * -------------------------------
 * Person과 상속관계인
 * Student, Employee, Teacher 
 * 를 테스트하는 클래스
 */
public class SchoolTest {

	public static void main(String[] args) {
		// 1. 선언
		// Person 배열타입의 변수 persons를 선언
		Person[] persons;
		       	
		// 2. 초기화
		// (1) persons를 3 사이즈로 생성
		persons = new Person[3];
		
		// (2) persons 배열의 각각 0~2 인덱스에
		//     [0] : Student  : id=S01, name=홍길동, age=18 major=도술
		//	   [1] : Teacher  : id=T01, name=정약용, age=32 subject=실학
		//	   [2] : Employee : id=E01, name=허균  , age=48 dept=문학예술지원부
		persons[0] = new Student ("S01","홍길동",18,"도술");
		persons[1] = new Teacher ("T01","정약용",32,"실학");
		persons[2] = new Employee("E01","허균  ",48,"문학예술지원부");
		
		// 3. 사용
		// foreach를 사용하여 persons 배열의 각 엘리먼트에 대하여
		// print()메소드 호출
		
		for(Person person : persons) {
			person.print();
		}
	}

}
