package Livetech;

import java.util.Scanner;

public class WhileWithIf {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("Enter a number to check if it is even or odd");
			int a=sc.nextInt();
			
			if(a%2==0)
			{
				System.out.println("Your number is even");
				System.out.println();
			}
			else
			{
				System.out.println("Your number is odd");
				System.out.println();
			}
			System.out.println("Want to check more 1 for YES and 0 for NO");
			System.out.println();
			choice=sc.nextInt();
			
		}
		System.out.println("I hope you checked all your inputs");
	}

}
