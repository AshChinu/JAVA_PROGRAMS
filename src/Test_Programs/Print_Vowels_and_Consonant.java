package Test_Programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Print_Vowels_and_Consonant
{
	public static void main(String[] args)
	{
		// declare variables
	      Scanner scan = null;
	      String str = null;
	      Set<Character> vowels = null;
	      Set<Character> consonants = null; 
	      char ch = '\0';

	      // create Scanner class object
	      scan = new Scanner(System.in);

	      // take input
	      System.out.print("Enter a String :: ");
	      str = scan.nextLine();

	      // convert String to upperCase
	      str = str.toUpperCase();

	      // HashSet collection
	      vowels = new HashSet<Character>();
	      consonants = new HashSet<Character>();

	      // check each character
	      for(int i=0; i<str.length(); i++) {
	         ch = str.charAt(i);

	         // check it is alphabet or not
	         if(ch >= 'A' && ch <= 'Z') {

	            // check vowel or consonant
	            if( checkVowel(ch) ) {
	               vowels.add(ch);
	            } else {
	               consonants.add(ch);
	            }
	         }
	      }

	      // display results
	      System.out.println("Vowels :: " + vowels);
	      System.out.println("Consonants :: " + consonants);

	      // close Scanner object
	      scan.close();		
	   }

	   private static boolean checkVowel(char ch) {
	      if(ch == 'A' || ch == 'E' || ch == 'I'
	            || ch == 'O' || ch == 'U')
	      return true;
	      return false; // else return false;
	}
}
