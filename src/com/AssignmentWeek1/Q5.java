package com.AssignmentWeek1;

import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the wall");
		int length_Of_The_Wall = sc.nextInt();
		
		System.out.println("The length of the wall is: "+length_Of_The_Wall+"m");
		System.out.println();
		
		System.out.println("Enter the breadth of the wall");
		double breadth_Of_The_Wall = sc.nextDouble();
		
		System.out.println("The breadth of the wall is: "+breadth_Of_The_Wall+"m");
		System.out.println();
		
		double area_Of_The_Wall = length_Of_The_Wall * breadth_Of_The_Wall;		
		System.out.println("The total area of the wall is: "+area_Of_The_Wall+"sq.m");
		System.out.println();
		
		System.out.println("Enter the painting cost per sq metre");
		int painting_Cost_Per_Sq_Metre = sc.nextInt();
		
		System.out.println("The cost of painting per square metre is: $"+painting_Cost_Per_Sq_Metre);
		System.out.println();
		
		double totalCost = painting_Cost_Per_Sq_Metre * area_Of_The_Wall;
		System.out.println("The total cost for painting is $"+totalCost);
		
	}

}
