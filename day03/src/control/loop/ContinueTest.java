package control.loop;

public class ContinueTest {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int idx = 1; idx <=100; idx++)
		{
			if(idx % 2 == 0)
			{
				continue;
			}
			sum+= idx;
		}	
		System.out.printf("홀수의 합 : %d\n",sum);
		sum = 0;
		//문제 : 1~100 사이의 3의 배수의 합을 구하시오
		for(int idx = 1; idx <=100; idx++)
		{
			if(idx % 3 == 0 )
			sum+= idx;
		}
		System.out.printf("3의 배수의 합 : %d\n",sum);
	}
	
}
