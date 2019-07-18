package marker;

public class MakerTest {

	public static void main(String[] args) {
		Maker maker = new Maker(100,true,true,"검정");
		Maker maker2 = new Maker(100,true,true,"노랑");
		Maker maker3 = new Maker(100,true,true,"파랑");
		
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
		System.out.println();
		maker2.print();	
		System.out.println();
		maker3.print();	

	}

}
