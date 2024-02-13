package Test_Programs;

public class Calculate_Sum_of_Digits_in_Number {

	public static void main(String[] args) 
	{
		int num = 1234,
			sum = 0;
		//loop to find sum of digits
		while(num!=0)
		{
			sum += num % 10;
			num = num / 10;
		}

		//output
		System.out.println ("Sum of digits : " + sum);
	}
	// Sum of digits : 10
}
