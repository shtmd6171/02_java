package control.loop;

public class NineNineTable {

	public static void main(String[] args) {
		

		for (int stage = 2; stage < 10; stage ++) {			
			System.out.printf("%n%d 단%n",stage);
			
			for(int time = 1; time < 10; time ++) {
				System.out.printf("%d x %d = %2d\n",stage, time, (stage * time));
			}		
		}		
	}
}
