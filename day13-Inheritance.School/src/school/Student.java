package school;

/*
 * 학교 시스템에서
 * 학새의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * 
 */

public class Student extends Person {
	
	//1. 멤버변수 선언부

	private String major;
	
	public Student() {		
	}
	
	public Student(String major) {
		this.major = major;	
	}
	
	public Student(String id, String name, int age, String major) {
		super(id,name,age);
		//this(major);  super(), tihs()는 생성자 선언 첫 줄에 한번만 등장 가능
		// super() or this() 하나만 사용 가능
		this.major = major;
	}
	
	//3. 메소드 선언부
	// (1) toString() 재정의 : 학생에 맞도록
	
	@Override
	public String toString() {
		String stdStr = String.format(", 전공 : %s",major);
		return String.format("학생정보[%s%s]",super.toString(),stdStr);	
	}
	

	
	
	
}
