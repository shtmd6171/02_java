package school;

/*
 * 학교 시스템에서
 * 학새의 정보를 저장하는 클래스
 * 
 * 사람의 공통정보를 담는 클래스인 Person을 상속한다.
 * 
 */

public class Student extends Person implements Lesson, Attendance {
	
	//1. 멤버변수 선언부

	private String major;
	
	public Student() {		
	}
	
	public Student(String major) {
		this.major = major;	
	}
	
	public Student(String id, String name, int age, String major) {
		super(id,name,age);
		//this(major);  super(), this()는 생성자 선언 첫 줄에 한번만 등장 가능
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

	@Override
	public String attend() {
		// 학생[아이디]이(가) 출석하였습니다. 라는 문자열을 리턴
		return String.format("학생[%s]이(가) 출석하였습니다.",this.getId());
	}

	@Override
	public String lesson() {
		// 학생[아이디]이(가) 전공[과목명] 수업을 듣고 있습니다. 라는 문자열 리턴
		return String.format("학생[%s]이(가) 전공[%s] 수업을 듣고 있습니다.",this.getId(),major);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	

	
	
	
}
