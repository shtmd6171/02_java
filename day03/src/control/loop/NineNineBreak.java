package control.loop;

public class NineNineBreak {

	public static void main(String[] args) {
		
		
		OUT :for (int stage = 2; stage < 10; stage ++) {
			
			System.out.printf("%n%d 단%n",stage);
			
			IN :for(int time = 1; time < 10; time ++) {
				if(stage * time > 50)
				{
					break OUT;
				}
				System.out.printf("%d x %d = %2d\n",stage, time, (stage * time));
				
			
			}
		}
		
		System.out.println();
		System.out.println();

	}

}
