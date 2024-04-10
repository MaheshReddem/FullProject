package Livetech;

public class BreakStatementUsingWhile {
	
	public static void main(String[] args) {
		
		
		int i=1;
		
		while (i<=10) {
			
			System.out.println("My value is: "+i);
			
			if(i==3)
			{
				break;
			}
			i++;
			
		}
	}
}
