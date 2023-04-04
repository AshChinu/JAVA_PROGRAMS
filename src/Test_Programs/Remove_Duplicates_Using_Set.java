package Test_Programs;

import java.util.LinkedHashSet;

public class Remove_Duplicates_Using_Set
{
	public static void removeDuplicate(int[] arr) 
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		// Adding Elements to LinkedHashSet
		for (int i=0;i<arr.length;i++)
		set.add(arr[i]);
		
		// Print the Elements of LinkedHashSet
		System.out.print(set);	
	}
        // Driver code
	public static void main(String[] args)
	{
		int arr[] = {1,1,2,2,3,3,4,4,5,5};
		// Function Call
		removeDuplicate(arr);	
	}
}

// Result : [1, 2, 3, 4, 5]




