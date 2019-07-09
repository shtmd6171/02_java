package control.ifstmt;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double weight =0, height = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("몸무게 입력");
		weight = sc.nextDouble();
		System.out.println("키 입력 ");
		height = sc.nextDouble();
		height = height / 100;
		double bmi = weight / (height * height);
		
		if(bmi < 15)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("병적인 체중");
		}
		else if(bmi >= 15 && bmi < 18.5)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("저체중");
		}
		else if(bmi >= 18.5 && bmi < 23)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("정상");
		}
		else if(bmi >= 23 && bmi < 27.5)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("과체중");
		}
		else if(bmi > 27.5 && bmi <= 40)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("비만");
		}
		else if(bmi > 40)
		{
			System.out.printf("bmi : %.2f%n",bmi);
			System.out.println("병적인 비만");
		}
		
		

	
		

	}

}
