package Test_Programs;

public class Fibonacci_Seriese
{
	public static void main(String[] args)
	{
		int a=0, b=1, c=0;
		System.out.print(a+" "+b);
		for (int i=2;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}

// Answer is:- ( 0 1 1 2 3 5 8 13 21 34 )
