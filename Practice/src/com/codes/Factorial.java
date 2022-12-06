package com.codes;

public class Factorial {
	
	private static int num;
	private static int factorial;
	public static void fact(int n)
	{
		 num = n;
         factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial = factorial * i;
        }
	}
	public static void main(String[] args) {
		
		fact(10);
        System.out.println("Factorial of "+num+" is : "+factorial);
	}
}
