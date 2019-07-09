package control.swtchstmt;

import java.util.Scanner;

public class ReportGrade {

	public static void main(String[] args) {
		
		int score = 0;
		char grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		score = sc.nextInt();
		
		switch (score / 10) 
		{
		
		case 9 :
			grade = 'A';
			break;

		case 8 :
			grade = 'B';
			break;

		case 7 :
			grade = 'C';
			break;

		case 5 :
			grade = 'D';
			break;
			
		default :
			grade = 'F';
			break;
		}
		
		System.out.println("grade : " + grade);





	

	}

}
