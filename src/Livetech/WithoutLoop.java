package Livetech;

public class WithoutLoop {
	
	public static void withOutLoop(int n)
	{
		if(n<=10)
		{
			System.out.println(n);
			withOutLoop(n+1);
		}
	}
	
	public static void main(String[] args)
	{
		withOutLoop(0);

	}

}
