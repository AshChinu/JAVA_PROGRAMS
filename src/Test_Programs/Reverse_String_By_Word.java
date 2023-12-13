package Test_Programs;

public class Reverse_String_By_Word 
{

	public static void main(String[] args)
	{
		// Predefined input
		String fullName = "Ashwini Mohanty";

		// Split the full name into words
		String[] words = fullName.split(" ");

		// Reverse the order of the words
		StringBuilder reversedName = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) 
		{
			reversedName.append(words[i]);
			if (i > 0)
			{
				reversedName.append(" ");
			}
		}

		// Print the reversed name
		System.out.println("Reversed Name: " + reversedName.toString());
	}

}
