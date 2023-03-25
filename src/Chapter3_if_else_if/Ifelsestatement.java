package Chapter3_if_else_if;

import java.util.Scanner;

/*
All selse people expected to sell 10 coffee
Who sell 10 coffee get congratulate
Who cant sell the asked how many sell they short

*/

public class Ifelsestatement {
	
	public static void main(String[] args) {
		
		//initilize value we know
		int quota =10;
		
		//get input from user how many sells you made
		
		System.out.println("Enter the number of selse you made");
		Scanner scanner = new Scanner(System.in);
		int sell= scanner.nextInt();
		scanner.close();
		
		if(sell >= quota) {
			
			System.out.println("Conratulation");
		}
		else {
			int selsesort = quota-sell;
			System.out.println("You disnt make your quata you have "+selsesort+" Total selse sort");
		}
		
	}

}
