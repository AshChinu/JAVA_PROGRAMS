package Test_Programs;
import java.util.Scanner;

public class Count_No_Of_Letters_in_a_String
{
	public static int countLetters(String str) 
	{
		int count = 0;
		// Loop through each character in the string
		for (char c : str.toCharArray())
		{
			// Check if the character is a letter (using Character.isLetter() method)
			if (Character.isLetter(c)) 
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		// Close the Scanner object to release resources
		scanner.close();

		int letterCount = countLetters(input);
		System.out.println("Number of letters in the string: " + letterCount);
	}	
}
