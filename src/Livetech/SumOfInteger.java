package Livetech;

import java.util.Scanner;

public class SumOfInteger {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Please enter a number");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int sum=0;
		
		while (num>0) {
			
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum of all the digits is: "+sum);
		
	}

}
