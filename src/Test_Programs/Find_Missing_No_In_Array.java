package Test_Programs;

public class Find_Missing_No_In_Array 
{
	public static void findMissingArray(int arr[], int N) 
	{
		int i;
		int[] temp = new int[N+1];
		for (i=0;i<=N;i++)
		{
			temp[i] = 0;
		}
		for (i=0;i<N;i++)
		{
			temp[arr[i]-1]=1;
		}
		int ans=0;
		for (i=0;i<=N;i++)
		{
			if(temp[i]==0)
				ans=i+1;
		}
		System.out.println(ans);
	}
	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = {1,2,4,5};
		int n = arr.length;
		// Function Call
		findMissingArray(arr, n);
	}

}

// Result is:- 3


