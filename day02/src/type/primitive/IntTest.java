package type.primitive;

import java.util.*;
public class IntTest 
{

	public static void main(String[] args) 
	{

	   Scanner sc = new Scanner(System.in);
	   char[] Array = new char[20];
	   String line;
	   String ll = "";
	   System.out.print("input : ");

	   line = sc.nextLine();

	   for(int i=0; i<line.length(); i++)
	  {
			Array [i] = line.charAt(i);
			ll += Array[i];
	    	System.out.println(ll.toLowerCase());
	  }
	   for(int i=line.length(); i>=0; i--)
	  {
		   for(int j =0; j < i-1; j++) 
		   {
		   System.out.print(Array[j]);
		   }
		   System.out.println("");
	  }
   }
}
