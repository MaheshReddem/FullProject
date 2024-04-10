package com.AssignmentWeek1;

import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length");
		int length_Of_A_Rectangular_Park=sc.nextInt();
		
		System.out.println("Enter breadth");
		int breadth_Of_A_Rectangular_Park=sc.nextInt();
		
		int area_Of_The_Rectangular_Park = length_Of_A_Rectangular_Park * breadth_Of_A_Rectangular_Park;
		
		System.out.println("Area of the rectangular park is: "+area_Of_The_Rectangular_Park+" sq.m");
		
	}

}
