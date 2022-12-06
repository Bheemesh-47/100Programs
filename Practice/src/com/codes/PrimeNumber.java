package com.codes;

public class PrimeNumber{ 
	static boolean isPrime(int num)
	{
		boolean flag = true;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for nonprime number
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag==true)
			return true;
		else
			return false;
	}
public static void main(String args[]){    
	boolean prime = isPrime(112);
	if(prime==true)
	{
		System.out.println("Number is prime");
	}
	else
	{
		System.out.println("Given Number is not prime");
	}
}    
}   