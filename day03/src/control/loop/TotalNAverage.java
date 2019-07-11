package control.loop;

import java.util.Scanner;

public class TotalNAverage {

	public static void main(String[] args) {
		int total = 0, score = 0, count = 0;

		double average = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력(끝내려면 0 입력) ");
		do {
			total += score;
			score = sc.nextInt();
			count++;
		} while (score != 0);

		if (count == 0) {
			System.out.println("입력된 값이 없습니다");
		} else {
			average = (double) total / count;
		}
		System.out.println();
		System.out.printf("총점 : %d | ", total);
		System.out.printf("평균 : %5.2f%n ", average);

	}

}














