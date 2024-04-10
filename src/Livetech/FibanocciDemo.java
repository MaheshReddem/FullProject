package Livetech;

import java.util.Scanner;

public class FibanocciDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter n1");
		int n1=sc.nextInt();
		
		System.out.println("Please enter n2");
		int n2=sc.nextInt();
		
		int sum;
		System.out.print(n1+" "+n2);
		
		/*for(int i=0;i<=5;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}*/
		
		int i=0;
		
		while (i<=5) {
			
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			i++;
		}
		
		
		
	}

}
