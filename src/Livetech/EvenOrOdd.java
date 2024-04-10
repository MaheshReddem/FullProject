package Livetech;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("This is an even number");	
		}
		else
		{
			System.out.println("This is an odd number");
		}
		
	}

}
