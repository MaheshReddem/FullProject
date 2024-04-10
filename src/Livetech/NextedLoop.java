package Livetech;

public class NextedLoop {
	
	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=10;i<=15;i++)
		{
			System.out.println("Table of: "+i);
			
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
	}

}
