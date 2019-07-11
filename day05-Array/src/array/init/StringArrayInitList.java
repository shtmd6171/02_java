package array.init;

public class StringArrayInitList {

	/*
	 * 참조형 타입인 string 타입의 배열 students를 초기화 목록을 사용하여 초기화하고 내용을 출력해보는 테스트 클래스
	 */
	public static void main(String[] args) {
		String[] students = { "정하은", "최현정", "김지후", "정현수" };

		for (int idx = 0; idx < students.length; idx++) {

			System.out.println("학생의 이름 = " + students[idx]);
		}

	}

}
