package day2;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the first string");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		
		System.out.println("Enter the second string");
		String str2=sc.next();
		
		System.out.println("Enter the third string");
		String str3=sc.next();
		
		String resStr=str1.concat(str2).concat(str3);
		
		System.out.println(resStr);
		
	}

}
