package array.basic;

public class MultiDarray {

	public static void main(String[] args) {
		char stars[][];
		
		stars = new char[6][];

		for(int idx = 0; idx<stars.length-1; idx++)
		{
			for(int idx2 = 0; idx2 <=idx; idx2++)
			{
				stars[idx] = new char[idx2];
			}
		}
		
		for(int idx = 0; idx<stars.length-1; idx++)
		{
			for(int idx2 = 0; idx2 <stars[idx].length-1; idx2++)
			{
				stars[idx][idx2] = '★';
			}
		}

		
		for(int idx = 0; idx <stars.length-1; idx++)
		{
			for(int idx2 = 0; idx2 <stars[idx].length-1; idx2++)
			{
				System.out.println(stars[idx][idx2]);
			}
		}
	}

}
