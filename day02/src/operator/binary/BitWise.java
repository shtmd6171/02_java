package operator.binary;

public class BitWise {
	/*
	 * 비트 연산을 수행하는 연산자를 테스트
	 * &,|,^  :  비트연산자. 논리연산이 아님을 주의
	 *           이항연산자
	 * ~      :  비트연산자 : 각 비트를 0 ->1, 1 -> 0으로 변경
	 *           단항연산자
	 * 
	 */
	
	public static void main(String[] args)
	{
		int a = 0x1f05;
		int b = 0x31a1;
		
		System.out.printf("%x & %x = %x%n", a, b, (a & b));
		System.out.printf("%x | %x = %x%n", a, b, (a | b));
		System.out.printf("%x ^ %x = %x%n", a, b, (a ^ b));
		System.out.printf("~%x = %x%n", a, ~a);
		
	}

}
