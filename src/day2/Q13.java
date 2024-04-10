package day2;

import java.util.Scanner;

public class Q13 {
	
	public static void main(String[] args) {
		
		int length;
		System.out.println("Enter the length of the rectangle");
		Scanner sc = new Scanner(System.in);
		length=sc.nextInt();
		
		System.out.println("Enter the width of the rectanlge");
		int width = sc.nextInt();
		
		
		int area = length * width;
		System.out.println("The area of the rectangle is: "+area);
		
	}

}
