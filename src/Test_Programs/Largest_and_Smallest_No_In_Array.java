package Test_Programs;
import java.util.Comparator;
import java.util.stream.Stream;

public class Largest_and_Smallest_No_In_Array
{
	public static void main(String[] args)
	{
		// Getting Largest Number
		Integer maxnum = Stream.of(1,25,21,87,96,23,46,5,3,84).max
				(Comparator.comparing(Integer::valueOf)).get();
		
		// Getting Smallest Number
		Integer minnum = Stream.of(1,25,21,87,96,23,46,5,3,84).min
				(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("Largest Number is: "+maxnum);
		System.out.println("Smallest Number is: "+minnum);
	}
}

// Result : Largest Number is: 96
//        : Smallest Number is: 1