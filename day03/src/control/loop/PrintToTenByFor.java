package control.loop;

public class PrintToTenByFor {

	public static void main(String[] args) {
		
		for(int idx = 1; idx <= 10; idx++)
			System.out.printf("%d\t",idx);
		
		System.out.println();
		
		for(int idx = 10; idx >= 1; idx--)
			System.out.printf("%d\t",idx);
		
		final int FROM = 1;
		final int TO = 10;
		
		System.out.println();
		
		for(int idx = FROM; idx <= TO; idx++)
			System.out.printf("%d\t",idx);
		
		System.out.println();
		
		for(int idx = TO; idx >= FROM; idx--)
			System.out.printf("%d\t",idx);
		
		System.out.println();
		
		for(int idx = FROM ; idx <= TO; idx++)
			System.out.printf("%d\t",idx-1);
		

	}

}
