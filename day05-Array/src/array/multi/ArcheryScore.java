package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0;
		int select = 0;
		System.out.println("양궁 선수 점수 입력");
		for (int idx = 0; idx < score.length; idx++) {
			System.out.print(idx + 1 + "번 째 선수 점수 입력 : ");
			for (int plyr = 0; plyr < score[idx].length; plyr++) {
				score[idx][plyr] = sc.nextInt();
				continue;
			}
		}

		System.out.print("우승 선수는 ");
		for (int idx = 0; idx < score.length; idx++) {
			for (int plyr = 0; plyr < score[idx].length; plyr++) {
				sum[idx] += score[idx][plyr];
			}
		}
		
		for (int idx = 0; idx < score.length; idx++) {
				if(max < sum[idx]) 
				{
					max = sum[idx];
					select = idx;
				}
		}
		System.out.printf("%d번 째 선수 (%d점)",select+1,max);
		
	}
}
