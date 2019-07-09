package control.loop;

public class SumOfEvens {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		
		while(num <= 100) {
			if(num%2 == 0) {
				sum += num;
			}
			num++;
		}
		System.out.printf("1부터 100사이 짝수의 합은 %d입니다.\n",sum);

	}

}
