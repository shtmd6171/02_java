package school;

public class Teacher extends Person implements Lesson, Attendance{
	
	// 1. 멤버변수
	private String subject;
	
	// 2. 생성자
	public Teacher() {	
	}
	
	public Teacher(String subject) {
		this.subject = subject;
	}
	
	public Teacher(String id, String name, int age,String subject) {
		super(id,name,age);
		this.subject = subject;
	}
	
	// 3. 메소드
	// (1) toString() 재정의
	@Override
	public String toString() {
		String tcStr = String.format(", 과목 : %s",subject);
		return String.format("교사정보[%s%s]",super.toString(),tcStr);	
	}
	
	@Override
	public String attend() {
		// 교사[아이디]이(가) 출근하였습니다. 라는 문자열을 리턴
		return String.format("교사[%s]이(가) 출근하였습니다.",this.getId());
	}

	@Override
	public String lesson() {
		// 교사[아이디]이(가) 전공[과목명] 수업을 하고 있습니다. 라는 문자열 리턴
		return String.format("교사[%s]이(가) 전공[%s] 수업을 하고 있습니다.",this.getId(),subject);
		
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	

}
