package Chapter3_if_else_if;

import java.util.Scanner;

/*
 * Nested if
 * A man must make 20000 to get loan
 * have been working at their current company for at least 2 years
 */

public class Nestedif {
	
	public static void main(String[] args) {
		int currentsalaary =20000;
		int minimumyears = 2;
		
		//get input from user
		System.out.println("Enrer your current salary");
		Scanner scanner =new Scanner(System.in);
		double salary = scanner.nextDouble();
		
		System.out.println("Enrer your current woeking years");
		int years = scanner.nextInt();
		scanner.close();
		
		//nested if decision making
		
		if(currentsalaary <= salary) {
			if(minimumyears <= years) {
				System.out.println("You are eligable for loan");
			}
			else {
				System.out.println("Sorry You are not eligable for loan your current woeking years should be "+minimumyears+"years");
			}
				
		}
		else {
			System.out.println("Sorry You are not eligable for loan your  your current salary should be "+currentsalaary);
			
		}
		
	}

}
