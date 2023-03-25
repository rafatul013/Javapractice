package chapter4;

import java.util.Scanner;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime.
 */

public class whilelooop {

	public static void main(String[] args) {
		
		int hourrate=15;
		int maxhours=40;
		
		System.out.println("Enter the hours worked ");
		
		Scanner scanner = new Scanner(System.in);
		
		int hoursworked = scanner.nextInt();
		
		while(hoursworked > maxhours || hoursworked < 1) {
			System.out.println("You provide wrong info ");
			hoursworked = scanner.nextInt();
		}
		scanner.close();
		//calculate gross payment
		int payable=hourrate*hoursworked;
		System.out.println("Your Gross pay in week $"+payable);
		
		

	}

}
