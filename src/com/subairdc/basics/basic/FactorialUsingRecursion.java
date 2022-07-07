package com.subairdc.basics.basic;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		
		//Find the Factorial of the given number(Using Recursion)
		
		int num, fact=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		fact = factorial(num);
		
		System.out.println("Factorial of the given number is: "+ fact);
		
	}

	private static int factorial(int num) {
		
		if(num==0) {
			return 1;
		}else {
			int ans = num * factorial(num-1);
			//System.out.println(ans);
			return ans;
		}
	
		
	}

}
