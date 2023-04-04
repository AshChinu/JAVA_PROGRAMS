package Test_Programs;

import java.util.Arrays;

public class Second_Largest_No_In_Array
{
	public static void main(String[] args)
	{
		int array[] = {1,2,3,4,5,6,7,8,9};
		Arrays.sort(array);
		System.out.println("First Highest Element in the Array is = "+array[array.length-1]);
		System.out.println("Second Highest Element in the Array is = "+array[array.length-2]);
	}
}

// Result = First Highest Element in the Array is = 9
//        = Second Highest Element in the Array is = 8