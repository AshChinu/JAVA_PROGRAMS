package Test_Programs;

import java.util.HashMap;
import java.util.Map;

public class Char_Count_a4b3c2d1
{
	public static void getCharCount(String name)
	{
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for (char c : strArray)
		{
			if (charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c) + 1);
			}
			else
			{
				charmap.put(c, 1);
			}
		}
		System.out.println(name+charmap);
	}

	public static void main(String[] args)
	{
		getCharCount("aaabbbccdddeab");
	}
}

// Answer is:- ( aaabbbccdddeab{a=4, b=4, c=2, d=3, e=1} )