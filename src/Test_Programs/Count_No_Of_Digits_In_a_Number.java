package Test_Programs;

public class Count_No_Of_Digits_In_a_Number {

	public static void main(String[] args) 
	{
	    int num = 1254961254;
	    int count = 0;
	    while (num>0)
	    {
	    	num=num/10;
	    	count++;
	    }
		System.out.println("Number of Digits is: " +count);
	}

}
