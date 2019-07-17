package snack;


public class OreoTest {

	public static void main(String[] args) {
		Oreo[] oreobox = new Oreo[3];
		
		oreobox[0] = new Oreo("딸기",1.5,0.8);
		oreobox[1] = new Oreo("바닐라",1.5,0.8);
		oreobox[2] = new Oreo("초코",1.5,0.8);
		
		for(Oreo oreo : oreobox) {
			oreo.print();
		}
		

		for(int count = 0; count <oreobox.length; count++) {
		oreobox[count].changeCream ("바닐라");
		}
		
		for(Oreo oreo : oreobox) {
			oreo.print();
		}
		
		
		

	}

}
