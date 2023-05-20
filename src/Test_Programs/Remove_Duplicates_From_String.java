package Test_Programs;

import java.util.LinkedHashSet;

public class Remove_Duplicates_From_String
{
    //Create removeDuplicates() method for removing duplicates using LinkedHashSet  
	static void removeDuplicates(String str)
	{        
		//Create LinkedHashSet of type character   
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
        //Add each character of the string into LinkedHashSet
		for (int i=0;i<str.length();i++)
			set.add(str.charAt(i));
		
        // print the string after removing duplicate characters  
		for (Character ch : set)
			System.out.print(ch);
	}
    //main() method start to execute
	public static void main(String[] args)
	{
        //Create string variable with default value 
		String str = "Ashwini";
		
        //Then call the removeDuplicates() method by passing the string as an argument 
		removeDuplicates(str);	
	}
}
