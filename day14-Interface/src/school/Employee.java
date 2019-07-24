package school;
 

// dept : String : 소속부서 이름

public class Employee extends Person implements Attendance {

	// 1. 멤버변수 선언부
	private String dept;
	
	// 2. 생성자 선언부
	public Employee() {
		
	}
	
	public Employee(String dept) {
		this.dept = dept;
	}
	
	public Employee(String id, String name, int age,String dept) {
		super(id,name,age);
		this.dept = dept;
	}
	
	// 3. 메소드 선언부
	
	@Override
	public String toString() {
		String empStr = String.format(", 부서 : %s",dept);
		return String.format("직원정보[%s%s]",super.toString(),empStr);	
	}

	@Override
	public String attend() {
		// 직원[아이디]이(가) 출근 하였습니다.
		return String.format("직원[%s]이(가) 부서[%s]에 출근하였습니다.",this.getId(),dept);
	}

}
