package Test_Programs;

import java.util.Arrays;

public class Segrigate_All_0_and_1_in_Left_Right {

	public static void main(String[] args)
	{
		int nums[]= {0,0,1,0,1,0,1,0,0,1,1};
		int i, nums_size = nums.length;
		int left = 0, right = nums_size-1;
		System.out.println("Original Array : "+Arrays.toString(nums));
		
		while(left < right)
		{
			while (nums[left]==0 && left<right)
				left++;
			while (nums[right]==1 && left<right)
				right--;
			
			if (left < right)
			{
				nums[left]=0;
				nums[right]=1;
				left++;
				right--;
			}
		}
		System.out.println("Array after segration is : "+Arrays.toString(nums));

	}

}
