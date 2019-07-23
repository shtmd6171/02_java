package product;

public class ProductTest {

	public static void main(String[] args) {
		
		Product product1 = new Product("p001","금성",1000,2);
		
		product1.print();
		
		product1.discount(20);
		
		product1.print();
		

	}

}
