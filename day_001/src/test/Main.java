package test;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Work shared = new Work();
		
		int MAX = 0; 
		System.out.print("Enter Max Value: ");
		Scanner x = new Scanner(System.in);
		MAX = x.nextInt();
		
		shared.calculate(MAX);

		A threadA = new A(shared);
		B threadB = new B(shared);
		
		threadA.start();
		threadB.start();
		try {
			threadA.join();
			threadB.join();			
		}catch(InterruptedException e)
		{			
		}
		System.out.println("��� = " + shared.Count);
	}

}
