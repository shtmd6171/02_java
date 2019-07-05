package type.casting;

public class TypeCastingTest {

	/*
	 * 숫자형 데이터 사이에
	 * 형 변환을 테스트하는 클래스
	 */
	
	public static void main(String[] args) {
		
		double pi = 3.1415926535797;
		int num = 100;
		int result = num + (int)pi;
		System.out.println("pi : "+pi);
		System.out.println("num :"+num);
		System.out.println("result :"+result);
		
		byte buffer = (byte)result;
		System.out.println("result :"+result);
		System.out.println("byte :"+buffer);
	}

}
