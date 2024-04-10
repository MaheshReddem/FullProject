package Livetech;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1 = sc.nextInt(); //+ - * /
		
		System.out.println("Please enter second number");
		int num2 = sc.nextInt();
		
		System.out.println("Please enter the operation");
		int choice = sc.nextInt();
		
		int result=0;
		
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("The result is: "+result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("The result is: "+result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("The result is: "+result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println("The result is: "+result);
			break;

			
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}

}
