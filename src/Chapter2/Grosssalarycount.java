package Chapter2;

import java.util.Scanner;

public class Grosssalarycount {
	
	public static void main(String args[]) {
		
		//1. Get input number of hours
		System.out.println("Enter the hours:");
		Scanner scanner = new Scanner(System.in);
		int hours= scanner.nextInt();
		
		//2. get hourlay pay rate
		System.out.println("Enter the hourly rate");
		double rate= scanner.nextDouble();
		
		//3.Gross payment
		
		double total=hours*rate;
		System.out.println("Gross Salaray: $"+total);
		
	}

}
