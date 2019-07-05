package type.primitive;

public class CharTestOne {
	
	public static void main (String[] args)
	{
		char ch = 'a';
		int int1;
		
		int1 = ch;
		System.out.println("int1 = " + int1);
		System.out.println("ch = " + ch);
		
		int1 = int1 + 1;
		System.out.println("int1 = " + int1);
		System.out.println("(char)" + int1 + "=" + (char)int1);
		
	}


}
