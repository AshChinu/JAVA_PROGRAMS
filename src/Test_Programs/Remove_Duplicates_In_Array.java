package Test_Programs;

public class Remove_Duplicates_In_Array 
{
	
	public static int removeDuplicates(int arr[],int n)
	{
	
		if (n==0 || n==1)
		{
			return n;
		}
		int[] temp = new int[n];
		int j=0;
		for (int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
	// Changing to Original Array
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
        return j;
	}
 
	public static void main(String[] args)
	{
		
		int arr[] = {1,1,2,2,3,3,4,4,5,5};
		int length = arr.length;
		length = removeDuplicates(arr,length);
		for(int i=0;i<length;i++)
		System.out.print(arr[i]+" ");
		
	}
}

// Result: 1 2 3 4 5 












