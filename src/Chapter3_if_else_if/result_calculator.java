package Chapter3_if_else_if;

import java.util.Scanner;

public class result_calculator {

	public static void main (String[]args) {
		
		System.out.println("Input your score");
		//Get result from student
		
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		scanner.close();
		
		if(score>100 || score<0) {
			System.out.print("Invalid");
		}
		else if( score >=80) {
			System.out.print("You got A+");
			
		}
		
		else if(score>=70) {
			
			System.out.println("You got A");
		}
		else if(score>=60) {
			System.out.println("You got A-");
		}
		else if(score>=50) {
			System.out.println("You Got B");
			
		}
		else {
			System.out.println("Retake the course");
		}
	}
}
