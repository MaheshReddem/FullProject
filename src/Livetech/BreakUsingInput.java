package Livetech;

import java.util.Scanner;

public class BreakUsingInput {
	
	public static void main(String[] args) {
		
		int x;
		Scanner sc=new Scanner(System.in);
		
		for(;;)
		{
			System.out.println("Enter 0 to stop");
			x=sc.nextInt();
			if(x==0)
			{
				break;
			}
		}
		
	}

}
