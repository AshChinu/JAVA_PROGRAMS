package Test_Programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		int org_num = num;
		int rev=0;
		
		while (num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_num==rev)
		{
			System.out.println(org_num+"  Palindrome Number");
		}
		else
		{
			System.out.println(org_num+" Not Palindrome Number");
		}
	}

}
