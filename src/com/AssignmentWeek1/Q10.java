package com.AssignmentWeek1;

public class Q10 {
	
	public static void main(String[] args) {
		
		int rajGarden_Length = 15;
		int rajGarden_Breadth = 10;
		int rajGarden_Area = rajGarden_Length * rajGarden_Breadth;
		System.out.println("The total area of Raj's Garden is: "+rajGarden_Area+" sq.m");
		
		int vamshiGarden_Length = 12;
		int vamshiGarden_Breadth = 12;
		int vamshiGarden_Area = vamshiGarden_Length * vamshiGarden_Breadth;
		System.out.println("The total area of Vamshi's Garden is: "+vamshiGarden_Area+" sq.m");
		System.out.println();
		
		if(rajGarden_Area > vamshiGarden_Area)
		{
			System.out.println("Raj's garden is larger");
		}
		else
		{
			System.out.println("Vamshi's garden is larger");
		}
		
	}

}
