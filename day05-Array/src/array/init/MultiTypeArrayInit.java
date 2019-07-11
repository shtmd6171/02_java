package array.init;

public class MultiTypeArrayInit {

	public static void main(String[] args) {
		final int SIZE = 5;
		
		boolean[] flags = new boolean[SIZE];
		int[] ages = new int[SIZE];
		double[] heights = new double[SIZE];
		String[] names = new String[SIZE];
		
		System.out.println("(1) boolean 배열 출력");
		for(boolean flag : flags ){
			System.out.printf("flag=%b%n", flag);
		}
		
		System.out.println("(2) int 배열 출력");
		for(int age : ages ){
			System.out.printf("flag=%d%n", age);
		}
		
		System.out.println("(3) double 배열 출력");
		for(double height : heights ){
			System.out.printf("flag=%f%n", height);
		}
		
		System.out.println("(4) String 배열 출력");
		for(String name : names ){
			System.out.printf("flag=%s%n", name);
		}



	}

}
