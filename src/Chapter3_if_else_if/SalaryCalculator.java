package Chapter3_if_else_if;

import java.util.Scanner;

/*
If statement
Gross salary 10000
If he extra sale minimum 10 will get 1000 bonus
 */

public class SalaryCalculator {

	public static void main(String[] args) {
		
		int salary = 10000;
		int bonus = 1000;
		
		//Get input from user how many sell he done
		System.out.println("Number of sell");
		Scanner scanner = new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
		//if condition
		
		if(sales > 10) {
			
			salary = salary + bonus;
			System.out.println("Total salary: "+salary);
		}
		else {
			System.out.println("Total salary: "+salary);
		}
		

	}

}
