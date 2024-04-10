package day3;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter length");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		System.out.println("Enter width");
		int width = sc.nextInt();
		
		int area = length * width;
		int perimeter = (length + width) * 2;
		
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Length area: "+area);
		System.out.println("Length perimeter: "+perimeter);
		
	}

}
