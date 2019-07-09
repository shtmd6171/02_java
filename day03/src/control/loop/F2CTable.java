package control.loop;

public class F2CTable {

	public static void main(String[] args) {
		double f = 0, c = 0;
		
			for(int count= 0; count <=10; count++)
			{
			f = count * 10;
			c = (f-32) / 1.8;
			System.out.printf("%.1f = %.1f\n",f,c);
			}

	}

}
