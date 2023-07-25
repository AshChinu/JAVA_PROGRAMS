package Test_Programs;

public class Code_Point_Count {

	public static void main(String[] args)
	{
		String str = "Ashwini Mohanty";
		System.out.println("Given String : "+str);
		int c = str.codePointCount(1, 10);
		System.out.println("Codepoint Count : "+c);
		

	}

}
