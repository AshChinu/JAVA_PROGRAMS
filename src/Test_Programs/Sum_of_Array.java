package Test_Programs;

public class Sum_of_Array 
{
	public static void main(String[] args)
	{
		
		// Initialize Array
		int[] arr = new int[] {1,2,3,4};
		int sum = 0;
		
		// Loop through the Array to calculate Sum of Elements
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
         System.out.println("Sum of all Elements in Array: "+sum);
         
	}
}

// Result:- Sum of all Elements in Array: 10