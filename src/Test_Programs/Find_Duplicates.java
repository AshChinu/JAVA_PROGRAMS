package Test_Programs;

public class Find_Duplicates {

	public static void main(String[] args)
	{
		String str = "ADFSAS";
		int count;
		char string[]= str.toCharArray();
		System.out.println("Duplicate Character in Given String is");
		for(int i=0;i<str.length();i++)
		{
			count =1;
			for(int j=i+1;j<str.length();j++)
			{
				if(string[i]==string[j]&&string[i] !=' ')
				{
					count++;
					string[j]='0';		
				}
			}
			if(count>1&&string[i]!='0')
				System.out.println(string[i]);
		}
	}
}


