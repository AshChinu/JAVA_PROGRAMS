package Test_Programs;

public class Prime_Number_1_to_N_declaredByUser
{
	//function to check if a given number is prime
    static boolean isPrime(int n){
         //since 0 and 1 is not prime return false.
         if(n==1||n==0)return false;
  
         //Run a loop from 2 to n-1
         for(int i=2; i<n; i++){
           // if the number is divisible by i, then n is not a prime number.
               if(n%i==0)return false;
         }
         //otherwise, n is prime number.
         return true;
   }
    

   // Driver code
   public static void main (String[] args)
   {
       int N = 19;
       //check for every number from 1 to N
       for(int i=1; i<=N; i++){
           //check if current number is prime
           if(isPrime(i)) {
               System.out.print(i + " ");
           }
       }

   }
}


