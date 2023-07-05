package Test_Programs;
import java.util.Scanner;
public class Palindrome_String
{
	public static void main(String[] args) 
	{
		String x,y="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String You Want to Check: ");
		x = sc.nextLine();
		int l = x.length();
		for (int k=l-1;k>=0;k--)
		{
			y = y+x.charAt(k);
		}
        if(x.equalsIgnoreCase(y))
        {
        	System.out.println("The String is Palindrome...");
        }
        else
        {
        	System.out.println("The String is Not a Palindrome...");
        }
	}   
}
