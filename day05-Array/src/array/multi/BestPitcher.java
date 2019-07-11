package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;

		System.out.println("1~5선발 방어율 입력");
		for (int team = 0; team < ERA.length; team ++) {
			System.out.print(team + 1 + "번 째 팀 1~5 선발 투수 방어율 ");
			for (int plyr = 0; plyr < ERA[team].length; plyr++) {
				ERA[team][plyr] = sc.nextDouble();
				continue;
			}

		}
		System.out.print("최고의 투수는 ");
		for (int team = 0; team < ERA.length; team++) {
			for (int plyr = 0; plyr < ERA[team].length; plyr++) {
				if (min > ERA[team][plyr]) {

					min = ERA[team][plyr];
				}
			}
		}
		System.out.printf("방어율 %.2f입니다.", min);
	}
}

