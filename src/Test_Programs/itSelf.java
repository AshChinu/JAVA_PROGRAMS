package Test_Programs;

public class itSelf
{
	public static void main(String[] args) 
	{
		itSelf r = new itSelf();
		int a=r.sum(5);
		System.out.println("SUm of Natural Numbers is : "+a);
	}
	int sum (int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}
}
