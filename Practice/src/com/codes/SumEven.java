package com.codes;

public class SumEven {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if((i^1) == (i+1))
			{
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
