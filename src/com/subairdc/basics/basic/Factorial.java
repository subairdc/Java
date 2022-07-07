package com.subairdc.basics.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//Find the Factorial of the given number
		
		int num,fact=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of the given number is :" + fact);
		
	}

}
