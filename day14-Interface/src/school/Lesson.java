package school;

/*
 * 학교 구성원 중
 * 학생, 교사만 구현할 수 있는
 * 수업을 나타내는 인터페이스
 * 
 */

public interface Lesson {
	
	/*
	 * 수업 진행을 나타내는 문자열을 리턴
	 * public abstarct는 생략해도 자동 지원
	 * @return
	 */
	
	String lesson();

}
