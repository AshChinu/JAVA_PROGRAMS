package Test_Programs;
import java.util.Arrays;

public class Sort_The_Array 

{
	public static void main(String[] args)
	{
	
		int [] array = {98,25,35,22,1,5,6,2,89};
		Arrays.sort(array);
		System.out.printf("Modified Array[]:%s" ,Arrays.toString(array));
	
	}

}

// Result : Modified Array[]:[1, 2, 5, 6, 22, 25, 35, 89, 98]