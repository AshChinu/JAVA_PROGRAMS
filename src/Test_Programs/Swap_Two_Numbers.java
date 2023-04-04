package Test_Programs;

public class Swap_Two_Numbers {

	public static void main(String[] args)
	{
		int a=10, b=20;
		System.out.println("Before Swapping Values are: "+a+" "+b);
		
		/*  // Logic-1  Using third variable
		int t = a;
		a=b;
		b=t;
		System.out.println("After Swapping Values are: "+a+" "+b);*/
        
		/*  // Logic-2  Use (+) & (-) without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Values are: "+a+" "+b);*/
		
		/* // Logic-3  Use (*) & (/) without using third variable
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping Values are: "+a+" "+b);*/
		
		/* // Logic-4  bitwise XOR (^)  
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping Values are: "+a+" "+b);*/
		
		/* // Logic-5  In Single Statement
		b=a+b-(a=b);
		System.out.println("After Swapping Values are: "+a+" "+b);*/
		
	}

}
