package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		int time, stage, count = 0;
		
		for(stage = 1; stage < 9; stage++)
		{
			System.out.printf("\t%8d단",stage+1);	
		}
		System.out.println("\n");
		for (stage = 1; stage <= 9; stage++) {
			for (time = 2; time <= 9; time++) {
				System.out.printf("\t");	
				System.out.printf("%5d x %d = %d", time, stage, (time * stage));
				count++;
				if (count % 8 == 0) {
					System.out.println("\n");
				}
			}
		}

	}

}
