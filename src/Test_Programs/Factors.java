package Test_Programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args)
	{
		int my_input, i;
		Scanner my_scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		my_input = my_scanner.nextInt();
		System.out.println("The factors of " + my_input + " are: ");
		
		for (i=1; i<= my_input; ++i)
		{
			if (my_input % i ==0)
				System.out.println(i + " ");
		}

	}

}
