package car;

import java.util.Scanner;


public class Power{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Power test = new Power();

		System.out.println("a^n일 때, 밑(a)과 지수(n)를 각각 입력하세요");
		int result = test.fastPower(sc.nextInt(), sc.nextInt());
		System.out.println("제곱 값 : "+ result);

	}
	
	public int fastPower(int base, int expo) {
		int sum = base;
		if (expo % 2 == 0) {
			for (int sco = 1; sco < (expo / 2); sco++) {
				base *= base;
			}
			sum = base * base;

		} else {
			for (int sco = 1; sco < expo; sco++) {
				sum *= base;
			}
		}
		return sum;

	}

}
