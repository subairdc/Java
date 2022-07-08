package com.subairdc.basics.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		//Check the given number is prime or not
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		
		primeNumber(num);

	}

	private static void primeNumber(int num) {
		
		boolean flag =true;
		
		int m = num/2;
		
		if(num == 0 || num<0) {
			System.out.println("The given number "+ num + " is not prime");
		}
		if(num == 1)
			System.out.println("The given number "+ num + " is a prime");
		
		for(int i=2; i<=m; ++i) {
			if(num%i == 0) {
				System.out.println("The given number "+ num + " is not prime");
				flag = false;
				break;
			}
		}
		
		if(flag == true)
			System.out.println("The given number "+ num + " is a prime");
	}

}
