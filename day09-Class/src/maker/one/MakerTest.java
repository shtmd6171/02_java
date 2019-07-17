package maker.one;

public class MakerTest {

	public static void main(String[] args) {
		Maker maker = new Maker(100,true,true,"검정");
		
		maker.print();
		System.out.println();
		
		maker.use();
		System.out.println();
		
		maker.write();
		maker.write();
		maker.newStatus();
		System.out.println();
		
		maker.print();
		System.out.println();
		
		maker.lidclose();
		maker.print();
			

	}

}
