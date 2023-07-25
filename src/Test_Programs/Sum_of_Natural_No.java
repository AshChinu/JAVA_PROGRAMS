package Test_Programs;

public class Sum_of_Natural_No
{
	public static void main(String[] args) 
	{
		Sum_of_Natural_No r = new Sum_of_Natural_No();
		int a=r.sum(2);
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
