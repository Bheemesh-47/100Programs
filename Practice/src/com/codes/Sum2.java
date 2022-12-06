package com.codes;

class Sum2
{
	static void findSum(int a, int d, int n)
	{

		int curr_term =a;
		int sum = 0;
		
		for (int i = 1; i <= n; i++)
		{ 
			sum = sum + curr_term;
		}
		
		System.out.println(sum);
	}

	// Driver code
	public static void main(String[] args)
	{
		// starting number
		int a = 1;

		// Common difference
		int d = 1;

		// N th term to be find
		int n = 10;

		findSum(a, d, n);
	}
}
