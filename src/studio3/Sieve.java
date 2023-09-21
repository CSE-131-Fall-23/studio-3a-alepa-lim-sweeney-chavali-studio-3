package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = in.nextInt();
		int [][] initial = new int [n][10];
		for (int row = 0; row < n; row++)
		{
			   for (int col = 1; col < 11; col++)
			   {
				  initial [row][col] = (col+1);
				  initial [row][col] = row + 1;
				  
				 
		}
			   System.out.println(initial[row][col]);
		}
	}
}
