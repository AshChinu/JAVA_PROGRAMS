package Test_Programs;

public class Sum_of_Numbers_in_a_String
{
	static int solve(String str, int i, int n) {
	    // if string is empty
	    if (i >= n)
	      return 0;
	 
	    // if on the last index
	    if (i == n - 1) {
	 
	      // if last digit is numeric
	      if (Character.isDigit(str.charAt(i))) {
	        return str.charAt(i) - '0';
	      }
	      else {
	        return 0;
	      }
	    }
	 
	    // if current char is digit
	    // then sum the consecutive digits
	    if (Character.isDigit(str.charAt(i))) {
	 
	      // declared an empty string
	      String temp = "";
	      int j;
	 
	      // start from that index
	      // sum all the consecutive digits
	      for (j = i; j < n; j++) {
	 
	        // if current char is digit
	        // add it to the temp string
	        if (Character.isDigit(str.charAt(j)))
	          temp += str.charAt(j);
	 
	        // if it is not a digit
	        // break instantly
	        else
	          break;
	      }
	 
	      // add the number associated to temp
	      // with the answer recursion will bring
	      return Integer.parseInt(temp) + solve(str, j, n);
	    }
	 
	    // else call from the next index
	    else {
	      return solve(str, i + 1, n);
	    }
	  }
	 
	  static int findSum(String str) {
	    // recursiven function
	    return solve(str, 0, str.length());
	  }
	 
	  // Driver code
	  public static void main(String[] args) {
	    // input alphanumeric string
	    String str = "Selenium45Automation78Java56";
	 
	    // Function call
	    System.out.println(findSum(str));
	  }
}
