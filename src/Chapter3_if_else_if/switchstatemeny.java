package Chapter3_if_else_if;

import java.util.Scanner;

public class switchstatemeny {

	public static void main(String[]args) {
		
		System.out.println("Enter your Grade Point");
		
		Scanner scanner =new Scanner(System.in);
		int score = scanner.nextInt();
		scanner.close();
		
		String message;
		
		switch(score) {
		case 100:
		message ="You got A+";
		break;
		
		case 80:
		message ="You got A+";
		break;
		
		case 70:
		message ="You got A";
		break;
		
		default:
			message="You need to retake";
			break;
		}
		
		System.out.println(message);
		
	}
}
