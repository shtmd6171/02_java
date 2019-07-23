package school;

public class Teacher extends Person {
	
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
	

}
