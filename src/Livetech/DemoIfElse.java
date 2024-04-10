package Livetech;

import java.util.*;

public class DemoIfElse {
	
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the age");
		age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Age is greater than 18");
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Age is less than 18");
			System.out.println("Not eligible for vote");
		}
		
	}

}
