package Livetech;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int a[]=new int[6];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		System.out.println(a.length);
		
		int i=a.length-1;
		while (i>=0)
		{
			System.out.println(a[i]);
			i-=2;
			
		}
		
		
		
		
	}

}
