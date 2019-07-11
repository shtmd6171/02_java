package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] era = new double[3][5];
		double min = 10.0;
		int thteam = 0, thplyr = 0;

		System.out.println("1~5선발 방어율 입력");
		for (int team = 0; team < era.length; team ++) {
			System.out.print(team + 1 + "번 째 팀 1~5 선발 투수 방어율 ");
			for (int plyr = 0; plyr < era[team].length; plyr++) {
				era[team][plyr] = sc.nextDouble();
				continue;
			}

		}
		System.out.print("최고의 투수는 ");
		for (int team = 0; team < era.length; team++) {
			for (int plyr = 0; plyr < era[team].length; plyr++) {
				if (min > era[team][plyr]) {
					min = era[team][plyr];
					thteam = team;
					thplyr = plyr;
				}
			}
		}
		System.out.printf("%d팀의 %d번 째 투수 방어율 %.2f입니다.",thteam+1,thplyr+1, min);
	}
}

