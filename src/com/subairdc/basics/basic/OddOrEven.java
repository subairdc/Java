package com.subairdc.basics.basic;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		//Find the given int is Odd or even:
		
		System.out.print("Enter The number: ");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		checkOddOrEven(number);

	}

	private static void checkOddOrEven(int number) {
		
		if(number%2 == 0) {
			System.out.println("The Given Number "+ number +" is Even Number");
		}else
			System.out.println("The Given Number "+ number +" is Odd Number");
		
	}

}
