package Test_Programs;

import java.util.Scanner;

public class Transpose_A_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Rows You Want?");
		int r = sc.nextInt();
		System.out.println("Enter How Many Columns You Want?");
		int c = sc.nextInt();
		int[][] matA = new int[r][c];
		System.out.println("Enter " +(r*c)+ " values:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				matA[i][j]=sc.nextInt();
		}
		System.out.println("Original Matrix Is:");
		for(int i=0;i<r;i++)
		{ 
			for(int j=0;j<c;j++)
			{
				System.out.print(matA[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix Is:");
		for(int i=0;i<c;i++)
		{ 
			for(int j=0;j<r;j++)
			{
				System.out.print(matA[j][i]+"\t");
			}
			System.out.println();
		}
	}
}

// Result:
/*
Enter How Many Rows You Want?
3
Enter How Many Columns You Want?
2
Enter 6 values:
1 2 3 4 5 6 
Original Matrix Is:
1	2	
3	4	
5	6	
Transpose Matrix Is:
1	3	5	
2	4	6 
 */



