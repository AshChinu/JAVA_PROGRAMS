package Test_Programs;

public class Prime_Number_Combo
{	
	public static boolean isPrime(int n) 
	{	
	    if (n<2)
	    {
	    	return false;
	    }
	    
	    for (int i=2; i<=n/2; i++)
	    {
	    	if (n % i ==0)
	    	{
	    		return false;
	    	}
	    }
	    return true;
	}

	public static void main(String[] args) {
		
		// To Check Given No Is Prime or Not
		int n = 19;
		if (isPrime(n))
		{
			System.out.println(n  +" "+ "Is a Prime Number");
		}
		else
		{
			System.out.println(n  +" "+ "Is Not a Prime Number");
		}
	
		
        // Code for Print all Prime Number's between 1 to 100
		 /*    for (int i=1; i<= 100; i++)
		    {
		    	if (isPrime(i))
		    	{
		    		System.out.println(i + " Is a Prime Number");
		    	}
		    }*/	  
	}
}
